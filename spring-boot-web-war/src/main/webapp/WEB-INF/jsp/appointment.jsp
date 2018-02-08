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
  <link rel="stylesheet" href="${contextpath}/css/appointment.css">
  <script src="${contextpath}/js/jquery-2.1.1.min.js"></script>
  <script src="${contextpath}/js/base.js"></script>
</head>
<body>
    <section>
        <div class="mask" style="display: none;"></div>
        <div class="popup popup-success" style="display: none;">
            <p>预约成功，我们会尽<br>快进行活动办理，<br>请耐心等待，谢谢。</p>
            <div class="btn-confirm">确定</div>
        </div>
        <div class="popup popup-fail" style="display: none;">
            <p>请输入正确的手机号码</p>
            <div class="btn-confirm">确定</div>
        </div>
        <img src="${contextpath}/img/title.png" class="title">
        <div class="rule_popup">
            <div class="rule_content">
                <p class="rule_title">活动注意事项</p>
                <div class="row" style="color:#D33441;font-weight: bold;">
                    <div class="row1">1.</div>
                    <div class="row2">B2集团套餐（原烟草V网套餐）一旦申请转出，无法再次转入。</div>
                </div>      
                <div class="row">
                    <div class="row1">2.</div>
                    <div class="row2">本次活动和原烟草V网套餐内3个功能包相冲突，需取消。<span style="color:#D33441;">（集团客户短信资费包、集团客户长途通话资费包、集团客户漫游通话资费包），</span>10086在外呼的时候会提示您取消这3个功能。一旦申请取消，无法再次添加。</div>
                </div>  
                <div class="row">
                    <div class="row1">3.</div>
                    <div class="row2">本活动涉及的转套餐可能导致用户原先使用的部分功能包遗留或失效，因此活动受理成功后，请用户当月拨打10086或登陆上海移动网上营业厅<span style="color:#D33441;">自行确认下月生效的功能是否正确</span>，并自主决定是否变更原先使用的一些功能包。（如彩铃功能等。）</div>
                </div>  
                <div class="row">
                    <div class="row1">4.</div>
                    <div class="row2">10086外呼受理后，后台统一更换对应4G自选套餐（当前是预付费套餐则对应转入预付费4G自选套餐、当前是后付费套餐则对应转入后付费4G自选套餐）并办理捆绑活动，办理活动的次月为协议期的第一个月，开始赠送免费资源（本地通话、本地流量、短信）。<span style="color:#D33441;">办理当月不计入协议期，因此无法查询到免费资源信息。</span></div>
                </div>
                <div class="row">
                    <div class="row1">5.</div>
                    <div class="row2"><span style="color:#D33441;">额外赠送的本地流量需套餐内全国通用流量用尽后使用。</span></div>
                </div>  
                <div class="row">
                    <div class="row1">6.</div>
                    <div class="row2">如果套餐内流量仍旧不够，可以自行拨打10086叠加流量可选包。</div>
                </div>  
                <div class="row">
                    <div class="row1">7.</div>
                    <div class="row2">参加新套餐活动后，当月如有未用完的流量将于月底失效清零。</div>
                </div>      
                <div class="row">
                    <div class="row1">8.</div>
                    <div class="row2">协议期间，如用户月实际通信费未达到58元，月末出账时将按58元收取，补足款在账单中将以“套餐补差额”科目列出，如超过则按实收取。特别提醒：套餐月租费计入每月通信费，但账单一级科目“代收费业务费用”不计入每月最低通信费额度。</div>
                </div>
                <div class="row">
                    <div class="row1">9.</div>
                    <div class="row2">活动当月办理，次月生效。本活动一旦申请，不可回退。协议期间，用户不可办理过户、销户、停机保号等业务。</div>
                </div>  
                <div class="row">
                    <div class="row1">10.</div>
                    <div class="row2">若用户已参加上海移动赠送终端类活动或承诺消费送家庭宽带类活动仍在协议期内，可以叠加本活动，但两个活动的<span style="color:#D33441;">最低消费将叠加</span>。若用户已参加上海移动承诺消费送话费类活动仍在协议期内，不能叠加本活动。</div>
                </div>
                <div class="row">
                    <div class="row1">11.</div>
                    <div class="row2">如办理用户为家庭统付活动（如畅享计划、和家庭等）的副号码，需主号码发送短信“SQFHM+空格+副号码手机号码”至10086授权方能办理业务。</div>
                </div>  
                <div class="row">
                    <div class="row1">12.</div>
                    <div class="row2">协议期满前一个月，可自由转出自选套餐，也不再受最低消费58元的限制，如不变更的，您的套餐将延续协议期最后一个月的相关资费标准收取，但免费资源不再赠送。（300分钟本地通话、1G本地4G流量、150条短信）</div>
                </div>                                                  
                <div class="row">
                    <div class="row1">13.</div>
                    <div class="row2">新套餐额外赠送的1G本地4G流量需在上海本地4G网络下方可使用，非4G手机用户无法使用。当用户处于非4G网络覆盖区域或将手机终端自行设置到3G信号接收的，额外赠送的1G本地4G流量也无法使用，如果国内流量使用完毕，赠送的本地流量也不满足使用条件的情况下，按0.29元/M收取套餐外流量费。</div>
                </div>
                <div class="row">
                    <div class="row1">14.</div>
                    <div class="row2">集团员工内部分机与手机捆绑的用户，如工作部门、内部分机发生变化，可由单位电话管理员统一收集后，与机关服务中心电话管理员申请办理内部分机与手机捆绑的变更。本次活动上海移动客服热线：10086。上海烟草集团机关服务中心电话管理员：赖邦封，内部分机：69856。</div>
                </div>
            </div>
        </div>
        <div class="agree">
            <div style="display: inline-block;overflow: hidden;">
                <input type="checkbox" name="" class="cb">
                <span style="float:left;height:26px;line-height: 26px;">我已阅读活动注意事项</span>
            </div>
        </div>
        <div class="userInfo">
            <input type="number" name="" class="phoneInput" placeholder="手机号码">
            <input type="text" name="" class="nameInput" placeholder="机主姓名">
            <div class="btn-submit btn_count" btn_class = "btn_input" btn_name = "确认提交" btn_remark = "烟草预约活动提交信息按钮">
                <img src="${contextpath}/img/btn-submit.png">
            </div>
        </div>
    </section>

    <script type="text/javascript">
        $(function(){
            $(".btn-confirm").click(function(){
                $(".popup").hide();
                $(".mask").hide();
            })

            $(".btn-submit").click(function(){
                var myreg = /^1[34578]\d{9}$/; 
                var phone = $(".phoneInput").val();
                var name = $(".nameInput").val();
                //验证手机号、机主姓名
                if(!$("input[type='checkbox']").prop('checked')){
                    $(".popup-fail p").html("请阅读活动注意事项");
                    $(".popup-fail").show();
                    $(".mask").show();                  
                }else if(phone.length==0&&$("input[type='checkbox']").prop('checked')){
                    $(".popup-fail p").html("请填写手机号码");
                    $(".popup-fail").show();
                    $(".mask").show();
                }else if(name.length==0&&$("input[type='checkbox']").prop('checked')){
                    $(".popup-fail p").html("请填写机主姓名");
                    $(".popup-fail").show();
                    $(".mask").show();                  
                }else if(!myreg.test(phone)&&$("input[type='checkbox']").prop('checked')){
                    $(".popup-fail p").html("请输入正确的手机号码");
                    $(".popup-fail").show();
                    $(".mask").show();
                }else{
                    //提交
                	 $.ajax({
                         type: "GET",
                         url:"${contextpath}/activity/check?phone=" + phone + "&name=" + name,
                         success: function(data){
                             console.log(data);
                             if(data == "fail") {
                            	 //不在白名单中
                            	 $(".popup-fail p").html("您不满足活动条件，预约失败");
                                 $(".popup-fail").show();
                                 $(".mask").show();
                             } else if(data == "isExist") {
                            	 // 已经参加过了
                            	 $(".popup-fail p").html("您已提交申请，请勿重复提交，谢谢！");
                            	 $(".popup-fail").show();
                                 $(".mask").show();
                             } else if(data == "success") {
                            	 //在白名单中 
                                 $(".popup-success").show();
                                 $(".mask").show();
                             }
                       }
                     });

                }
            })
            
            postBtnCount("btn_read","烟草预约活动页面浏览量","烟草预约活动页面浏览量");
        })
    </script>
</body>
</html>