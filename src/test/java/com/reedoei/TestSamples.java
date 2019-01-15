package com.reedoei;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Random;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSamples {
    @Test
    public void aTest1() {
        if (new Random().nextInt(4) == 0) {
            throw new RuntimeException("Failed!");
        }
    }

    static int x = 1;

    @Test
    public void bTest2() {
        if (x != 1) {
            throw new RuntimeException("Failed!");
        }
        x = 0;
    }

    @Test
    public void cTest3() {
        if (x != 0) {
            throw new RuntimeException("failed!");
        }
    }

    @Test
    public void dTest4() {
        if (x != 0) {
            if (new Random().nextInt(3) == 0) {
                throw new RuntimeException("failed!");
            }
        }
    }

    @Test
    public void eTest7() {
        x++;
    }
}
