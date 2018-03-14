package com.example.petrulingurar.movies_kotlin.movies_kotlin

import org.amshove.kluent.shouldEqual
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


// Simple Junit test
internal class UtilsTest {
    @Test
    fun name() {
        42 shouldEqual Utils().return42()
    }
}