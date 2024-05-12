package com.mycompany.app.junit.digitaloceansources.annotations;

import com.mycompany.app.MyUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyUtilsTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("Set up Before class - @BeforeAll");
    }

    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("Tear Down After Class - @AfterAll");
    }

    @BeforeEach
    void setUp(){
        System.out.println("Set Up - @BeforeEach");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Tear Down - @AfterEach");
    }

    @Test
    void testAdd(){
        assertEquals(10, MyUtils.add(5,5));
        System.out.println("test addition");
    }

    @Test
    void testReverse(){
        assertEquals("cba", MyUtils.reverse("abc"));
        System.out.println("test reverse");

    }

}
