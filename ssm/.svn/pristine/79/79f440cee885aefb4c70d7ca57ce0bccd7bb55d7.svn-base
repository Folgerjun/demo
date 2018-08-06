package com.springlight.data.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.springlight.data.db.dao.UnitBuildMapper;
import com.springlight.data.db.model.UnitBuild;
import com.springlight.data.service.SearchBuildService;

@Service
public class SearchBuildServiceImpl implements SearchBuildService {

	@Autowired
	UnitBuildMapper mUnitBuildMapper;

	@Override
	public List<String> getSearchData(List<UnitBuild> builds, String buildarea) {

		List<String> searchDataList = new ArrayList<String>();

		if (builds == null) {
			builds = mUnitBuildMapper.selectAllBuild();
		}

		if ("不限".equals(buildarea)) {
			for (UnitBuild build : builds) {
				String buildArea = build.getUnitArea();
				if (!StringUtils.isEmpty(buildArea)) {
					// 将楼宇名字、位置用于页面模糊搜索
					searchDataList.add(build.getUnitBuildName());
					searchDataList.add(build.getUnitBuildLocation());

				}
			}
		} else {
			for (UnitBuild build : builds) {
				String buildArea = build.getUnitArea();
				if (!StringUtils.isEmpty(buildArea)) {
					if (buildArea.equals(buildarea)) {
						// 区域为选中区域时塞入值
						// 将楼宇名字、位置用于页面模糊搜索
						searchDataList.add(build.getUnitBuildName());
						searchDataList.add(build.getUnitBuildLocation());
					}
				}
			}

		}

		return searchDataList;
	}

	@Override
	public List<UnitBuild> selectBuildBySearchData(String buildarea, String searchvalue) {

		if ("不限".equals(buildarea)) {
			buildarea = null;
		}
		List<UnitBuild> buildList = mUnitBuildMapper.selectBuildBySearchData(buildarea, searchvalue);

		return buildList;
	}

	@Override
	public List<String> getInitSearchData(List<UnitBuild> builds) {

		if (builds == null) {
			builds = mUnitBuildMapper.selectAllBuild();
		}

		List<String> searchDataList = new ArrayList<String>();
		for (UnitBuild build : builds) {
			String buildArea = build.getUnitArea();
			if (!StringUtils.isEmpty(buildArea)) {
				if (buildArea.equals("浦东新区")) {
					// 默认为浦东新区
					// 将楼宇名字、位置用于页面模糊搜索
					searchDataList.add(build.getUnitBuildName());
					searchDataList.add(build.getUnitBuildLocation());
				}
			}
		}
		return searchDataList;
	}

}
