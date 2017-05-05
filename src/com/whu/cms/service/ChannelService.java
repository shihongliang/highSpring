/**
 * 
 */
package com.whu.cms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.whu.cms.dao.IChannelDao;
import com.whu.cms.model.ChannelTree;

/**
 * @author hongliang
 *
 */
@Service("channelService")
public class ChannelService implements IChannelService{

	
	private IChannelDao channelDao;
	
	/**
	 * @return the channelDao
	 */
	public IChannelDao getChannelDao() {
		return channelDao;
	}



	/**
	 * @param channelDao the channelDao to set
	 */
	@Inject
	public void setChannelDao(IChannelDao channelDao) {
		this.channelDao = channelDao;
	}



	@Override
	public List<ChannelTree> generateTree() {
	
		return channelDao.generateTree();
	}
	
	
	
}
