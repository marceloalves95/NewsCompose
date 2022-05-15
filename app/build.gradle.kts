plugins {
    id("com.android.application")
    id("kotlin-android")
}
android {

    compileSdk = AppConfig.compileSdkVersion

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.testInstrumentationRunner

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Version.compose_version
    }
}
dependencies{
    implementation("br.com.core:compose:1.0.0")
    implementation("br.com.core:extensions:1.0.0")
//    implementation("androidx.navigation:navigation-compose:2.5.0-beta1")
//    implementation("androidx.navigation:navigation-runtime-ktx:2.4.2")
    kotlin()
    compose()
    composeTest()
}
