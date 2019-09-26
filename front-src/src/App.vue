<template>
  <v-app class="pa-2">
    <Toolbar />

    <NaviDrawer />

    <AppMain />

    <WriteButton />

    <AppFooter />
  </v-app>
</template>

<script>
import { AppMain, Toolbar, AppFooter, NaviDrawer, WriteButton } from '@/layout'

export default {
  name: 'App',
  components: {
    AppMain,
    Toolbar,
    AppFooter,
    NaviDrawer,
    WriteButton
  }
}
</script>
