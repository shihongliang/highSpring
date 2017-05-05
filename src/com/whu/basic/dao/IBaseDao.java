package com.whu.basic.dao;

public interface IBaseDao<T> {
	
	//添加对象
	public T add(T t);
	
	//更新对象
	public void update(T t);
	//根据id删除对象
	public void delete(int id);
	
	//根据id加载对象
	public T load(int id);
	
	
	
}
