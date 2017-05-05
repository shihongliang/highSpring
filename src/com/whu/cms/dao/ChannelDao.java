package com.whu.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.whu.basic.dao.BaseDao;
import com.whu.cms.model.Channel;
import com.whu.cms.model.ChannelTree;

@Repository("channelDao")
public class ChannelDao extends BaseDao<Channel> implements IChannelDao{

	/* (non-Javadoc)
	 * @see com.whu.cms.dao.IChannelDao#generateTree()
	 */
	@Override
	public List<ChannelTree> generateTree() {
		String hql="select id,name,pid,icon,url,target from t_channel ";
		List<ChannelTree> cts=this.listBySql(hql, ChannelTree.class, false);
		//¸ù½Úµã
		cts.add(0, new ChannelTree(Channel.ROOT_ID,Channel.ROOT_NAME,-1));
		for(ChannelTree ct:cts)
		{
			if(ct.getPid()==null)
				ct.setPid(0);
		}
		
		
		return cts;
	}
	
	
	
}
