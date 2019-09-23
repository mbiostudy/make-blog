<template>
  <v-container grid-list-xl justify-start>
    <v-layout row wrap>
      <v-flex v-for="(item, i) in items" :key="i" flex xs12 md3>
        <v-hover v-slot:default="{ hover }">
          <v-card class="mx-auto" max-width="230" flat>
            <router-link :to="`/post/${item.id}`">
              <v-img width="100%" height="250px" :src="item.img_path">
                <div v-if="hover" class="grey" style="height: 100%; opacity:.3" />
              </v-img>
              <v-card-title>{{ item.title }}</v-card-title>
            </router-link>
            <v-card-text>
              <div>{{ item.date }}</div>
              <span class="text--primary">
                <span>{{ item.subtitle }}</span>
              </span>
            </v-card-text>
          </v-card>
        </v-hover>
      </v-flex>
    </v-layout>
  </v-container>
</template>
<script>
export default {
  data: () => ({
    items: [
      {
        id: '1',
        title: '자바스크립트 async와 await',
        date: 'July 30, 2019',
        subtitle:
          '(중급) 자바스크립트 개발자를 위한 async, await 사용법 설명. 쉽게 알아보는 자바스크립트 async await 개념, 사용법, 예제 코드, 예외 처리 방법',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '이벤트 버블링, 이벤트 캡처 그리고 이벤트 위임까지',
        date: 'March 30, 2019',
        subtitle:
          '(기본) 이벤트 버블링, 이벤트 캡처링, 그리고 이벤트 위임까지 이벤트 전달 방식과 관련된 모든 것을 파헤쳐 봅니다.',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: 'Vue.js 개발자를 위한 ES6 입문서(e북) 안내',
        date: 'May 30, 2019',
        subtitle: 'Vue.js 코딩을 더 편하게 해줄 주요 ES6 문법을 알아봅니다.',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '웹 개발할 때 알아두면 좋은 리눅스 기본 명령어',
        date: 'January 30, 2019',
        subtitle:
          '(기본) 웹 개발에서 CLI 도구를 사용할 때 자주 사용하는 리눅스 기본 명령어 안내. pwd, touch, ls, rm, cd 등',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '자바스크립트 비동기 처리와 콜백 함수',
        date: 'December 29, 2018',
        subtitle:
          '(중급) 중급 자바스크립트 개발자가 되기 위한 자바스크립트 비동기 처리와 콜백 함수 이해하기. 콜백 지옥과 해결 방법 등',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '자바스크립트 Promise 쉽게 이해하기',
        date: 'July 30, 2018',
        subtitle:
          '(중급) 자바스크립트 입문자를 위한 Promise 설명. 쉽게 알아보는 자바스크립트 Promise 개념, 사용법, 예제 코드. 예제로 알아보는 then(), catch() 활용법',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '(중급) Vue.js 라우터 네비게이션 가드 알아보기',
        date: 'April 30, 2018',
        subtitle:
          '뷰 라우터를 사용할 때 알아두면 좋은 네비게이션 가드 설명. 특정 페이지로 넘어가기 전에 검증 로직 추가하기',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        title: 'Vue.js 개발을 위한 주요 ES6 문법 4가지',
        date: 'June 2, 2018',
        subtitle:
          '(번역) Vue.js로 개발할 때 도움이 되는 ES6 문법 4가지를 간단한 설명과 예제로 살펴봅니다. 화살표 함수, 템플릿 리터럴, 모듈, 구조 분해 등',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '자바스크립트 코딩할 줄 모르는 사람이 필요한가요?',
        date: 'July 1, 2017',
        subtitle:
          '(번역) 컨퍼런스 질문에서 시작된 고민이 개발자 커뮤니티의 건설적인 방향으로 이어지기까지',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: 'Webpack(웹팩) 캐싱 전략',
        date: 'December 10, 2017',
        subtitle:
          '(입문) Webpack CommonsChunkPlugin을 이용한 캐싱 전략 및 초기화 코드 분리법',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '최신 프론트엔드 치트 시트(Cheat Sheet) 한눈에 보기',
        date: 'November 21, 2017',
        subtitle:
          '(번역) Angular, React, Vue.js, ES6, GraphQL, Flexbox, 정규표현식, Sass, Redux, Vuex, 자바스크립트, Stylus 의 속성 및 API',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '자바스크립트의 동작원리: 엔진, 런타임, 호출 스택',
        date: 'August 15, 2017',
        subtitle:
          '(번역) 자바스크립트가 엔진에서 어떻게 돌아가나? 런타임과 호출 스택 해부',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      },
      {
        id: '1',
        title: '자바스크립트의 동작원리: 엔진, 런타임, 호출 스택',
        date: 'August 15, 2017',
        subtitle:
          '(번역) 자바스크립트가 엔진에서 어떻게 돌아가나? 런타임과 호출 스택 해부',
        author: 'mbio',
        img_path: `https://source.unsplash.com/collection/466697/${Math.floor(
          Math.random() * 206
        )}`
      }
    ]
  })
}
</script>

<style scoped>
a {
  color: black;
  text-decoration: none;
}
</style>