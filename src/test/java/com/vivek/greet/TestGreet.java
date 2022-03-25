package com.vivek.greet;

import com.vivek.greet.controller.GreetController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGreet {

    @Autowired
    private GreetController controller;

    @Test
    public void contextLoads(){
        Assertions.assertNotNull(controller);
    }

    @Test
    public void canGreet(){
        Assertions.assertEquals("Hello random person!", controller.firstPage());
    }
}
