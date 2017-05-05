package com.whu.cms.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.whu.cms.dao.IDeviceInfoDao;
import com.whu.cms.model.DeviceInfo;
import com.whu.cms.model.NLine;
import com.whu.cms.model.TLine;

@Service("deviceInfoService")
public class DeviceImfoService implements IDeviceInfoService{

	private IDeviceInfoDao deviceInfoDao;
	
	public IDeviceInfoDao getDeviceInfoDao() {
		return deviceInfoDao;
	}


	@Inject
	public void setDeviceInfoDao(IDeviceInfoDao deviceInfoDao) {
		this.deviceInfoDao = deviceInfoDao;
	}



	@Override
	public List<DeviceInfo> generateChart() {
		
		return deviceInfoDao.generateChart();
	}


	/* (non-Javadoc)
	 * @see com.whu.cms.service.IDeviceInfoService#generateNewChart()
	 */
	@Override
	public TLine generateNewChart() {
			
		return deviceInfoDao.generateNewChart();
	}
	
	
	
	
	
}
