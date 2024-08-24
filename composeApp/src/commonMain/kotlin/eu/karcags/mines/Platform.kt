package eu.karcags.mines

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform