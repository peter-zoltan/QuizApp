package me.peterzoltan.onlab.quizapp.model

import org.jetbrains.compose.resources.DrawableResource

class Question(
    val text: String,
    val answers: List<String>,
    correctIndex: Int,
    time : Long
) {

    var image : DrawableResource? = null

    val time = if (time > 0) time else 0

    val correctIndex = if (correctIndex > 0) correctIndex else 0

    constructor(
        text: String,
        answers: List<String>,
        correctAnswer: String,
        time : Long
    ) : this(text, answers, answers.indexOf(correctAnswer), time) {}

    fun correctAnswer() = answers[correctIndex]

    fun setImage(image: DrawableResource) { this.image = image }

}