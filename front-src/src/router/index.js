import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const constantRoutes = [
  {
    path: '/',
    component: () => import('@/views/Home/index'),
    meta: { title: 'Home' }
  },
  {
    path: '/about',
    component: () => import('@/views/About.vue'),
    meta: { title: 'About' }
  },
  {
    path: '/board',
    component: () => import('@/views/BoardList.vue'),
    meta: { title: 'Board' }
  },
  {
    path: '/write',
    component: () => import('@/views/editor/index'),
    meta: { title: '글작성' }
  },
  {
    path: '/post/:id?',
    component: () => import('@/views/detailPost/index'),
    hidden: true,
    meta: { title: '글상세보기' }
  },
  {
    path: '/redirect/:path*',
    component: () => import('@/views/redirect/index'),
    hidden: true
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
