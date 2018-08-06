<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=750,user-scalable=no">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/theme/css/Mreset.css" />
        <title></title>
            <style type="text/css">
            section{
                width: 750px;
                height: 1218px;
                background: #E7197E;
                position:relative;
            }

            h1{
                color: #FFF;
                margin:25px 25px 25px 25px;
                font-size: 35px;
                font-weight: bold;
            }

            p{
                color: #FFF;
                font-size: 25px;
                margin: 0 25px;
                line-height: 48px;
            }

            .btn-yuyue{
                position:absolute;
                left:4%;
                bottom:20px;
            }

            .btn-search{
                position:absolute;
                left:58%;
                bottom:20px;
            }

            .banner-X{
                display: none;
            }

            @media (min-height:1219px){
                section{
                    height: 1452px;
                }

                .banner-X{
                    display: block;
                }

                .banner{
                    display: none;
                }

                .btn-yuyue{
                    bottom: 55px;
                }

                .btn-search{
                    bottom:55px;
                }

                h1{
                    margin-top: 65px;
                }
            }
        </style>
    </head>
    <body>
        <section>
            <div class="banner">
                <img src="${pageContext.request.contextPath}/theme/img/banner.png">
            </div>
            <div class="banner-X">
                <img src="${pageContext.request.contextPath}/theme/img/banner-x.png">
            </div>            
            <h1>2018年新春光网宽带体验营销活动</h1>
            <p><b>活动时间：</b>2018年1月1日至2018年3月31日</p>
            <p><b>活动对象：</b>活动开放楼宇的中小微企业</p>
            <p><b>活动内容：</b></p>
            <p>对活动楼宇内从未开通过移动宽带的中小微企业可免费体验一条移动宽带100M产品3-6个月</p>
        
            <div class="btn-yuyue" id="orderbutton">
                <img src="${pageContext.request.contextPath}/theme/img/btn-yuyue.png" onclick="clickbutton()"/>
            </div>
            <div class="btn-search">
                <img src="${pageContext.request.contextPath}/theme/img/btn-search.png">
            </div>
        </section>
        <input id="unitsign" type="hidden" value="${unitSign}" />
    </body>
    <script type="text/javascript" src="${pageContext.request.contextPath}/theme/js/jquery.min.js"></script>
    <script type="text/javascript">
    
    function clickbutton() {
        var unitSign = $("#unitsign").val();
        $.ajax({
        	type: "GET",
        	url:"${pageContext.request.contextPath}/XCYY/link?unitsign=" + unitSign,
        	success: function(data){
        		window.location.href=data;
          }
        });
    }
    
    $(".btn-search").click(function(){
    	var unitSign = $("#unitsign").val();
        location.href="${pageContext.request.contextPath}/XCYY/queryBuild?unitsign=" + unitSign;
    })
    
    </script>
</html>