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
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.git.publish)
}

gitPublish {
    repoUri.set("git@github.com:YouDoGood/blog.git")
    branch.set("gh-pages")
    sign.set(false)
    contents {
        from(tasks.named("bake"))
    }
}