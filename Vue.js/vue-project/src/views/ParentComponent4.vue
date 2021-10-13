<template>
    <child-component @send-message="sendMessage" />
</template>
<script>
import ChildComponent from "./ChildComponent4";
export default {
    components: {ChildComponent},
    methods: {
        sendMessageData(data) {
            console.log(data);
        }
    }
}
</script>