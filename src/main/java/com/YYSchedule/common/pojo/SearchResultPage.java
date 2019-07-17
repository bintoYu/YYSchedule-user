package com.YYSchedule.common.pojo;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.Page;

public class SearchResultPage<T> {

	//搜索结果集
	private List<T> resultList;

	//当前页码
	private Integer pageNum;

	//页面大小
	private Integer pageSize;

	//数据起始行
	private Integer startRow;

	//数据终止行
	private Integer endRow;

	//数据总条数
	private Long total;

	//总页数
	private Integer pages;
	
	public SearchResultPage() {
		this.resultList = new ArrayList<T>();
		this.pageNum = 0;
		this.pageSize = 0;
		this.startRow = 0;
		this.endRow = 0;
		this.total = (long) 0;
		this.pages = 0;
	}

	public SearchResultPage(List<T> list) {
		this.resultList = list;
		this.pageNum = 0;
		this.pageSize = 0;
		this.startRow = 0;
		this.endRow = 0;
		this.total = (long) 0;
		this.pages = 0;
	}

	public void setPageProperties(Page page) {
		this.pageNum = page.getPageNum();
		this.pageSize = page.getPageSize();
		this.startRow = page.getStartRow();
		this.endRow = page.getEndRow();
		this.total = page.getTotal();
		this.pages = page.getPages();
	}
	
	public void setProperties(List<T> list) {
		int size = list.size();
		this.pageNum = 1;
		this.pageSize = size;
		this.startRow = 0;
		this.endRow = size;
		this.total = (long)size;
		this.pages = 1;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getEndRow() {
		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return "SearchResultPage [resultList=" + resultList + ", pageNum=" + pageNum + ", pageSize=" + pageSize
				+ ", startRow=" + startRow + ", endRow=" + endRow + ", total=" + total + ", pages=" + pages + "]";
	}

}
