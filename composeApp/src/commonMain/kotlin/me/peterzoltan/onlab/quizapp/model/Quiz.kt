package me.peterzoltan.onlab.quizapp.model

class Quiz {

    private var questions = mutableListOf<Question>()

    fun addQuestion(question: Question) { questions.add(question) }

}