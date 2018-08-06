package com.springlight.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.springlight.data.db.model.UnitBuild;
import com.springlight.data.service.ClickNumService;
import com.springlight.data.service.ReadNumService;
import com.springlight.data.service.SearchBuildService;

@Controller
@RequestMapping("XCYY")
public class NewSpringWeb {

	private static List<UnitBuild> builds = null;

	@Autowired
	ReadNumService mReadNumService;

	@Autowired
	ClickNumService mClickNumService;

	@Autowired
	SearchBuildService mSearchBuildService;

	/**
	 * 进入页面
	 * 
	 * @param unitSign
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{unitsign}", produces = "text/html;charset=UTF-8")
	public String index(@PathVariable("unitsign") String unitSign, Model model) {

		model.addAttribute("unitSign", unitSign);

		// 使浏览量加1
		mReadNumService.addReadNum(unitSign);

		return "/page";
	}

	/**
	 * 点击事件触发
	 * 
	 * @param unitsign
	 * @return
	 */
	@RequestMapping(value = "/link")
	@ResponseBody
	public String linkUrl(String unitsign) {

		// 使点击量加1
		String urllink = mClickNumService.addClickNum(unitsign);

		return urllink;
	}

	/**
	 * 跳转查询楼宇页面并展示所有楼宇
	 * 
	 * @param unitsign
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryBuild")
	public String queryBuild(String unitsign, Model model) {

		// 使查询量加1 同时查出所有楼宇信息
		builds = mClickNumService.addClickBuildNum(unitsign);

		List<String> searchDataList = mSearchBuildService.getInitSearchData(builds);

		model.addAttribute("searchData", JSONArray.toJSONString(searchDataList));

		// 返回查询页面
		return "/build";
	}

	/**
	 * 页面展示所选的区域的楼宇信息
	 * 
	 * @param buildarea
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/showBuild")
	public String showBuild(String buildarea, Model model) {

		// 查询返回模糊查询数据
		List<String> searchDataList = mSearchBuildService.getSearchData(builds, buildarea);

		// 用于模糊查询
		model.addAttribute("searchData", JSONArray.toJSONString(searchDataList));
		model.addAttribute("buildarea", buildarea);

		// 返回查询页面
		return "/build";
	}

	/**
	 * 点击查询按钮后根据区域和搜索信息进行模糊查询
	 * 
	 * @param buildarea
	 * @param searchData
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/search")
	public String showSearchData(String buildarea, String searchvalue, Model model) {

		// 查询返回点击搜索数据
		List<UnitBuild> buildList = mSearchBuildService.selectBuildBySearchData(buildarea, searchvalue);

		// 查询返回模糊查询数据
		List<String> searchDataList = mSearchBuildService.getSearchData(builds, buildarea);

		// 用于模糊查询
		model.addAttribute("searchData", JSONArray.toJSONString(searchDataList));

		model.addAttribute("builds", buildList);
		model.addAttribute("buildarea", buildarea);
		model.addAttribute("searchvalue", searchvalue);

		// 点击事件标志
		model.addAttribute("searchClick", "clicked");

		return "/build";
	}
}
