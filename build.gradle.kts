buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()
        maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local")
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.android.tools.build:gradle:7.0.0-beta03")
        classpath("io.realm.kotlin:gradle-plugin:0.2.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}