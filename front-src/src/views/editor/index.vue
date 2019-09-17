<template>
  <div class="components-container">
    <div class="editor-container">
      <markdown-editor
        ref="markdownEditor"
        v-model="content"
        :options="{previewStyle:'tab'}"
        height="300px"
      />
    </div>

    <v-btn style="margin-top:80px;" type="primary" @click="getHtml">Get HTML</v-btn>
    <div v-html="html" />
  </div>
</template>

<script>
import MarkdownEditor from '@/components/MarkdownEditor'

const content = `
**This is test**

* vue
* element
* webpack

`
export default {
  name: 'MarkdownDemo',
  components: { MarkdownEditor },
  data() {
    return {
      content,
      html: ''
    }
  },
  methods: {
    getHtml() {
      this.html = this.$refs.markdownEditor.getHtml()
      console.log(this.html)
    }
  }
}
</script>

<style scoped>
.editor-container {
  margin-bottom: 30px;
}
.components-container {
  margin: 30px 50px;
  position: relative;
}
</style>
