package me.peterzoltan.onlab.quizapp.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import me.peterzoltan.onlab.quizapp.model.Question
import me.peterzoltan.onlab.quizapp.model.Quiz

class QuizViewModel (quiz: Quiz) {

    val quiz by mutableStateOf(quiz)

    var current by mutableStateOf(0)

    fun getText() = quiz.questions[current].text

}