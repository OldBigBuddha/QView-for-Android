plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("kotlinx-serialization")
}

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = "net.oldbigbuddha.hellokts"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.code
        versionName = Versions.name
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.stdLib)

    implementation(Dependencies.AndroidX.ktxCore)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.constraintlayout)
    implementation(Dependencies.AndroidX.recyclerView)
    implementation(Dependencies.AndroidX.cardView)

    // LifeCycle / LiveData / ViewModel
    implementation(Dependencies.AndroidX.LifeCycle.runtime)
    implementation(Dependencies.AndroidX.LifeCycle.extentions)
    annotationProcessor(Dependencies.AndroidX.LifeCycle.compiler)


    implementation(Dependencies.Google.material)

//    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    implementation(Dependencies.KotlinX.coroutines)
    implementation(Dependencies.KotlinX.serialization)

    // Fuel
    implementation(Dependencies.Fuel.fuel)
    implementation(Dependencies.Fuel.android)
    implementation(Dependencies.Fuel.coroutines)
    implementation(Dependencies.Fuel.serialization)

    // Glide
    implementation(Dependencies.Glide.glide)
    annotationProcessor(Dependencies.Glide.annotation)

    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.Android.runner)
    androidTestImplementation(Dependencies.Test.Android.espresso)
}
