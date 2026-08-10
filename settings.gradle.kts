rootProject.name = "llama-cloud-admin-root"

val projectNames = rootDir.listFiles()
    ?.asSequence()
    .orEmpty()
    .filter { file ->
        file.isDirectory &&
        file.name.startsWith("llama-cloud-admin") &&
        file.listFiles()?.asSequence().orEmpty().any { it.name == "build.gradle.kts" }
    }
    .map { it.name }
    .toList()
println("projects: $projectNames")
projectNames.forEach { include(it) }
