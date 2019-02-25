object Versions {
    const val kotlin = "1.3.21"
    const val gradlePlugin = "3.3.1"

    const val compileSdk = 28
    const val targetSdk = 28
    const val minSdk = 21

    // (c) DroidKaigi 2019
    private const val major = 1 // アプリのあり方に関わる変更
    private const val minor = 0 // 機能の追加・変更・削除
    private const val patch = 0 // コードの修正、ライブラリの変更、リファクタリング等

    private const val offset = 0
    private const val env = "alpha-"
    val code = (major * 10000 + minor * 100 + patch) * 100 + offset

    val name = "$env$major.$minor.$patch"

}