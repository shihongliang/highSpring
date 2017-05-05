/**
 * 
 */
package com.whu.cms.web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author hongliang
 *
 */
public class CmsSessionListener implements HttpSessionListener {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		
		
    	CmsSessionContext.addSession(event.getSession());
		System.out.println("¥Ê¥¢¡Àsession: "+event.getSession().getId());
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		
		CmsSessionContext.removeSession(event.getSession());
		System.out.println("“∆≥˝¡Àsession: "+event.getSession().getId());
	}
	
	
	
}
