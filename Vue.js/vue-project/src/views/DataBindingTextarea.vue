<template>
<div>
    <textarea v-model="message" />
</div>
</template>
<script>
export default {
    data() {
        return {
            message: '여러 줄을 입력 할수 있는 Textarea 입니다.'
        };
    }
}
</script>