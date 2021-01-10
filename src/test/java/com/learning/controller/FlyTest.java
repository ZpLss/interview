package com.learning.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyTest {

    @Test
    public void fly() {
        assertEquals("bird", new Fly().fly("bird"));
    }
}