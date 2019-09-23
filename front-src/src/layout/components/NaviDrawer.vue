<template>
  <v-navigation-drawer v-model="drawer" absolute temporary>
    <v-list>
      <v-list-item v-for="(item, i) in menus" :key="i" :to="resolvePath(item.path)">
        <v-list-item-content v-if="!item.hidden && item.meta" v-text="item.meta.title" />
      </v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
import { mapGetters } from 'vuex'
import path from 'path'
export default {
  name: 'NaviDrawer',
  data() {
    return {
      listItem: []
    }
  },
  computed: {
    ...mapGetters(['menus']),
    drawer: {
      get() {
        return this.$store.getters.drawer
      },
      set(val) {
        this.$store.dispatch('app/setDrawer', val)
      }
    }
  },
  methods: {
    resolvePath(routePath) {
      return path.resolve(routePath)
    },
    onClick() {
      this.$store.dispatch('app/setDrawer', false)
    }
  }
}
</script>

<style>
</style>