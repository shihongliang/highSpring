package com.whu.cms.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whu.cms.model.ChannelTree;
import com.whu.cms.model.DeviceInfo;
import com.whu.cms.service.IChannelService;
import com.whu.cms.service.IDeviceInfoService;

@Controller
@RequestMapping("/admin")
public class AdiminController {
	
	private IDeviceInfoService deviceInfoService;
	private IChannelService channelService;

	/**
	 * @return the channelService
	 */
	public IChannelService getChannelService() {
		return channelService;
	}
	/**
	 * @param channelService the channelService to set
	 */
	@Inject
	public void setChannelService(IChannelService channelService) {
		this.channelService = channelService;
	}
	public IDeviceInfoService getDeviceInfoService() {
		return deviceInfoService;
	}
	@Inject
	public void setDeviceInfoService(IDeviceInfoService deviceInfoService) {
		this.deviceInfoService = deviceInfoService;
	}
	

	@RequestMapping("/")
	public String homeMenu()
	{
		return "admin/home";
	}
	
	
	@RequestMapping("/title")
	public String title(Model model) {
		model.addAttribute("title", "HIGHCHARTSÕº±Ì’π æ");
		return "admin/title";
	}
	
	@RequestMapping(value="/left",method=RequestMethod.GET)
	public String left(Model model) 
	{
		System.out.println("------");
		//model.addAttribute("datas", deviceInfoService.findDevice());
		
		return "admin/left";
	}


	@RequestMapping("/change")
	public String change() {
		return "admin/change";
	}
	
	@RequestMapping("/menu")
	public String menu()
	{
		return "admin/loading";
	}
	@RequestMapping("/loading")
	public String loading() {
	
		
		return "admin/loading";
	}
	
	@RequestMapping("/alermStation")
	public String alermStation() {
	
		return "admin/alermStation";
	}


	@RequestMapping("/alermDevice")
	public String alermDevice() {
	
		return "admin/alermDevice";
	}
	

	@RequestMapping("/chart")
	public @ResponseBody List<DeviceInfo> generateLineChart()
	{
		
		return deviceInfoService.generateChart();
	}
	
	@RequestMapping("/treeAll")
	public  @ResponseBody List<ChannelTree> generateTree()
	{
		return channelService.generateTree();
	}
	
	
}
