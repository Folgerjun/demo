package com.springlight.data.utils;

import java.util.List;

public class ArrayUtil {

	/**
	 * 集合转数组
	 * 
	 * @return
	 */
	public static String[] listToArr(List<String> searchDataList) {
		// 集合转数组
		String[] searchData = new String[searchDataList.size()];
		searchData = searchDataList.toArray(searchData);

		return searchData;
	}

}
