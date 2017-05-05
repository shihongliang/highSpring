package com.whu.basic.model;

import java.util.List;

public class Pager<T> {
	//��ҳ�Ĵ�С
	private int size;
	//��ҳ����ʼҳ
	private int offset;
	//�ܼ�·��
	private long total;
	private List<T> datas;
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}
	/**
	 * @return the datas
	 */
	public List<T> getDatas() {
		return datas;
	}
	/**
	 * @param datas the datas to set
	 */
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	/**
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
		this.total = total;
	}
	
}
