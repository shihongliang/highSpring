package com.whu.basic.dao;

public interface IBaseDao<T> {
	
	//��Ӷ���
	public T add(T t);
	
	//���¶���
	public void update(T t);
	//����idɾ������
	public void delete(int id);
	
	//����id���ض���
	public T load(int id);
	
	
	
}
