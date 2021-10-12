<template>
    <h2>{{title}}</h2>
    <h3>{{sample1}}</h3>
</template>
<script>
export default {
    props: {
        title: {
            type: String,
            default: "페이지 제목입니다."
        },
        sample1: {
            type: Number,
            default: 42
        }
    }
}
</script>