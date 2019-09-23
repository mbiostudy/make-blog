<template>
  <v-app class="pa-2">
    <Toolbar />
    <NaviDrawer />
    <AppMain />
    <AppFooter />
  </v-app>
</template>

<script>
import { AppMain, Toolbar, AppFooter, NaviDrawer } from './components'

export default {
  name: 'Layout',
  components: {
    AppMain,
    Toolbar,
    AppFooter,
    NaviDrawer
  }
}
</script>

<style></style>
