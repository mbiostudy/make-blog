const getters = {
  roles: state => state.user.roles,
  permission_routes: state => state.permission.routes,
  menus: state => state.permission.menus,
  drawer: state => state.app.drawer
}

export default getters
