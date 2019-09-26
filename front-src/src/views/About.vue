<template>
  <v-container class="md">
    <Viewer :value="contents" />
  </v-container>
</template>

<script>
import 'highlight.js/styles/rainbow.css'
import '../markdown.css'
import { Viewer } from '@toast-ui/vue-editor'
export default {
  components: {
    Viewer
  },
  data() {
    return {
      title: '',
      date: '',
      categories: '',
      author: ''
    }
  },
  computed: {
    param: function() {
      return this.$route.params
    },
    contents() {
      return `# mbiostudy-blog

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
    }
  },
  created() {
    console.log(this.param)
    console.log(this.param.id)
  }
}
</script>
