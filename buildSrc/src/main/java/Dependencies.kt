import sun.misc.Version

object Versions {
    val min_sdk = 21
    val target_sdk = 26
    val compile_sdk = 26
    val version_code = 1
    val version_name = "1.0"

    val kotlin = "1.2.21"
    val kotlin_coroutines = "0.22.2"
    val kapt = "1.2.0"
    val junit5 = "1.0.30"
    val gradle = "3.0.1"

    val support_lib = "27.0.2"
    val constraint_layout = "1.0.2"

    val retrofit = "2.3.0"
    val square_okhttp = "3.9.1"
    val gson = "2.8.2"
    val retrofit_coroutines = "1.0.0"

    val rxjava = "2.1.9"
    val rxandroid = "2.0.1"
    val rxkotlin = "2.2.0"
    val rxrelay = "2.0.0"

    val dagger = "2.14.1"
    val glide = "4.6.1"

    //    val jacoco = "0.1.2"
    val junit_launcher = "1.0.0"
    val junit4 = "4.12"
    val jacoco = "0.8.0"
    val detekt = "1.0.0.RC6-3"
    val ktlint = "0.14.0"
    val spek = "1.1.5"
    val kluent = "1.34"
    val mockito_kotlin = "1.5.0"
    val ui_tests_runner = "1.0.1"
    val espresso = "3.0.1"
    val hamcrest = "1.3"
}



object Deps {
    // gradle plugins
    val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val gradle_plugin_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val gradle_plugin_android = "com.android.tools.build:gradle:${Versions.gradle}"
    val gradle_plugin_junit5 = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit5}"
    val gradle_plugin_jacoco = "org.jacoco:org.jacoco.core:${Versions.jacoco}"
    val gradle_plugin_detekt = "gradle.plugin.io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.0.0.RC6-3"

    // android
    val android_app_compat_v7 = "com.android.support:appcompat-v7:${Versions.support_lib}"
    val android_support_v13 = "com.android.support:support-v13:${Versions.support_lib}"
    val android_constraint_layout = "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"
    val android_design = "com.android.support:design:${Versions.support_lib}"
    val android_recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.support_lib}"
    val android_cardview_v7 = "com.android.support:cardview-v7:${Versions.support_lib}"

    // network
    val network_retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val network_retrofit_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val network_square_okhttp = "com.squareup.okhttp3:okhttp:${Versions.square_okhttp}"
    val network_square_okhttp_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.square_okhttp}"
    val network_gson = "com.google.code.gson:gson:${Versions.gson}"
    val network_retrofit_coroutines_adapter =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.retrofit_coroutines}"

    // RX
    val rx_java = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    val rx_android = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    val rx_kotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
    val rx_relay = "com.jakewharton.rxrelay2:rxrelay:${Versions.rxrelay}"

    // utils
    val utils_dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val utils_dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
    val utils_dagger_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val utils_glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val utils_kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_coroutines}"
    val utils_kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    // apt
    val apt_dagger = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val apt_dagger_android = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    val apt_dagger_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val apt_glide = "com.github.bumptech.glide:compiler:${Versions.glide}"

    // tests
    val test_instrumentation_runner = "android.support.test.runner.AndroidJUnitRunner"
    val test_junit_platform_launcher = "org.junit.platform:junit-platform-launcher:${Versions.junit_launcher}"
    val test_util_orchestrator = "com.android.support.test:orchestrator:${Versions.ui_tests_runner}"

    val test_mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin}"
    val test_spek = "org.jetbrains.spek:spek-api:${Versions.spek}"
    val test_spek_junit = "org.jetbrains.spek:spek-junit-platform-engine:${Versions.spek}"
    val test_ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"
    val test_kluent = "org.amshove.kluent:kluent-android:${Versions.kluent}"

    val test_instrumented_support_runner = "com.android.support.test:runner:${Versions.ui_tests_runner}"
    val test_instrumented_support_runner_rules = "com.android.support.test:rules:${Versions.ui_tests_runner}"
    val test_instrumented_espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    val test_instrumented_annotations = "com.android.support:support-annotations:${Versions.support_lib}"
    val test_instrumented_hamcrest = "org.hamcrest:hamcrest-library:${Versions.hamcrest}"

    val test_impl_junit4 = "junit:junit:${Versions.junit4}"
    val test_impl_junit5 = "junit5.unitTests()"
    val test_compile_junit5 = "junit5.unitTestsRuntime()"
}