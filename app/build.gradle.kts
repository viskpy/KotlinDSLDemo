plugins {
    id(BuildPlugins.androidApplication)
    kotlin(BuildPlugins.kotlinAndroid)
    kotlin(BuildPlugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(AndroidSDK.compileSdk)
    buildToolsVersion(AndroidSDK.buildTools)
    defaultConfig {
        applicationId = DefaultConfig.applicationID
        minSdkVersion(DefaultConfig.minSdk)
        targetSdkVersion(DefaultConfig.targetSdk)
        versionCode = DefaultConfig.versionCode
        versionName = DefaultConfig.versionName
        testInstrumentationRunner = DefaultConfig.instrumentationRunner
    }
    buildTypes {
        getByName(BuildTypes.release) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProgaurdFile.textFile),
                ProgaurdFile.ruleFile
            )
        }
    }
}

dependencies {
    implementation(ApplicationLibs.kotlin)
    implementation(ApplicationLibs.appcompat)
    implementation(ApplicationLibs.coreKTX)
    implementation(ApplicationLibs.constraintLayout)
    testImplementation(TestLibs.junit)
    androidTestImplementation(TestLibs.extJunit)
    androidTestImplementation(TestLibs.espresso)
}
