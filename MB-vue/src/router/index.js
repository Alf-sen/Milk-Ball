import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
// 导入新建的组件
import AppIndex from '@/components/home/AppIndex'
import Login from '@/components/Login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/appIndex',
      name: 'AppIndex',
      component: AppIndex
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    }
  ]
})
