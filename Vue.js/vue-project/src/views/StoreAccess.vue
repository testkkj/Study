<template>
    <p>Count : {{count}}</p>
    <button type="button">Increment</button>
</template>
<script>
export default {
    computed: {
        count() {
            return this.$store.state.count;
        },
        cartCount() {
            return this.$store.getters.cartCount;
        }
    },
    methods: {
        increment() {
            this.$store.commit('increment');
        }
    }
}
</script>