package com.github.wonno.tgaot;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    @Test
    void getMessage() {
        Hello demo = new Hello("U!");
        assertEquals("Hello U!", demo.getMessage());
    }
}
