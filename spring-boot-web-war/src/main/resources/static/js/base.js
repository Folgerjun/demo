$(function() {
	$(".btn_count").click(function (){
		btnCount($(this));
	});
});

function btnCount(btn) {
	var btnClass = btn.attr("btn_class");
	var btnName = btn.attr("btn_name");
	var btnRemark = btn.attr("btn_remark");
	postBtnCount(btnClass, btnName, btnRemark);
}

function postBtnCount(btnClass, btnName, btnRemark) {
	$.ajax({
		url: contextpath + "/add_btn_count",
		type:"post",
		data:{"btnName": btnName, "btnClass": btnClass, "btnRemark": btnRemark}
	});
}

function post(URL, PARAMS) {        
    var temp = document.createElement("form");        
    temp.action = URL;        
    temp.method = "post";        
    temp.style.display = "none";        
    for (var x in PARAMS) {        
        var opt = document.createElement("textarea");        
        opt.name = x;        
        opt.value = PARAMS[x];        
        // alert(opt.name)        
        temp.appendChild(opt);        
    }        
    document.body.appendChild(temp);        
    temp.submit();        
    return temp;        
}