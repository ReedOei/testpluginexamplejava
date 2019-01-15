package com.reedoei.testrunner.example.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

// use this to ensure that dependency does not manifest in the default order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConfigTest {
    @Test
    public void aTestSetPolluter() {
        Config.settingA(10);
        assertEquals(10, Config.settingA());
        Config.settingB(5);
        assertEquals(5, Config.settingB());
    }

    @Test
    public void bTestResetCleaner() {
        Config.settingA(92);
        Config.settingB(5);
        Config.reset();
        assertEquals(0, Config.settingA());
        assertEquals(0, Config.settingB());
    }

    @Test
    public void cTestDefaultSettingsVictim() {
        assertEquals(0, Config.settingA());
        assertEquals(0, Config.settingB());
    }
}
