package org.spring.springboot.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 *
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }
}
