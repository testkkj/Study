import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import mixins from './mixins'
import i18nPlugin from "./plugins/i18n"; //i18n 플러그인 추가

const i18nStrings = {
    en: {
        hi: 'Hello!'
    },
    ko: {
        hi: '안녕하세요!'
    }
}

createApp(App).use(router).mixin(mixins).use(i18nPlugin, i18nStrings).mount('#app') //i18n 플러그인에 다국어 번역 데이터를 파라미터로 전달

app.directive('focus', {
    mounted(el) {
        el.focus()
    }
})