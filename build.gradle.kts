buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("commons-configuration:commons-configuration:1.10")
    }
}

plugins {
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.jbake)
}
