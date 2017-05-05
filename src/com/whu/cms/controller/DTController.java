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
 *���ǲ�����
 */
@Controller
@RequestMapping("/answer/")
public class DTController {
	
	@RequestMapping(value="l={id}",method=RequestMethod.GET)
	public String inComma(@PathVariable String id,Model model){
		
		//�����ܵļ���ֵ
		int product=1;
		//��ȡ�������зָ�
		String[] sids=id.split(",");
		
		List<Integer> list=new ArrayList<Integer>();
		//ת����integer����
		for(String s:sids){
			list.add(Integer.parseInt(s));
		}
		
		System.out.println(list);
		//�����ܵ���ֵ��
		for(int i=0;i<list.size();i++){
			product*=list.get(i);
		}
		System.out.println(product);
		int[] result=new int[list.size()];
		//���ÿ���ļ�����
		for(int i=0;i<result.length;i++){
			result[i]=product/list.get(i);
			
		}
		//������web��
		model.addAttribute("result", result);
	
			
		return "answer/list";
		
	}
	
}
