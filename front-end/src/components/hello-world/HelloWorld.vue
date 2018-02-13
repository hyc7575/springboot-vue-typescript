<template>
	<div class="hello">
		<h1>{{ msg }}</h1>
		<img src="/assets/logo.png">
		<button @click="clickHandler">
			button
		</button>
	</div>
</template>

<script lang="ts">
import Vue from "vue";
import Component from "vue-class-component";

interface HelloWorldInterface {
	msg: string;
	clickHandler(): void;
}

@Component({
	created() {
		console.log('HelloWorld created');
	}
})
export default class HelloWorld extends Vue implements HelloWorldInterface {
	msg = "Hello!!";
	clickHandler() {
		console.log('click Handler');
	}
}
</script>
