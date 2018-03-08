<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学习Vue.js</title>
</head>
<body>

<div id = 'div-01'>
<p>{{ message.a }}</p>
<button @click =" message.a = 3 " >点击改变它！</button>
</div>

<div id="example">
  <p>Original message: "{{ message }}"</p>
  <p>Computed reversed message: "{{ reversedMessage }}"</p>
</div>



</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/vue.min.js"></script>
<script type="text/javascript">

var vv = new Vue({
	  el: '#example',
	  data: {
	    message: 'Hello'
	  },
	  computed: {
	    // 计算属性的 getter
	    reversedMessage: function () {
	      // `this` 指向 vv 实例
	      return this.message.split('').reverse().join('')
	    }
	  }
	})


var message = {
		a:1,
		b:2
}

//会阻止修改现有的属性
//Object.freeze(message)

var vm = new Vue({
	el:'#div-01',
	data:message
})

console.log(vm.$data === message)
console.log(vm.a)

vm.$watch('a',function(newValue, oldValue) {
	//message.a 值改变时调用
	alert('狗日的居然让我' + oldValue + '变成了'+ newValue + '!!!!');
})

new Vue({
  data: {
    a: 1
  },
  //created 在实例创建之后执行
  created: function () {
    // `this` 指向 vm 实例
    console.log('a is: ' + this.a)
  }
})
// => "a is: 1"

</script>
</html>