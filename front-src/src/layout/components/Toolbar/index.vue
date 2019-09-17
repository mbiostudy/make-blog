<template>
  <v-app-bar app flat class="grey lighten-5">
    <v-app-bar-nav-icon class="hidden-md-and-up" @click="toggleDrawer" />
    <v-container mx-auto py-0>
      <v-layout>
        <router-link to="/">
          <v-img
            :src="require('@/assets/logo.png')"
            class="mr-5"
            contain
            height="48"
            width="48"
            max-width="48"
          />
        </router-link>
        <ToolbarItem
          v-for="route in permission_routes"
          :key="route.path"
          :item="route"
          :base-path="route.path"
        />
        <v-spacer />
        <v-text-field
          append-icon="mdi-magnify"
          flat
          hide-details
          solo-inverted
          style="max-width: 300px;"
        />
      </v-layout>
    </v-container>
  </v-app-bar>
</template>

<script>
import { mapGetters, mapMutations } from 'vuex'
import ToolbarItem from './ToolbarItem'
import path from 'path'
export default {
  name: 'Toolbar',
  components: {
    ToolbarItem
  },
  computed: {
    ...mapGetters(['permission_routes'])
  },
  methods: {
    ...mapMutations(['toggleDrawer']),
    resolvePath(routePath) {
      return path.resolve(this.basePath, routePath)
    }
  }
}
</script>

<style></style>
