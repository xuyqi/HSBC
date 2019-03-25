package com.hsbc.minicoding.dao;

import java.util.List;
import java.util.Map;

import com.hsbc.minicoding.entity.Count;
/**
 * 对应接口
 * first：第一个计算倍数的数字
 * second：第二个计算倍数的数字
 * index：第几个人喊出的数字
 * @author MRX
 *
 */

public interface NumberSayer {
	//正常输出：
	public String runNum(int first,int second,Integer index);
	//设置倍数：如果是3或5的倍数时输出
	public String ruleMultiple(int first,int second,Integer index);
	//设置特殊倍数：如果同时是3或5的倍数时输出
	public String ruleSpecialMul(int first,int second,Integer index);
	//获取最终结果
	public List<String> getResult(int number,Count count);
}
