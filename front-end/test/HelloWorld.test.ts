import { mount } from 'vue-test-utils';
import { createRenderer } from 'vue-server-renderer';
import HelloWorld from "../src/components/hello-world/HelloWorld.vue";

describe('HelloWorld.vue', () => {
    const renderer = createRenderer();
    it('should initialize correctly', () => {
        const wrapper = mount(HelloWorld);
        
        renderer.renderToString(wrapper.vm, (err, str) => {
            expect(str).toMatchSnapshot();
        });
    })
});
