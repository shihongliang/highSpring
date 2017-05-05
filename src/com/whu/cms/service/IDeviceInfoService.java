package com.whu.cms.service;

import java.util.List;

import com.whu.cms.model.DeviceInfo;
import com.whu.cms.model.NLine;
import com.whu.cms.model.TLine;

public interface IDeviceInfoService {
	public List<DeviceInfo> generateChart();
	
	public TLine generateNewChart();
}
