<template>
  <v-container grid-list-xl justify-start>
    <v-layout row wrap>
      <Viewer :value="contents" />
    </v-layout>
  </v-container>
</template>

<script>
import 'tui-editor/dist/tui-editor-contents.css'
import 'highlight.js/styles/github.css'
import Viewer from '@toast-ui/vue-editor/src/Viewer.vue'
export default {
  components: {
    Viewer
  },
  data() {
    return {
      title: '',
      date: '',
      categories: '',
      author: '',
      contents: ''
    }
  },
  computed: {
    param: function() {
      return this.$route.params
    }
  },
  created() {
    console.log(this.param)
    console.log(this.param.id)
  }
}
</script>

<style>
</style>
