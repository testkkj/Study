<template>
    <div>
        <select v-model="selectedValue" @change="changeSelect">
            <option value="서울">서울</option>
            <option value="부산">부산</option>
            <option value="제주">제주</option>
        </select> <br>
        <input type="text" placeholder="Enter키를 입력해 보세요" @keyup.enter="alertMessage('엔터키를 눌렀습니다.')" /> <br>
        <input type="text" @keyup.alt.enter="claer('알트 엔터키를 눌렀습니다.')" />
    </div>
</template>
<script>
export default {
    data() {
        return {
            selectedValue: '',
            clearValue: '값이 변경될거에요.'
        };
    },
    methods: {
        changeSelect(){
            alert(this.selectedValue);
        },
        alertMessage(msg){
            alert(msg);
        },
        clear(msg) {
            alert(msg);
            //@keyup.alt.enter 단독 사용시 작동 하는데 뭔가 여러개가 있어서 안되는거 같음
        }
    }
}
</script>