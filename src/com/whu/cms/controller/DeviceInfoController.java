package com.whu.cms.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whu.cms.model.DeviceInfo;
import com.whu.cms.model.TLine;
import com.whu.cms.service.IDeviceInfoService;

@Controller
@RequestMapping("/device")
public class DeviceInfoController {
	
	private IDeviceInfoService deviceInfoService;

	public IDeviceInfoService getDeviceInfoService() {
		return deviceInfoService;
	}
	@Inject
	public void setDeviceInfoService(IDeviceInfoService deviceInfoService) {
		this.deviceInfoService = deviceInfoService;
	}
	
/*	@RequestMapping("/chart")
	public @ResponseBody List<DeviceInfo> generateLineChart()
	{
		
		return deviceInfoService.generateChart();
	}*/
	
	/*
	 * 到折线图1，根据数据库对应来的
	 */
	
	@RequestMapping("/2")
	public String lineChart(Model model)
	{
		System.out.println("1");
		return "admin/lineChart";
		
	}
	
	
	@RequestMapping("/newline")
	public String newline() {
	
		return "admin/newline";
	}
	/*
	 * 显示两根线的,json数据
	 */
	@RequestMapping("/line")
	public @ResponseBody TLine generateNEWLine()
	{
		
		return deviceInfoService.generateNewChart();
	}
	
	
	
}
