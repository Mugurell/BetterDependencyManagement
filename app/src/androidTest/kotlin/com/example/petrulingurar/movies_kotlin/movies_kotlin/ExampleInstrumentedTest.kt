package com.example.petrulingurar.movies_kotlin.movies_kotlin

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.amshove.kluent.shouldEqual


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        "com.example.petrulingurar.movies_kotlin.movies_kotlin.debug" shouldEqual appContext.packageName
    }
}
