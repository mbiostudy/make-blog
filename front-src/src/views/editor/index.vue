<template>
  <v-container grid-list-xl>
    <h1>글작성 페이지</h1>
    <v-layout wrap row>
      <v-form>
        <v-text-field v-model="form.title" label="글 제목" single-line required />
        <v-text-field v-model="form.author" label="작성자" single-line required />
        <Editor v-model="form.content" height="500px" :options="editorOptions" />
        <v-btn @click="sumbit">Submit</v-btn>
        <v-btn @click="clear">clear</v-btn>
      </v-form>
    </v-layout>
  </v-container>
</template>
<script>
import 'tui-editor/dist/tui-editor.css'
import 'tui-editor/dist/tui-editor-contents.css'
import 'codemirror/lib/codemirror.css'
import { Editor } from '@toast-ui/vue-editor'

export default {
  components: {
    Editor
  },
  data() {
    return {
      editorOptions: {
        minHeight: '200px',
        language: 'ko_KR'
      },
      form: {
        title: '',
        author: '',
        content: ''
      }
    }
  },
  methods: {
    sumbit() {
      console.log(this.form)
      console.log(this.form.content)
    },
    clear() {
      this.form.title = ''
      this.form.author = ''
      this.form.content = ''
    }
  }
}
</script>
