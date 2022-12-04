package org.example;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class MainTest  {
    @Test
    public void test1() { //sum

        int answer = Main.sum(6, 2);
        assertEquals(8, answer);
    }
    @Test
    public void test2() {

        int answer = Main.sum(10, 2);
        assertEquals(12, answer);
    }
    @Test
    public void test3() { //sumTwo

        int answer = Main.sumTwo(10, 2);
        assertEquals(8, answer);
    }
    @Test
    public void test4() {

        int answer = Main.sumTwo(100, 20);
        assertEquals(80, answer);
    }
    @Test
    public void test5() { //sumthree

        int answer = Main.sumThree(6, 2);
        assertEquals(12, answer);
    }
    @Test
    public void test6() {

        int answer = Main.sumThree(10, 2);
        assertEquals(20, answer);
    }
    @Test
    public void test7() { //sumFor

        int answer = Main.sumFor(6, 2);
        assertEquals(3, answer);
    }
    @Test
    public void test8() {

        int answer = Main.sumFor(10, 2);
        assertEquals(5, answer);
    }

}