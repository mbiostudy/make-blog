<template>
  <v-content id="home" class="white">
    <router-view :key="key" />
  </v-content>
</template>

<script>
export default {
  name: 'AppMain',
  computed: {
    key() {
      return this.$route.path
    }
  }
}
</script>
