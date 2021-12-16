package com.raven;

@FunctionalInterface
public interface Condition {
    boolean check(Person p);
}
