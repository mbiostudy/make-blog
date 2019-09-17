const state = {
  roles: []
}

const mutations = {
  SET_ROLES: (state, roles) => {
    state.roles = roles
  }
}

const actions = {
  // get user info
  getInfo({ commit }) {
    return new Promise(resolve => {
      const data = 'admin'
      commit('SET_ROLES', data)
      resolve(data)
    })
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}
