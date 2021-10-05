<template>
<div>
    <img v-bind:src="imgSrc" alt="">
</div>
</template>
<script>
export default {
    data() {
        return {
            imgSrc: "https://kr.vuejs.org/images/logo.png"
        };
    }
}
</script>