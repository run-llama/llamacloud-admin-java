plugins {
    id("llama-cloud-admin.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":llama-cloud-admin-core"))
    implementation(project(":llama-cloud-admin-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :llama-cloud-admin-example:run` to run `Main`
    // Use `./gradlew :llama-cloud-admin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "ai.llamaindex.llamacloudadmin.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
