object Dependencies {

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    }

    object KotlinX {
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.10.0"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.1"
    }

    object AndroidX {
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0-alpha02"
        const val appCompat = "androidx.appcompat:appcompat:1.1.0-alpha02"
        const val ktxCore = "androidx.core:core-ktx:1.1.0-alpha04"
        const val cardView = "androidx.cardview:cardview:1.0.0"

        object LifeCycle {
            private const val version = "2.0.0"
            const val runtime = "androidx.lifecycle:lifecycle-runtime:$version"
            const val extentions = "androidx.lifecycle:lifecycle-extensions:$version"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
        }
    }

    object Google {
        const val material = "com.google.android.material:material:1.1.0-alpha03"
    }

    object Fuel {
        private const val version = "2.0.1"
        const val fuel = "com.github.kittinunf.fuel:fuel:$version"
        const val android = "com.github.kittinunf.fuel:fuel-android:$version"
        const val coroutines = "com.github.kittinunf.fuel:fuel-coroutines:$version"
        const val serialization = "com.github.kittinunf.fuel:fuel-kotlinx-serialization:$version"
    }

    object Glide {
        private const val version = "4.9.0"
        const val glide = "com.github.bumptech.glide:glide:$version"
        const val annotation = "com.github.bumptech.glide:compiler:$version"
    }

    object Test {
        val junit = "junit:junit:4.12"

        object Android {
            val runner = "androidx.test:runner:1.1.2-alpha01"
            val espresso = "androidx.test.espresso:espresso-core:3.1.2-alpha01"
        }
    }
}