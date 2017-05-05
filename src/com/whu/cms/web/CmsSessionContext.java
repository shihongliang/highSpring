/**
 * 
 */
package com.whu.cms.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

/**
 * @author hongliang
 *
 */
public class CmsSessionContext {
	
	private static final Map<String,HttpSession> ctx=new HashMap<String,HttpSession>();
	
	private CmsSessionContext(){}
	
	public static void addSession(HttpSession session)
	{
		ctx.put(session.getId(), session);
	}
	
	public static void removeSession(HttpSession session)
	{
		ctx.remove(session);
	}
	
	public static HttpSession getSession(String sessionId)
	{
		
		return ctx.get(sessionId);
	}
	
	
}
