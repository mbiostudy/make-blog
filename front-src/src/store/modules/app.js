const state = {
  drawer: false
}

const mutations = {
  TOOGGLE_DRAWER: state => {
    state.drawer = !state.drawer
  },
  SET_DRAWER: (state, payload) => (state.drawer = payload)
}

const actions = {
  toggleDrawer({ commit }) {
    commit('TOOGGLE_DRAWER')
  },
  setDrawer({ commit }, payload) {
    commit('SET_DRAWER', payload)
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}
