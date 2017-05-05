# highSpring
springmvc +highcharts demo

这个是阳江项目中用到的数据统计自己搭建的一个demo测试，框架是springmvc，hibernate，以及highcharts图表显示


同时，这个里面还有堆糖的测试题，测试题答题内容在DTController.java中，在controler文件夹中，显示内容如下：

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

启动Tomcat服务，输入：http://localhost:8080/highSpring/answer/l=1,7,3,4 页面会跳转出现测试结果


