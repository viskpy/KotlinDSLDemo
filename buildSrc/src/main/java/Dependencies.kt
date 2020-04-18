const val kotlinVersion = "1.3.61"
const val gradleVersion = "3.5.3"

object AndroidSDK {
    const val compileSdk = 29
    const val buildTools = "29.0.2"
}

object DefaultConfig {
    const val applicationID = "com.vishal.kotlin    dsldemo"
    const val minSdk = 16
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object BuildTypes {
    const val release = "release"
}

object ProgaurdFile {
    const val textFile = "proguard-android-optimize.txt"
    const val ruleFile = "proguard-rules.pro"
}

object BuildPlugins {

    const val androidGradlePlugin = "com.android.tools.build:gradle:$gradleVersion"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val taskTypeClean = "clean"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinAndroidExtensions = "android.extensions"

    private const val mavenPushVersion = "3.6.3"
    const val mavenPush = "digital.wup.android-maven-publish"

}

object ApplicationLibs {
    private object Versions {
        const val appcompat = "1.1.0"
        const val ktx = "1.2.0"
        const val constraint = "1.1.3"
    }

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${kotlinVersion}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKTX = "androidx.core:core-ktx:${Versions.ktx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
}

object TestLibs {
    private object Versions {
        const val junit = "4.12"
        const val extJunit = "1.1.1"
        const val espresso = "3.2.0"
    }

    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
