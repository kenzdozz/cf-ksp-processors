plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spotless)
    alias(libs.plugins.ksp)
}

group = "com.cf.ksp.processors"

version = "1.0.0"

repositories { mavenCentral() }

kotlin { jvmToolchain(23) }

java { toolchain.languageVersion.set(JavaLanguageVersion.of(23)) }

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.ksp.symbol.processing)
    implementation(libs.snake.yaml)
    implementation(libs.koin.annotations)

    testImplementation(kotlin("test"))
}

spotless {
    kotlin {
        target("src/**/*.kt")
        trimTrailingWhitespace()
        endWithNewline()
        ktfmt("0.54").googleStyle()
    }
}

tasks.test {
    useJUnitPlatform()
}
