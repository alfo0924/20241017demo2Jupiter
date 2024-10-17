package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class MainTest {

    @Test
    void main() {


    }

    @Test
    void add(){
        Main m = new Main();
        int expected = 11;
        int actual = m.add(1,2);
        assertEquals(expected,actual);
    }
    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }
    @BeforeAll
    static void initAll() {
    System.out.println("@BeforeAll initAll");
    }

    @BeforeEach
    void init() {
        Main m = new Main();
    System.out.println("@BeforeEach init");
    }

    @Test
    void succeedingTest() {
        System.out.println("@Test  test");
    }

//    @Test
//    void failingTest() {
//        fail("a failing test");
//    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }
//
//    @Test
//    void abortedTest() {
//        assumeTrue("abc".contains("Z"));
//        fail("test should have been aborted");
//    }

    @AfterEach
    void tearDown() {
    System.out.println("@AfterEach tear down");
    }

    @AfterAll
    static void tearDownAll() {
    System.out.println("@AfterAll tear down");
    }

}