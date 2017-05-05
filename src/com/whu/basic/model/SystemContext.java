package com.whu.basic.model;
//用来传递Threadlocal对象
public class SystemContext {
	//分页的大小
	private static ThreadLocal<Integer> pageSize=new ThreadLocal<Integer>();
	//分页的起始页
	private static ThreadLocal<Integer> pageOffset=new ThreadLocal<Integer>();
	//排序字段
	private static ThreadLocal<String> sort=new ThreadLocal<String>();
	//排序方式
	private static ThreadLocal<String> order=new ThreadLocal<String>();
	//列表的排序方式
	private static ThreadLocal<String> realPath=new ThreadLocal<String>();
	
	/**
	 * @return the pageSize
	 */
	public static Integer getPageSize() {
		return pageSize.get();
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public static void setPageSize(Integer _pageSize) {
		SystemContext.pageSize.set(_pageSize);
	}

	/**
	 * @return the pageOffset
	 */
	public static Integer getPageOffset() {
		return pageOffset.get();
	}

	/**
	 * @param pageOffset the pageOffset to set
	 */
	public static void setPageOffset(Integer _pageOffset) {
		SystemContext.pageOffset.set(_pageOffset);
	}

	/**
	 * @return the order
	 */
	public static String getOrder() {
		return order.get();
	}

	/**
	 * @param order the order to set
	 */
	public static void setOrder(String _order) {
		SystemContext.order.set(_order);
	}

	/**
	 * @return the realPath
	 */
	public static String getRealPath() {
		return realPath.get();
	}

	/**
	 * @param realPath the realPath to set
	 */
	public static void setRealPath(String _realPath) {
		SystemContext.realPath.set(_realPath);
	}
	
	
	
	/**
	 * @return the sort
	 */
	public static String getSort() {
		return sort.get();
	}

	
	
	/**
	 * @param sort the sort to set
	 */
	public static void setSort(String _sort) {
		SystemContext.sort.set(_sort);
	}
	
	public static void removeOrder()
	{
		order.remove();
	}

	public static void removePageSize()
	{
		pageSize.remove();
	}
	
	public static void removePageOffset()
	{
		pageOffset.remove();
	}
	
	public static void removeSort()
	{
		sort.remove();
	}
	
	public static void removeRealPath()
	{
		realPath.remove();
	}
	
	
	
}
