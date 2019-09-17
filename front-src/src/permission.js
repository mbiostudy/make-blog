import router from './router'
import store from './store'
import NProgress from 'nprogress' // progress bar
import 'nprogress/nprogress.css' // progress bar style

NProgress.configure({ showSpinner: false }) // NProgress Configuration

router.beforeEach(async(to, from, next) => {
  // start progress bar
  NProgress.start()
  const hasRoles = store.getters.roles && store.getters.roles.length > 0
  if (hasRoles) {
    next()
  } else {
    try {
      const roles = await store.dispatch('user/getInfo')
      // generate accessible routes map based on roles
      const accessRoutes = await store.dispatch(
        'permission/generateRoutes',
        roles
      )
      // dynamically add accessible routes
      router.addRoutes(accessRoutes)

      // hack method to ensure that addRoutes is complete
      // set the replace: true, so the navigation will not leave a history record
      next({ ...to, replace: true })
    } catch (error) {
      next(`/`)
      NProgress.done()
    }
  }
})

router.afterEach(() => {
  // finish progress bar
  NProgress.done()
})
