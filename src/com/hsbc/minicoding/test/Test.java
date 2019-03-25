package com.hsbc.minicoding.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.hsbc.minicoding.dao.imp.NumberSayerimp;
import com.hsbc.minicoding.entity.Count;

import junit.framework.TestCase;
/**
 * 测试案例以给出题目的100人，特殊的倍数数字为3和5时
 * @author MRX
 *
 */
public class Test extends TestCase {
	public void test(){
		Count co = new Count(100, 3, 5);
		NumberSayerimp nsi = new NumberSayerimp();
		List<String> result = nsi.getResult(co.getCount(),co);
		for(String list:result){
			System.out.println(list);
		}
	}
	
}
