/**
 * 
 */
package com.whu.test.dao;

import static org.junit.Assert.*;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.dbunit.DatabaseUnitException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate4.SessionHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.whu.basic.model.Pager;
import com.whu.basic.model.SystemContext;
import com.whu.cms.dao.IChannelDao;
import com.whu.cms.dao.IDeviceInfoDao;
import com.whu.cms.model.ChannelTree;
import com.whu.cms.model.DeviceInfo;

import com.whu.test.dbunit.AbstractDbUnitTestCase;
import com.whu.test.dbunit.EntitiesHelper;

import javassist.tools.rmi.ObjectNotFoundException;

/**
 * @author hongliang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/beans.xml")
@TestExecutionListeners({DbUnitTestExecutionListener.class, 
	DependencyInjectionTestExecutionListener.class})
public class TestChannelDao extends AbstractDbUnitTestCase {
	@Inject
	private SessionFactory sessionFactory;
	
	@Inject
	private IChannelDao channelDao;
	
	
	
	@Before
	public void setUp() throws Exception
	{
		//解决延迟加载问题
	/*	Session s = sessionFactory.openSession();
		TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(s));

		this.backupAllTable();
		IDataSet ds = createDateSet("topic");
		ReplacementDataSet rds=new ReplacementDataSet(ds);
		rds.addReplacementObject("null", null);
		DatabaseOperation.CLEAN_INSERT.execute(dbunitCon,rds);*/
		// 解决延迟加载问题
		Session s = sessionFactory.openSession();
		TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(s));

	}
	

	
	

	
	@Test
	public void testChannelDao()
	{
		List<ChannelTree> cts=channelDao.generateTree();
		for(ChannelTree ct:cts)
		{
			System.out.println(ct);
			
		}
		
	}
	

		
	@After
	public void tearDown() throws Exception
	{
		SessionHolder holder = (SessionHolder) TransactionSynchronizationManager.getResource(sessionFactory);
		Session s = holder.getSession(); //从事务中获取session
		s.flush();
		TransactionSynchronizationManager.unbindResource(sessionFactory);
	//	this.resumeTable();
	}


	
	
}
