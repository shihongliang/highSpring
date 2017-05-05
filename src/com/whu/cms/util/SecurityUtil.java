/**
 * 
 */
package com.whu.cms.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author hongliang
 *
 */
public class SecurityUtil {
	
	public static String md5(String password) throws Exception
	{
		MessageDigest md=MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		
		return new BigInteger(1,md.digest()).toString();
		
	}
	
	public static String md5(String username,String password) throws Exception
	{
		MessageDigest md=MessageDigest.getInstance("MD5");
		md.update(username.getBytes());
		md.update(password.getBytes());
	//md.update((username+password).getBytes());
		
		return new BigInteger(1,md.digest()).toString();
	}
	
	
}
