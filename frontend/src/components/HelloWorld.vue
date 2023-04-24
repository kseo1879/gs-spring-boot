<template>
  <div class="hello">
      <div class="container">
        {{ info.data }}
      </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      info: null
    }
  },
  mounted() {
    axios
        .get('http://44.215.203.222:8080/')
        .then(response => {
          this.info = response;
        })
        .catch(error => {
          console.log(error);
          this.errored = true
        })
        .finally(() => this.loading = false)
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
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

<!--<template>-->
<!--  <div>-->
<!--    <div class="container">-->
<!--      {{info}}-->
<!--    </div>-->
<!--    <div v-if="errored">-->
<!--      <h1>We're sorry, we cannot retrieve this information at the moment. Please come back later.</h1>-->
<!--    </div>-->
<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--import axios from "core-js/internals/queue";-->

<!--export default {-->
<!--  data() {-->
<!--    return {-->
<!--      info: null-->
<!--    }-->
<!--  },-->
<!--  mounted() {-->
<!--    axios-->
<!--        .get('http://:8080/')-->
<!--        .then(response => {-->
<!--          this.info = response;-->
<!--        })-->
<!--        .catch(error => {-->
<!--          console.log(error);-->
<!--          this.errored = true-->
<!--        })-->
<!--        .finally(() => this.loading = false)-->
<!--  }-->
<!--}-->

<!--</script>-->

<!--<style>-->

<!--</style>-->