package com.reedoei.testrunner.example.java;

public class Data {
    public final int x;
    public final int y;
    public final Inner i;

    public Data(final int x, final int y) {
        this.x = x;
        this.y = y;

        i = new Inner(x + y);
    }

    public static class Inner {
        public final int a;

        public Inner(final int a) {
            this.a = a;
        }
    }
}

