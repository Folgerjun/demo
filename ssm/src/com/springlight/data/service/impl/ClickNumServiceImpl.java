package com.springlight.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlight.data.db.dao.UnitBuildMapper;
import com.springlight.data.db.dao.UnitConfigMapper;
import com.springlight.data.db.dao.UnitRecordMapper;
import com.springlight.data.db.model.UnitBuild;
import com.springlight.data.db.model.UnitConfig;
import com.springlight.data.service.ClickNumService;

/**
 * 点击量更新实现类
 * 
 * @author Folger
 *
 */
@Service
public class ClickNumServiceImpl implements ClickNumService {

	@Autowired
	UnitConfigMapper mUnitConfigMapper;

	@Autowired
	UnitRecordMapper mUnitRecordMapper;

	@Autowired
	UnitBuildMapper mUnitBuildMapper;

	@Override
	public String addClickNum(String unitSign) {

		String urllink = "";
		UnitConfig unitConfig = mUnitConfigMapper.selectByPrimaryKey(unitSign);
		if (unitConfig != null) {
			urllink = unitConfig.getUnitLink();
		}
		// 更新点击量 使点击量加1
		mUnitRecordMapper.updateClickNumByPrimaryKey(unitSign);

		return urllink;

	}

	@Override
	public List<UnitBuild> addClickBuildNum(String unitSign) {

		// 更新查询点击按钮数 加1
		mUnitRecordMapper.updateBuildClickNumByPrimaryKey(unitSign);

		// 返回所有楼宇信息
		List<UnitBuild> unitBuilds = mUnitBuildMapper.selectAllBuild();

		return unitBuilds;
	}

}
