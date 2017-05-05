/**
 * 
 */
package com.whu.cms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hongliang
 *堆糖测试题
 */
@Controller
@RequestMapping("/answer/")
public class DTController {
	
	@RequestMapping(value="l={id}",method=RequestMethod.GET)
	public String inComma(@PathVariable String id,Model model){
		
		//计算总的计算值
		int product=1;
		//获取参数进行分割
		String[] sids=id.split(",");
		
		List<Integer> list=new ArrayList<Integer>();
		//转换成integer类型
		for(String s:sids){
			list.add(Integer.parseInt(s));
		}
		
		System.out.println(list);
		//计算总的数值和
		for(int i=0;i<list.size();i++){
			product*=list.get(i);
		}
		System.out.println(product);
		int[] result=new int[list.size()];
		//输出每个的计算结果
		for(int i=0;i<result.length;i++){
			result[i]=product/list.get(i);
			
		}
		//显现在web中
		model.addAttribute("result", result);
	
			
		return "answer/list";
		
	}
	
}
