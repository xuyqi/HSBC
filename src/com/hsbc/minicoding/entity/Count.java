package com.hsbc.minicoding.entity;

import java.util.HashMap;
import java.util.Map;
/** 	
 * count:总数
 * first：第一个要计算倍数的数字
 * second：第二个要计算倍数的数字
 * @author MRX
 *
 */
public class Count {
	private int count;
	private int first;
	private int second;
	
	public Count(){}
	public Count(int count,int first,int second){
		super();
		this.count = count;
		this.first = first;
		this.second = second;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
}
