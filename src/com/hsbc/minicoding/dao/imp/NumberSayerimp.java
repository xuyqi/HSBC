package com.hsbc.minicoding.dao.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hsbc.minicoding.dao.NumberSayer;
import com.hsbc.minicoding.entity.Count;
/**
 * 接口实现类
 * 参数具体意义请参考参口
 * @author MRX
 *
 */
public class NumberSayerimp implements NumberSayer {
	@Override
	//当读取的数字是正常数字时
	public String runNum(int frist,int second,Integer index) {
		// TODO Auto-generated method stub
		String str = null;
		List<String> list = new ArrayList<String>();
		if(index%frist!=0 && index%second!=0){
			 str = index.toString();
		}
		return str;
	}
	@Override
	//当读取的数字是3或5的倍数时
	public String ruleMultiple(int frist,int second,Integer index) {
		// TODO Auto-generated method stub
		String str = null;
		if(index%frist==0 && index%second!=0){
			str = "Fizz";
		}
		if(index%second==0 && index%frist!=0){
			str = "Buzz";

		}
		return str;
	}

	@Override
	//当读取数字即是3的倍数也是5的倍数时
	public String ruleSpecialMul(int frist,int second,Integer index) {
		// TODO Auto-generated method stub
		String str = null;
		if(index%frist==0 && index%second==0){
			str = "FizzBuzz";
		}
		return str;
	}


	@Override
	//获得最终结果
	public List<String> getResult(int number,Count count) {
		// TODO Auto-generated method stub
		String str = null;
		List<String> list = new ArrayList<String>();
		for(int i=1;i<=number;i++){
			str = this.ruleMultiple(count.getFirst(),count.getSecond(),i);
			if(str!=null){
				list.add(str);
				continue;
			}
			str = this.ruleSpecialMul(count.getFirst(),count.getSecond(),i);
			if(str!=null){
				list.add(str);
				continue;
			}
			str = this.runNum(count.getFirst(),count.getSecond(),i);
			if(str!=null){
				list.add(str);
				continue;
			}
		}
		return list;
	}
}
