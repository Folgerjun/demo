<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextpath" value="${pageContext.request.contextPath}"></c:set>
<script type="text/javascript">contextpath = '${contextpath}';</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <title>2018烟草4G自选套餐</title>
  <meta name="viewport" content="width=640,user-scalable=no" />
  <link rel="stylesheet" href="${contextpath}/css/Mreset.css">
  <link rel="stylesheet" href="${contextpath}/css/index.css">
  <script src="${contextpath}/js/jquery-2.1.1.min.js"></script>
  <script src="${contextpath}/js/base.js"></script>
</head>
<body>
    <section>
        <div class="btn-join btn_count" btn_class = "btn_join" btn_name = "立即参加" btn_remark = "首页跳转按钮"></div>
        <div class="ruleContent">
            <div class="title">参与条件</div>
            <div class="row">
                <div class="row1">1.</div>
                <div class="row2">烟草V网群内用户。非群内用户，需先添加融合通信语音功能（3000分钟群内通话），仅开放在职员工申请。
                【新V网用户申请：由所在单位统一收集纸质版材料和电子版材料。纸质版材料包括加盖公章的工作证和身份证复印件，快递到机关服务中心电话管理员，电子版材料为号码清单的EXCEL版本，发送至机关服务中心电话管理员邮箱laibf@sh.tobacco.com.cn。 （一般情况下，前期参加过烟草原V网套餐和2016版烟草4G飞享套餐的用户已经在群内。）】</div>
            </div>
            <div class="row">
                <div class="row1">2.</div>
                <div class="row2">上海移动实名制用户且已经更换4G手机SIM卡。</div>
            </div>
        </div>
    </section>
    <script type="text/javascript">
        $(function(){
            $(".btn-join").click(function(){
                location.href="${contextpath}/activity/page";
            })
        })
    </script>
</body>
</html>