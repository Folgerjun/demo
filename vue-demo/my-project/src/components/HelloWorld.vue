<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <br />
    <h2>CSDN：<a href="http://blog.csdn.net/ffj0721" target="_blank">这是我的CSDN博客</a></h2>
    <br />
    <h2>GitHub：<a href="https://github.com/Folgerjun" target="_blank">这是我的GitHub</a></h2>
    <br />
    <h2>Thank you ~</h2>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome To My House!'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
