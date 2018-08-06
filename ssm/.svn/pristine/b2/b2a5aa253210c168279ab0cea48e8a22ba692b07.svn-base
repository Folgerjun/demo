package com.springlight.data.service;

import java.util.List;

import com.springlight.data.db.model.UnitBuild;

public interface SearchBuildService {

	/**
	 * 获得初始用于模糊查询的数据集合
	 * 
	 * @param builds
	 * @return
	 */
	List<String> getInitSearchData(List<UnitBuild> builds);

	/**
	 * 返回用于模糊查询的数据集合
	 * 
	 * @param builds
	 * @param buildarea
	 * @return
	 */
	List<String> getSearchData(List<UnitBuild> builds, String buildarea);

	/**
	 * 根据搜索条件查询数据
	 * 
	 * @param buildarea
	 * @param searchvalue
	 * @return
	 */
	List<UnitBuild> selectBuildBySearchData(String buildarea, String searchvalue);

}
