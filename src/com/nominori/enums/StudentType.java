package com.nominori.enums;

public enum StudentType {

    NORMAL(1),
    ADVANCED(2);

    private final int value;

    StudentType(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
