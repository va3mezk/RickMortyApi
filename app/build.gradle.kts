plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.victorescalante.rickmortyapi"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.victorescalante.rickmortyapi"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // Fragment
    implementation ("androidx.fragment:fragment-ktx:1.6.1")
// Activity
    implementation ("androidx.activity:activity-ktx:1.8.0")
// ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
// LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

// Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")

// Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

// Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

//dagger-hilt
    implementation ("com.google.dagger:hilt-android:2.40.5")
    ksp ("com.google.dagger:hilt-compiler:2.40.5")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    ksp("androidx.hilt:hilt-compiler:1.0.0")

//coil
    implementation("io.coil-kt:coil:1.4.0")

//fragment navigator

// Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.4")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.4")

// Feature module Support
    implementation("androidx.navigation:navigation-dynamic-features-fragment:2.7.4")

// Testing Navigation
    androidTestImplementation("androidx.navigation:navigation-testing:2.7.4")

//Paging
    implementation ("androidx.paging:paging-runtime-ktx:3.2.1")

//room
    implementation("androidx.room:room-runtime:2.5.2")
    ksp("androidx.room:room-compiler:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")

}


