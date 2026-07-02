package me.peterzoltan.onlab.quizapp.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import me.peterzoltan.onlab.quizapp.model.Question
import me.peterzoltan.onlab.quizapp.model.Quiz

class QuizViewModel (val quiz: Quiz) {

    var current by mutableStateOf(0)

    fun text() = quiz.questions[current].text

    fun answers() = ArrayList(quiz.questions[current].answers)

    fun image() = quiz.questions[current].image

    fun time() = quiz.questions[current].time

}