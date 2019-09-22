import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import Layout from '@/layout'

export const constantRoutes = [
  {
    path: '/',
    component: Layout,
    meta: { title: 'Home' }
  },
  {
    path: '/about',
    component: Layout,
    meta: { title: 'About' },
    children: [
      {
        path: '',
        component: () => import('@/views/About.vue')
      }
    ]
  },
  {
    path: '/board',
    component: Layout,
    meta: { title: 'Board' },
    children: [
      {
        path: '',
        component: () => import('@/views/BoardList.vue')
      }
    ]
  },
  {
    path: '/post/:id?',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '',
        component: () => import('@/views/detailPost/index')
      }
    ]
  },
  {
    path: '/write',
    component: Layout,
    meta: { title: '글작성' },
    children: [
      {
        path: '',
        component: () => import('@/views/editor/index')
      }
    ]
  },
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path*',
        component: () => import('@/views/redirect/index')
      }
    ]
  },
  {
    path: '/404',
    component: () => import('@/views/error-page/404'),
    hidden: true
  }
]

export const asyncRoutes = [{ path: '*', redirect: '/404', hidden: true }]

const createRouter = () =>
  new Router({
    scrollBehavior: () => ({ y: 0 }),
    routes: constantRoutes
  })

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
