
package com.whu.cms.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.whu.basic.dao.BaseDao;
import com.whu.cms.model.DeviceInfo;
import com.whu.cms.model.NLine;
import com.whu.cms.model.TLine;

@Repository("deviceInfoDao")
public class DeviceInfoDao extends BaseDao<DeviceInfo> implements IDeviceInfoDao{

	@Override
	public List<DeviceInfo> generateChart() {
		String hql="select startdate,data  from t_deviceInfo";
		List<DeviceInfo> dlist=this.listBySql(hql, DeviceInfo.class, false);
		
		return dlist;
	}

	
	@Override
	public TLine generateNewChart() {
		String hql="select startdate,data,ua  from t_deviceInfo";
		//�����ݿ��ȡ����
		List<DeviceInfo> dlist=this.listBySql(hql, DeviceInfo.class, false);
		List<NLine> llist=new ArrayList<NLine>();
		
	/*	Map<String ,List<? extends Object>> map=new HashMap<String,List<? extends Object>>();*/
		//��ʾ��ѹ1����
		List<Float>   datalist=new ArrayList<Float>();
		//��ʾ��ѹ2����
		List<Float>   ulist=new ArrayList<Float>();
		//ʱ�䣬��x���
		List<String> startdate=new ArrayList<String>();
		
		for(DeviceInfo  d:dlist)
		{
			
			datalist.add(d.getData());
			ulist.add(d.getUa());
		    startdate.add(d.getStartdate());
		}
		llist.add(new NLine("��ѹ1","#3366cc",datalist));
		llist.add(new NLine("��ѹ2","#8BBC21",ulist));

		

		 return new TLine("��ѹ�������Ʊ�", "��ѹ (V)", "����", startdate, llist);
	}
	
}
