<template>
  <v-btn
    v-if="!item.hidden && item.meta"
    :to="resolvePath(item.path)"
    class="ml-0 hidden-sm-and-down"
    text
  >{{ item.meta.title }}</v-btn>
</template>

<script>
import path from 'path'
export default {
  name: 'ToolbarItem',
  props: {
    item: {
      type: Object,
      required: true
    },
    basePath: {
      type: String,
      default: ''
    }
  },
  methods: {
    resolvePath(routePath) {
      return path.resolve(this.basePath, routePath)
    }
  }
}
</script>

<style>
</style>
