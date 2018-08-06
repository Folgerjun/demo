package com.springlight.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlight.data.db.dao.UnitRecordMapper;
import com.springlight.data.db.model.UnitRecord;
import com.springlight.data.service.ReadNumService;

/**
 * 浏览量更新实现类
 * 
 * @author Folger
 *
 */
@Service
public class ReadNumServiceImpl implements ReadNumService {

	@Autowired
	UnitRecordMapper mUnitRecordMapper;

	@Override
	public void addReadNum(String unitSign) {

		UnitRecord unitRecord = mUnitRecordMapper.selectByPrimaryKey(unitSign);
		if (unitRecord == null) {
			// insert 操作 浏览量为1
			unitRecord = new UnitRecord();
			unitRecord.setUnitClickNum(0);
			unitRecord.setUnitClickBuildNum(0);
			unitRecord.setUnitReadNum(1);
			unitRecord.setUnitSign(unitSign);
			mUnitRecordMapper.insert(unitRecord);
		} else {
			// 使浏览量加1
			mUnitRecordMapper.updateReadNumByPrimaryKey(unitSign);
		}

	}

}
