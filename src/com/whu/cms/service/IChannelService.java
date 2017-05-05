/**
 * 
 */
package com.whu.cms.service;

import java.util.List;

import com.whu.cms.model.ChannelTree;

/**
 * @author hongliang
 *
 */
public interface IChannelService {
	

	public List<ChannelTree> generateTree();
	
}
