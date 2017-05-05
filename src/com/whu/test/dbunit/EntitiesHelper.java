/**
 * 
 */
package com.whu.test.dbunit;

import java.util.List;


import com.whu.cms.model.User;

import junit.framework.Assert;

/**
 * @author hongliang
 *
 */
public class EntitiesHelper {
	
	private static User baseUser = new User(1,"admin1","123","admin1","admin1@admin.com","110",1);
	
	public static User getBaseUser()
	{
		return baseUser;
	}
	
	public static void assertUser(User expected,User actual)
	{
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getUsername(), actual.getUsername());
		Assert.assertEquals(expected.getNickname(), actual.getNickname());
		//Assert.assertEquals(expected.getPassword(), actual.getPassword());
		Assert.assertEquals(expected.getPhone(), actual.getPhone());
		Assert.assertEquals(expected.getStatus(), actual.getStatus());
		Assert.assertEquals(expected.getEmail(), actual.getEmail());
		
	}
	
	public static void assertObjects(List<?> expected,List<?> actuals)
	{
		for(int i=0;i<expected.size();i++)
		{
			Object eo=expected.get(i);
			Object ao=expected.get(i);
			Assert.assertEquals(eo, ao);
		}
	}
	
	public static void assertUsers(List<User> expected,List<User> actuals)
	{
		for(int i=0;i<expected.size();i++)
		{
			User eu=expected.get(i);
			User au=actuals.get(i);
			assertUser(eu,au);
			
		}
	}

	
	public static void assertUser(User expected)
	{
		assertUser(expected,baseUser);
		
	}
	
}
