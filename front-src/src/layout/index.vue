<template>
  <v-app>
    <Toolbar />
    <AppMain />
    <AppFooter />
  </v-app>
</template>

<script>
import { AppMain, Toolbar, AppFooter } from './components'

export default {
  name: 'Layout',
  components: {
    AppMain,
    Toolbar,
    AppFooter
  }
}
</script>

<style></style>
