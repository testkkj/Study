import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import DataBinding from "../views/DataBinding.vue"
import DataBindingHtml from "../views/DataBindingHtml.vue"
import DataBindingInputText from "../views/DataBindingInputText.vue"
import DataBindingInputNumber from "../views/DataBindingInputNumber.vue"
import DataBindingTextarea from "../views/DataBindingTextarea.vue"
import DataBindingSelect from "../views/DataBindingSelect.vue"
import DataBindingCheckbox from "../views/DataBindingCheckbox.vue"
import DataBindingAttribute from "../views/DataBindingAttribute.vue"
import DataBindingButton from "../views/DataBindingButton.vue"
import DataBindingClass from "../views/DataBindingClass.vue"
import DataBindingClass2 from "../views/DataBindingClass2.vue"
import DataBindingStyle from "../views/DataBindingStyle.vue"
import DataBindingList from "../views/DataBindingList.vue"
import RenderingVif from "../views/RenderingVif.vue"
import EventClick from "../views/EventClick"
import EventChange from "../views/EventChange"

const routes = [
  {

    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/databinding',
    name: 'DataBinding',
    component: DataBinding
  },
  {
    path: '/databindinghtml',
    name: 'DataBindingHtml',
    component: DataBindingHtml
  },
  {
    path: '/databindinginputtext',
    name: 'DataBindingInputText',
    component: DataBindingInputText
  },
  {
    path: '/databindinginputnumber',
    name: 'DataBindingInputNumber',
    component: DataBindingInputNumber
  },
  {
    path: '/databindingtextarea',
    name: 'DataBindingTextarea',
    component: DataBindingTextarea
  },
  {
    path: '/databindingselect',
    name: 'DataBindingSelect',
    component: DataBindingSelect
  },
  {
    path: '/databindingcheckbox',
    name: 'DataBindingCheckbox',
    component: DataBindingCheckbox
  },
  {
    path: '/databindingattribute',
    name: 'DataBindingAttribute',
    component: DataBindingAttribute
  },
  {
    path: '/databindingbutton',
    name: 'DataBindingButton',
    component: DataBindingButton
  },
  {
    path: '/databindingclass',
    name: 'DataBindingClass',
    component: DataBindingClass
  },
  {
    path: '/databindingclass2',
    name: 'DataBindingClass2',
    component: DataBindingClass2
  },
  {
    path: '/databindingstyle',
    name: 'DataBindingStyle',
    component: DataBindingStyle
  },
  {
    path: '/databindinglist',
    name: 'DataBindingList',
    component: DataBindingList
  },
  {
    path: '/renderingvif',
    name: 'RenderingVif',
    component: RenderingVif
  },
  {
    path: '/eventclick',
    name: 'EventClick',
    component: EventClick
  },
  {
    path: '/eventchange',
    name: 'EventChange',
    component: EventChange
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
