/**
 * 
 */
package com.whu.cms.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * @author hongliang
 *
 */
public class EnumUtils {
	/**
	 * ��ö���е�ֵת��Ϊһ�������б�
	 * @param clz
	 * @return
	 */
	public static List<Integer> enum2Ordinal(Class<? extends Enum> clz) {
		if(!clz.isEnum()) return null;
		Enum[] enums = clz.getEnumConstants();
		List<Integer> rels = new ArrayList<Integer>();
		for(Enum en:enums) {
			rels.add(en.ordinal());
		}
		return rels;
	}
	/**
	 * ��ö���е�ֵת��Ϊ��Ӧ�������ַ����б�
	 * @param clz
	 * @return
	 */
	public static List<String> enum2Name(Class<? extends Enum> clz) {
		if(!clz.isEnum()) return null;
		Enum[] enums = clz.getEnumConstants();
		List<String> rels = new ArrayList<String>();
		for(Enum en:enums) {
			rels.add(en.name());
		}
		return rels;
	}
	/**
	 * ��ö���е�ֵת��Ϊ��ź����Ƶ�map
	 * @param clz
	 * @return
	 */
	public static Map<Integer,String> enum2BasicMap(Class<? extends Enum> clz) {
		if(!clz.isEnum()) return null;
		Enum[] enums = clz.getEnumConstants();
		Map<Integer,String> rels = new HashMap<Integer,String>();
		for(Enum en:enums) {
			rels.put(en.ordinal(),en.name());
		}
		return rels;
	}
	/**
	 * ��ö���е�ֵ��ĳ������ת��Ϊ�ַ����б�
	 * @param clz
	 * @param propNameĳ������ֵ
	 * @return
	 */
	public static List<String> enumProp2List(Class<? extends Enum> clz,String propName) {
		if(!clz.isEnum()) return null;
		try {
			Enum[] enums = clz.getEnumConstants();
			List<String> rels = new ArrayList<String>();
			for(Enum en:enums) {
				rels.add((String)PropertyUtils.getProperty(en, propName));
			}
			return rels;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ��ö���е�ֵ��ĳ������ת��Ϊ��ź��ַ����б�
	 * @param clz
	 * @param propNameĳ������ֵ
	 * @return
	 */
	public static Map<Integer,String> enumProp2OrdinalMap(Class<? extends Enum> clz,String propName) {
		if(!clz.isEnum()) return null;
		try {
			Enum[] enums = clz.getEnumConstants();
			Map<Integer,String> rels = new HashMap<Integer,String>();
			for(Enum en:enums) {
				rels.put(en.ordinal(),(String)PropertyUtils.getProperty(en, propName));
			}
			return rels;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ��ö���е�ֵ��ĳ������ת��Ϊ���ƺ��ַ���map
	 * @param clz
	 * @param propNameĳ������ֵ
	 * @return
	 */
	public static Map<String,String> enumProp2NameMap(Class<? extends Enum> clz,String propName) {
		if(!clz.isEnum()) return null;
		try {
			Enum[] enums = clz.getEnumConstants();
			Map<String,String> rels = new HashMap<String,String>();
			for(Enum en:enums) {
				rels.put(en.name(),(String)PropertyUtils.getProperty(en, propName));
			}
			return rels;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ��ö���е���������ת��Ϊmap
	 * @param clz
	 * @param keyProp Ҫת����key����������
	 * @param valueProp Ҫת����value����������
	 * @return
	 */
	public static Map<String,String> enumProp2Map(Class<? extends Enum> clz,String keyProp,String valueProp) {
		if(!clz.isEnum()) return null;
		try {
			Enum[] enums = clz.getEnumConstants();
			Map<String,String> rels = new HashMap<String,String>();
			for(Enum en:enums) {
				rels.put((String)PropertyUtils.getProperty(en,keyProp),(String)PropertyUtils.getProperty(en,valueProp));
			}
			return rels;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
