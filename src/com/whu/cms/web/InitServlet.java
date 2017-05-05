/**
 * 
 */
package com.whu.cms.web;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author hongliang
 *
 */
public class InitServlet extends HttpServlet{
	
	private static WebApplicationContext wc;
	
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		//��ʼ��spring�Ĺ���
		wc=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//��ʼ��Ȩ����Ϣ
		
		System.out.println("-----ϵͳ��ʼ���ɹ�-------");
		
		
	}
	
	public static WebApplicationContext getWc()
	{
		
		return wc;
	}
	
}
