<template>
  <v-footer class="py-4" dark height="auto">
    <v-container mx-auto>
      <v-layout wrap>
        <v-flex xs9>
          <v-btn
            fav
            small
            v-for="(item, i) in items"
            :key="i"
            :href="item.href"
            class="ml-0 mr-3"
            color="primary"
            target="_blank"
          >
            <v-icon v-text="item.icon" />
          </v-btn>
        </v-flex>
        <v-spacer />
        <v-btn class="mr-0" square title="Go to top" @click="$vuetify.goTo(0)">
          <v-icon>mdi-chevron-up</v-icon>
        </v-btn>
      </v-layout>
    </v-container>
  </v-footer>
</template>

<script>
export default {
  data: () => ({
    items: [
      {
        href: 'https://github.com/mbiostudy/make-blog',
        icon: 'mdi-github-circle'
      },
      {
        href: 'https://github.com/mbiostudy/make-blog',
        icon: 'mdi-instagram'
      }
    ]
  })
}
</script>

<style>
</style>
