<template>
  <div>
    <Header></Header>
    <router-view></router-view>
    <Footer></Footer>
  </div>
</template>
<script>
import Header from "./layouts/Header.vue";
import Footer from "./layouts/Footer.vue";
export default {
  components: {Header, Footer},
  computed: {
    user() {
      return this.$store.status.user;
    }
  }
}
</script>