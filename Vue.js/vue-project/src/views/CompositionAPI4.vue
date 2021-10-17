<template>
    <div>
        <h2>Calculator</h2>
        <div>
            <input type="text" name="" id="" v-model="num1" />
            <span> + </span>
            <input type="text" name="" id="" v-model="num2" />
            <span> = </span>
            <span>{{result}}</span>
        </div>
    </div>
</template>
<script>
import { plusCalculator } from "../commons";
export default {
    name: 'calculator',
    setup() {
        let {num1, num2, result} = plusCalculator();
        return {
            num1, num2, result
        }
    }
}
</script>