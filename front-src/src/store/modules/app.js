const state = {
  drawer: false
}

const mutations = {
  toggleDrawer: state => (state.drawer = !state.drawer)
}
export default {
  namespaced: true,
  state,
  mutations
}
