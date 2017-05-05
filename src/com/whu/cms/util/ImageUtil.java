/**
 * 
 */
package com.whu.cms.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;


/**
 * @author hongliang
 *
 */
public class ImageUtil {
	private final static ImageUtil iu = new ImageUtil();
	private ImageUtil(){
		
	}
	
	public static ImageUtil getInstance() {
		return iu;
	}
	/**
	 * �и�ͼƬ
	 * @param os �и��������
	 * @param is ������
	 * @param type �ļ���ͼƬ����
	 * @param x x����
	 * @param y y����
	 * @param width ���
	 * @param height �߶�
	 */
	public void cropImg(OutputStream os,InputStream is,String type,int x,int y,int width,int height) {
		Image img = null;
		BufferedImage imgBuf = null;
		ImageFilter cropFilter = null;
		try {
			imgBuf = ImageIO.read(is);
			cropFilter = new CropImageFilter(x,y,width,height);
			img = Toolkit.getDefaultToolkit().
					createImage(new FilteredImageSource(imgBuf.getSource(), cropFilter)); 
			BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			tag.getGraphics().drawImage(img, 0, 0, null);
			ImageIO.write(tag, type, os); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(is!=null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
/**
 * �и�ͼƬ
 * @param os �и��������
 * @param is ������
 * @param type �ļ���ͼƬ����
 * @param x x����
 * @param y y����
 * @param width ���
 * @param height �߶�
 */
public String cropImg(String oPath,InputStream is,int x,int y,int width,int height) {
	String type = oPath.substring(oPath.lastIndexOf(".")+1);
	try {
		OutputStream os = new FileOutputStream(oPath);
		cropImg(os, is,type,x, y, width, height);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return null;
}

/**
 * �и�ͼƬ
 * @param oPath ����ļ�
 * @param iPath �����ļ���
 * @param type �ļ���ͼƬ����
 * @param x x����
 * @param y y����
 * @param width ���
 * @param height �߶�
 */
public String cropImg(String oPath,String iPath,int x,int y,int width,int height) {
	String type = oPath.substring(oPath.lastIndexOf(".")+1);
	try {
		OutputStream os = new FileOutputStream(oPath);
		InputStream is = new FileInputStream(iPath);
		cropImg(os, is,type,x, y, width, height);
		return oPath;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return null;
}

/**
 * �и�ͼƬ�Զ�����������ļ���ת��Ϊxxx_small.type
 * @param iPath �����ļ���
 * @param type �ļ���ͼƬ����
 * @param x x����
 * @param y y����
 * @param width ���
 * @param height �߶�
 */
public String cropImg(String iPath,int x,int y,int width,int height) {
	String type = iPath.substring(iPath.lastIndexOf(".")+1);
	String sname = generatorSmallFileName(iPath);
	try {
		InputStream is = new FileInputStream(iPath);
		OutputStream os = new FileOutputStream(sname);
		cropImg(os, is,type,x, y, width, height);
		return sname;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return null;
}

private String generatorSmallFileName(String name) {
	String fn = name.substring(0,name.lastIndexOf("."));
	return name.replace(fn,fn+"_small");
}
	
	/**
	 * ת��ͼƬ����
	 * @param os Ҫת��ͼƬ�������
	 * @param is Ҫת��ͼƬ��������
	 * @param width Ҫѹ���Ŀ��
	 * @param height Ҫѹ���ĸ߶�
	 * @param proportion �Ƿ���еȱ���ѹ��
	 * @throws IOException 
	 */
	public void compressImg(OutputStream os,InputStream is,int width,int height,boolean proportion ) {
		compressImg(os, is, width, height, proportion,false);
	}
	
	/**
	 * ת��ͼƬ����
	 * @param os Ҫת��ͼƬ�������
	 * @param is Ҫת��ͼƬ��������
	 * @param width Ҫѹ���Ŀ��
	 * @param height Ҫѹ���ĸ߶�
	 * @param proportion �Ƿ���еȱ���ѹ��
	 * @param magnify �Ƿ���зŴ�
	 * @throws IOException 
	 */
	public void compressImg(OutputStream os,InputStream is,int width,int height,boolean proportion,boolean magnify) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(is);
			System.out.println(img);
			int newWidth; int newHeight; 
			int oldWidth = img.getWidth(null);
			int oldHeight = img.getHeight(null);
			boolean isWrite = false;
			if(!magnify) {
				boolean iw = width>=height?true:false;
				if(iw) {
					if(width>oldWidth) isWrite = true;
				} else {
					if(height>oldHeight) isWrite = true;
				}
//				System.out.println(width+","+height);
//				System.out.println(img.getWidth(null)+","+img.getHeight(null));
				if(isWrite) {
					System.out.println("write");
					ImageIO.write(img,"jpg", os);
					os.flush();
				}
//				System.out.println(newWidth+","+newHeight);
			}
			if(!isWrite) {
				// �ж��Ƿ��ǵȱ�����  
				if (proportion) {  
					// Ϊ�ȱ����ż��������ͼƬ��ȼ��߶�  
					double rate1 = ((double) oldWidth) / (double) width + 0.1;  
					double rate2 = ((double) oldHeight) / (double) height + 0.1; 
					System.out.println((rate1+","+rate2));
					// �������ű��ʴ�Ľ������ſ���  
					double rate = rate1 < rate2 ? rate1 : rate2;  
					newWidth = (int) (((double) img.getWidth(null)) / rate);  
					newHeight = (int) (((double) img.getHeight(null)) / rate);  
				} else {  
					newWidth = width; // �����ͼƬ���  
					newHeight = height; // �����ͼƬ�߶�  
				}
				BufferedImage tag = new BufferedImage((int) newWidth, (int) newHeight, BufferedImage.TYPE_INT_RGB);
				tag.getGraphics().drawImage(img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);  
				//JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
			
				//encoder.encode(tag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(is!=null) is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ת��ͼƬ����
	 * @param outputFile ����ļ�
	 * @param inputFile �����ļ�
	 * @param width Ҫѹ���Ŀ��
	 * @param height Ҫѹ���ĸ߶�
	 * @param proportion �Ƿ���еȱ���ѹ��
	 * @throws IOException 
	 */
	public String compressImg(File outputFile, File inputFile,int width,int height,boolean proportion ) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(inputFile);
			os = new FileOutputStream(outputFile);
			compressImg(os, is, width, height, proportion);
			return outputFile.getAbsolutePath();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ת��ͼƬ����
	 * @param outputFile ����ļ�
	 * @param is ������
	 * @param width Ҫѹ���Ŀ��
	 * @param height Ҫѹ���ĸ߶�
	 * @param proportion �Ƿ���еȱ���ѹ��
	 * @throws IOException 
	 */
	public String compressImg(File outputFile, InputStream is,int width,int height,boolean proportion ) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(outputFile);
			compressImg(os, is, width, height, proportion);
			return outputFile.getAbsolutePath();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ת��ͼƬ����
	 * @param oPath ���·��
	 * @param is ������
	 * @param width Ҫѹ���Ŀ��
	 * @param height Ҫѹ���ĸ߶�
	 * @param proportion �Ƿ���еȱ���ѹ��
	 * @throws IOException 
	 */
	public String compressImg(String oPath, InputStream is,int width,int height,boolean proportion ) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(oPath);
			compressImg(os, is, width, height, proportion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return oPath;
	}
	
	/**
	 * ת��ͼƬ����
	 * @param oPath ���·��
	 * @param iPath ����·��
	 * @param width Ҫѹ���Ŀ��
	 * @param height Ҫѹ���ĸ߶�
	 * @param proportion �Ƿ���еȱ���ѹ��
	 * @throws IOException 
	 */
	public String compressImg(String oPath, String iPath,int width,int height,boolean proportion ) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(iPath);
			os = new FileOutputStream(oPath);
			compressImg(os, is, width, height, proportion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return oPath;
	}
	
	
	
	public int getWidth(InputStream is) throws IOException {
		BufferedImage img = null;
		img = ImageIO.read(is);
		return img.getWidth(null);
	}
	
	public int getWidth(String path) {
		InputStream is = null;
		try {
			is = new FileInputStream(path);
			return getWidth(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getWidth(File file) {
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			return getWidth(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getHeight(InputStream is) throws IOException {
		BufferedImage img = null;
		img = ImageIO.read(is);
		return img.getHeight(null);
	}
	
	public int getHeight(String path) {
		InputStream is = null;
		try {
			is = new FileInputStream(path);
			return getHeight(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getHeight(File file) {
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			return getHeight(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * ����һ�����飬��һ��ֵ�ǿ��ڶ���ֵ�Ǹ�
	 * @param is
	 * @return ����һ�����飬��һ��ֵ�ǿ��ڶ���ֵ�Ǹ�
	 * @throws IOException
	 */
	public int[] getWidthAndHeight(InputStream is) throws IOException {
		Image img = null;
		img = ImageIO.read(is);
		return new int[]{img.getWidth(null),img.getHeight(null)};
	}
	/**
	 * ����һ�����飬��һ��ֵ�ǿ��ڶ���ֵ�Ǹ�
	 * @param is
	 * @return ����һ�����飬��һ��ֵ�ǿ��ڶ���ֵ�Ǹ�
	 * @throws IOException
	 */
	public int[] getWidthAndHeight(String path) {
		InputStream is = null;
		try {
			is = new FileInputStream(path);
			return getWidthAndHeight(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * ����һ�����飬��һ��ֵ�ǿ��ڶ���ֵ�Ǹ�
	 * @param is
	 * @return ����һ�����飬��һ��ֵ�ǿ��ڶ���ֵ�Ǹ�
	 * @throws IOException
	 */
	public int[] getWidthAndHeight(File file) {
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			return getWidthAndHeight(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
