package com.reedoei;

import com.reedoei.testrunner.example.java.Data;
import org.junit.Test;

public class TestDiagnosisSamples {
    private static Data d = new Data(1, 2);

    @Test
    public void testPolluter() {
        d = new Data(4, 3);
    }

    @Test
    public void testVictim() {
        if (d.x == 1 || d.i.a == 3) {
            throw new RuntimeException("Failed because of no setup!");
        }
    }

    // This test actually "repollutes", but it counts as cleaner in this case
    @Test
    public void testPollutionCleaner() {
        d = new Data(1, 2);
    }
}

