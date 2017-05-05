package com.whu.cms.dao;

import java.util.List;

import com.whu.basic.dao.IBaseDao;
import com.whu.cms.model.Channel;
import com.whu.cms.model.ChannelTree;
import com.whu.cms.model.DeviceInfo;

public interface IChannelDao extends IBaseDao<Channel>{

	public List<ChannelTree> generateTree();
	

	
}
