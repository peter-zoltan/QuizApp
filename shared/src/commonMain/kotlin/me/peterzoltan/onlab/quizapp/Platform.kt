package me.peterzoltan.onlab.quizapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform