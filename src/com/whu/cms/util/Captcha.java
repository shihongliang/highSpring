/**
 * 
 */
package com.whu.cms.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author hongliang
 *
 */
public class Captcha {
	
	private int height;
	private int width;
	private int num;
	private String code;
	private static final Random ran=new Random();
	
	private static Captcha captcha;
	
	private  Captcha(){
		code="0123456789";
		num=4;
	}
	
	public static  Captcha getInstance()
	{
		if(captcha==null)
			captcha=new Captcha();
		return captcha;
	}
	
	public void set(int width,int height,int num,String code) {
		this.width = width;
		this.height = height;
		this.setNum(num);
		this.setCode(code);
	}
	
	public void set(int width,int height) {
		this.width = width;
		this.height = height;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	public String generateCheckcode()
	{
		StringBuffer cc = new StringBuffer();
		for(int i=0;i<num;i++) {
			cc.append(code.charAt(ran.nextInt(code.length())));
		}
		return cc.toString();
	}
	public BufferedImage generateCheckImg(String checkcode) {
		//����һ��ͼƬ����
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//��ȡͼƬ����Ļ���
		Graphics2D graphic = img.createGraphics();
		graphic.setColor(Color.WHITE);
		graphic.fillRect(0, 0, width, height);
		graphic.setColor(Color.BLACK);
		graphic.drawRect(0, 0, width-1, height-1);
		Font font = new Font("����",Font.BOLD+Font.ITALIC,(int)(height*0.8));
		graphic.setFont(font);
		for(int i=0;i<num;i++) {
			graphic.setColor(new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255)));
			graphic.drawString(String.valueOf(checkcode.charAt(i)), i*(width/num)+4, (int)(height*0.8));
		}
		
		//��һЩ��
		for(int i=0;i<(width+height);i++) {
			graphic.setColor(new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255)));
			graphic.drawOval(ran.nextInt(width), ran.nextInt(height), 1, 1);
		}
		
		//��һЩ��
		for(int i=0;i<4;i++) {
			graphic.setColor(new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255)));
			graphic.drawLine(0, ran.nextInt(height), width, ran.nextInt(height));
		}
		return img;
	}
	
}
