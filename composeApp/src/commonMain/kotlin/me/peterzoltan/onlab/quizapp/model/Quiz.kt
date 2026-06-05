package me.peterzoltan.onlab.quizapp.model

class Quiz {

    var questions = mutableListOf<Question>()

    fun addQuestion(question: Question) { questions.add(question) }

}