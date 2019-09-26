<template>
  <v-app-bar app flat class="grey lighten-5">
    <v-app-bar-nav-icon class="hidden-md-and-up" @click="handleDrawer" />
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
        <span v-for="route in menus" :key="route.path">
          <v-btn :to="route.path" class="ml-0 hidden-sm-and-down" text>{{ route.meta.title }}</v-btn>
        </span>

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
import { mapGetters } from 'vuex'

export default {
  name: 'Toolbar',
  computed: {
    ...mapGetters(['menus'])
  },
  methods: {
    handleDrawer() {
      this.$store.dispatch('app/toggleDrawer')
    }
  }
}
</script>

<style></style>
