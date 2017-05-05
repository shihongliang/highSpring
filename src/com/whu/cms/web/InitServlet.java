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
		//初始化spring的工厂
		wc=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//初始化权限信息
		
		System.out.println("-----系统初始化成功-------");
		
		
	}
	
	public static WebApplicationContext getWc()
	{
		
		return wc;
	}
	
}
