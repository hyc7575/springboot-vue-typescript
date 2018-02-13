<template>
<div id="app">
  <ul class="gnb">
    <li>
      <a href="#/">index</a>
    </li>
    <li>
      <a href="#/tabSample">tabSample</a>
    </li>
  </ul>
  <HelloWorld />
  <router-view/>
</div>
</template>

<script lang="ts">
import Vue from "vue";
import Component from "vue-class-component";
import HelloWorld from './components/hello-world/HelloWorld.vue'

@Component({})
export default class App extends Vue {}
</script>
