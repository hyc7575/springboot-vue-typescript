import { mount } from 'vue-test-utils';
import { createRenderer } from 'vue-server-renderer';
import HelloWorld from "../src/components/hello-world/HelloWorld.vue";

describe('HelloWorld.vue', () => {
    const renderer = createRenderer();
    it('should initialize correctly', () => {
        const wrapper = mount(HelloWorld);
        
        expect(wrapper.vm.msg).toEqual('Hello!!'); // msg data값과 일치하는지 테스트

        renderer.renderToString(wrapper.vm, (err, str) => {
            expect(str).toMatchSnapshot(); // 테스트 내에서 server랜더링 된 값을 string화 하여 snapShot 저장
        });
    })
});
