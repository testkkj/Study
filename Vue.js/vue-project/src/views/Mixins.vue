<template>
    <div></div>
</template>
<script>
import ApiMixin from "../api";
export default {
    mixins: [ApiMixin],
    data() {
        return {
            productList: []
        };
    },
    async mounted() {
        this.productList = await this.$callAPI("https://f8cf7ade-5a68-43e8-b6ea-cc3d4d13f483.mock.pstmn.io/list2","get");
        console.log(this.productList);
    }
}
</script>