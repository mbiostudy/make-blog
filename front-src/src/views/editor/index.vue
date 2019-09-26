<template>
  <v-container grid-list-md class="md">
    <h1>글작성 페이지</h1>
    <v-form>
      <v-text-field v-model="form.title" label="글 제목" single-line required />
      <v-text-field v-model="form.subTitle" label="글 부제목" single-line required />
      <v-text-field v-model="form.author" label="작성자" single-line required />
      <Editor
        ref="markdownEditor"
        v-model="form.content"
        height="500px"
        mode="markdown"
        :options="editorOptions"
      />
      <v-btn color="primary" class="mt-4 mr-2 mb-4" @click="sumbit">Submit</v-btn>
      <v-btn @click="clear">clear</v-btn>
    </v-form>
    <v-btn @click="getHtml">getHtml</v-btn>
  </v-container>
</template>
<script>
import '../../markdown.css'
import 'tui-editor/dist/tui-editor.css'
// import 'tui-editor/dist/tui-editor-contents.css'
import 'codemirror/lib/codemirror.css'
import Editor from '@toast-ui/vue-editor/src/Editor.vue'

const defaultContent = `# mbiostudy-blog

## Project setup
\`\`\`bash
npm install
\`\`\`

### Compiles and hot-reloads for development
\`\`\`bash
npm run serve
\`\`\`

### Compiles and minifies for production
\`\`\`bash
npm run build
\`\`\`

### Run your tests
\`\`\`bash
npm run test
\`\`\`

### Lints and fixes files
\`\`\`bash
npm run lint
\`\`\`

### Build Image
\`\`\`
SNAPSHOT : make build-SNAPSHOT TAG={version}

PROD : make build-prod TAG={version}
\`\`\`

\`\`\`javascript
export default {
  name: 'HomePage',
  data() {
    return {
      msg: 'HomePage'
    }
  }
}
console.log('afa')
\`\`\`

\`\`\`html
<template>
  <v-container class="md">
    <Viewer :value="contents" />
  </v-container>
</template>

\`\`\`

### Deploy Image
\`\`\`docker
SNAPSHOT : make push-SNAPSHOT TAG={version}

PROD : make push-prod TAG={version}
\`\`\`

\`\`\`javascript
function $initHighlight(block, cls) {
  try {
    if (cls.search(/\bno\-highlight\b/) != -1)
      return process(block, true, 0x0F) +
             \` class="\${cls}"\`;
  } catch (e) {
    /* handle exception */
  }
  for (var i = 0 / 2; i < classes.length; i++) {
    if (checkCondition(classes[i]) === undefined)
      console.log('undefined');
  }

  return (
    <div>
      <web-component>{block}</web-component>
    </div>
  )
}

export  $initHighlight;
\`\`\`


\`\`\`java
/**
 * @author John Smith <john.smith@example.com>
*/
package l2f.gameserver.model;

public abstract class L2Char extends L2Object {
  public static final Short ERROR = 0x0001;

  public void moveTo(int x, int y, int z) {
    _ai = null;
    log("Should not be called");
    if (1 > 5) { // wtf!?
      return;
    }
  }
}
\`\`\`

`

export default {
  components: {
    Editor
  },
  data() {
    return {
      editorOptions: {
        minHeight: '200px',
        language: 'ko_KR',
        hideModeSwitch: true
      },
      form: {
        title: '',
        subTitle: '',
        author: '',
        content: defaultContent
      },
      html: ''
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
      this.form.subTitle = ''
      this.form.content = ''
    },
    getHtml() {
      this.html = this.$refs.markdownEditor.invoke('getHtml')
      console.log(this.html)
    }
  }
}
</script>
