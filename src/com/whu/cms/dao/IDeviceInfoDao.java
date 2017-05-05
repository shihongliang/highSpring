package com.whu.cms.dao;

import java.util.List;
import java.util.Map;

import com.whu.basic.dao.IBaseDao;
import com.whu.cms.model.DeviceInfo;
import com.whu.cms.model.NLine;
import com.whu.cms.model.TLine;

public interface IDeviceInfoDao extends IBaseDao<DeviceInfo> {

	public List<DeviceInfo> generateChart();
	
	public TLine generateNewChart();
	
}
