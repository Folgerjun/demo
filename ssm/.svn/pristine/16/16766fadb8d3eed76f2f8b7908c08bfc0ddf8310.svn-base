package com.springlight.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlight.data.db.dao.UnitConfigMapper;
import com.springlight.data.db.model.UnitConfig;
import com.springlight.data.service.UnitConfigService;

@Service
public class UnitConfigServiceImpl implements UnitConfigService{

	@Autowired
	UnitConfigMapper mUnitConfigMapper;
	
	@Override
	public List<UnitConfig> findUnitConfigLs() {
		return mUnitConfigMapper.selectUnitConfigLs();
	}

	@Override
	public void addUnitConfig(UnitConfig unitConfig) {
		mUnitConfigMapper.insertSelective(unitConfig);
	}

	@Override
	public void delUnitConfig(String unitSign) {
		mUnitConfigMapper.deleteByPrimaryKey(unitSign);
	}

	@Override
	public void modifyUnitConfig(UnitConfig unitConfig, String unitSign) {
		mUnitConfigMapper.updateByPrimaryKeySelective(unitConfig, unitSign);
	}

	@Override
	public List<UnitConfig> findReportLs() {
		return mUnitConfigMapper.selectReportLs();
	}

}
