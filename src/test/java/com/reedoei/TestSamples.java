package com.reedoei;

import org.junit.Test;

import java.util.Random;

public class TestSamples {
    @Test
    public void test1() {
        if (new Random().nextInt(4) == 0) {
            throw new RuntimeException("Failed!");
        }
    }

    static int x = 1;

    @Test
    public void test2() {
        if (x != 1) {
            throw new RuntimeException("Failed!");
        }

        x = 0;
    }

    @Test
    public void test3() {
        if (x != 0) {
            throw new RuntimeException("failed!");
        }
    }

    @Test
    public void test4() {
        if (x != 0) {
            if (new Random().nextInt(3) == 0) {
                throw new RuntimeException("failed!");
            }
        }
    }

    @Test
    public void test5() {
        org.junit.Assume.assumeTrue(false);
    }

    @org.junit.Ignore
    @Test
    public void test6() {

    }

    @Test
    public void test7() {
        x++;
    }
}

