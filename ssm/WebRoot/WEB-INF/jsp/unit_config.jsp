<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="<%=request.getContextPath()%>" />
<script type="text/javascript">
//全局js变量，项目名
ctx = "<%=request.getContextPath()%>";
</script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id = "linkTable" border="1" cellpadding="10">
	<div><a id = "addBtn" href="#">添加</a> <a href="${ctx}/unit/report">报表</a></div>
	<tr><td>序号</td><td>链接标签</td><td>链接名</td><td>链接</td><td>操作</td></tr>
	<c:forEach var="item" items="${unitConfigLs}" varStatus="st">
	<tr><td>${ st.index + 1 }</td><td>${ item.unitSign }</td><td>${ item.unitName }</td><td>${ item.unitLink }</td><td><a id = "${ item.unitSign }" class = "btnDel" href="#">删除</a> <a id = "${ item.unitSign }" class = "btnUpdate" href="#">修改</a></td></tr>
	</c:forEach>
	
	</table>

</body>

<script src="${ctx}/theme/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#addBtn").click(function() {
			var index = $("#linkTable").find("tr").length ;
			var html = '<tr><td>' + index + '</td><td><input class = "txtUnitSign" type="text"></td><td><input class = "txtUnitName" type="text"></td><td><input class = "txtUnitLink" size = "100" type="text"></td><td><a class = "saveBtn" href="#">保存</a></td></tr>';
			$("#linkTable").append(html);
		});
		
		$("#linkTable").on("click",".saveBtn", function() {
			var saveBtn = $(this);
			var txtUnitSign = $(this).parent().parent().find(".txtUnitSign").val();
			var txtUnitName = $(this).parent().parent().find(".txtUnitName").val();
			var txtUnitLink = $(this).parent().parent().find(".txtUnitLink").val();
			
			if(txtUnitSign == "" || txtUnitName == "" || txtUnitLink == ""){
				alert("请配置正确的参数...");
				return;
			}
			
			$.ajax({
				type: "post",
				url: "${ctx}/unit/config/add",
				data: {unitSign: txtUnitSign, unitLink: txtUnitLink, unitName: txtUnitName},
				success: function(data) {
					alert("保存成功...");
					saveBtn.parent().parent().find(".txtUnitSign").parent().html(txtUnitSign);
					saveBtn.parent().parent().find(".txtUnitName").parent().html(txtUnitName);
					saveBtn.parent().parent().find(".txtUnitLink").parent().html(txtUnitLink);
					var delHtml = '<a id = "' + txtUnitSign + '" class = "btnDel" href="#">删除</a> <a id = "' + txtUnitSign + '" class = "btnUpdate" href="#">修改</a>';
					saveBtn.parent().html(delHtml);
				}
			});
			
		});
		
		$("#linkTable").on("click",".btnDel", function() {
			var unitSign = $(this).attr("id");
			var btnDel = $(this);
			$.ajax({
				type: "post",
				url: "${ctx}/unit/config/del",
				data: {unitSign: unitSign},
				success: function(data) {
					alert("删除成功...");
					btnDel.parent().parent().remove();
				}
			});
		});
		
		$("#linkTable").on("click",".btnUpdate", function() {
			var unitSign = $(this).attr("id");
			var btnUpdate = $(this);
			var txtUnitSign = $(this).parent().parent().find("td:eq(1)").text();
			var txtUnitName = $(this).parent().parent().find("td:eq(2)").text();
			var txtUnitLink = $(this).parent().parent().find("td:eq(3)").text();
			var signHtml = '<input id = "' + txtUnitSign + '" class = "txtUnitSign" type="text" value = "' + txtUnitSign + '">';
			var nameHtml = '<input class = "txtUnitName" type="text" value = "' + txtUnitName + '">';
			var linkHtml = '<input  size = "100" class = "txtUnitLink"  type="text" value = "' + txtUnitLink + '">';
			var saveHtml = '<a class = "saveUpdaeBtn" href="#">保存</a></td>';
			$(this).parent().parent().find("td:eq(1)").html(signHtml);
			$(this).parent().parent().find("td:eq(2)").html(nameHtml);
			$(this).parent().parent().find("td:eq(3)").html(linkHtml);
			$(this).parent().parent().find("td:eq(4)").html(saveHtml);
		});
		
		$("#linkTable").on("click",".saveUpdaeBtn", function() {
			var saveBtn = $(this);
			var upUnitSign = $(this).parent().parent().find(".txtUnitSign").attr("id");
			var txtUnitSign = $(this).parent().parent().find(".txtUnitSign").val();
			var txtUnitName = $(this).parent().parent().find(".txtUnitName").val();
			var txtUnitLink = $(this).parent().parent().find(".txtUnitLink").val();
			if(txtUnitSign == "" || txtUnitName == "" || txtUnitLink == ""){
				alert("请配置正确的参数...");
				return;
			}
			
			$.ajax({
				type: "post",
				url: "${ctx}/unit/config/update",
				data: {unitSign: txtUnitSign, unitLink: txtUnitLink, unitName: txtUnitName, upUnitSign: upUnitSign},
				success: function(data) {
					alert("保存成功...");
					saveBtn.parent().parent().find(".txtUnitSign").parent().html(txtUnitSign);
					saveBtn.parent().parent().find(".txtUnitName").parent().html(txtUnitName);
					saveBtn.parent().parent().find(".txtUnitLink").parent().html(txtUnitLink);
					var delHtml = '<a id = "' + txtUnitSign + '" class = "btnDel" href="#">删除</a> <a id = "' + txtUnitSign + '" class = "btnUpdate" href="#">修改</a>';
					saveBtn.parent().html(delHtml);
				}
			});
			
		});
	});
</script>
</html>