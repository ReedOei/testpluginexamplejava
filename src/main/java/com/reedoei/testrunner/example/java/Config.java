package com.reedoei.testrunner.example.java;

public class Config {
    private static int SETTING_A = 0;
    private static int SETTING_B = 0;

    public static void settingA(final int settingA) {
        SETTING_A = settingA;
    }

    public static int settingA() {
        return SETTING_A;
    }

    public static void settingB(final int settingB) {
        SETTING_B = settingB;
    }

    public static int settingB() {
        return SETTING_B;
    }

    public static void setBothSettings(final int settingA, final int settingB) {
        SETTING_A = settingA;
        SETTING_B = settingB;
    }

    public static void reset() {
        setBothSettings(0, 0);
    }
}
