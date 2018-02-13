import { mount } from 'vue-test-utils';
import { createRenderer } from 'vue-server-renderer';
import Tab from "../src/components/tab/Tab.vue";

describe('Tab.vue', () => {
    const renderer = createRenderer();
    it('should initialize correctly', () => {
        const wrapper = mount(Tab);

        renderer.renderToString(wrapper.vm, (err, str) => {
            expect(str).toMatchSnapshot();
        });
    })
});
