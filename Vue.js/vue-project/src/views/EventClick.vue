<template>
    <div>
        <button type="button" @click="increaseCounter">Add 1</button>
        <p>The counter is : {{icounter}}</p>
        <button type="button" @click="setCounter(7)">Set 7</button>
        <p>The counter is : {{scounter}}</p>
    </div>
</template>
<script>
export default {
    data() {
        return {
            icounter: 0,
            scounter: 0
        };
    },
    methods: { //쉼표로 methods 여러개
        increaseCounter(){
            this.icounter = this.icounter + 1;
        },
        setCounter(counter){
            this.scounter = counter;
        }
    }
}
</script>