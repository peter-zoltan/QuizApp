package me.peterzoltan.onlab.quizapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import me.peterzoltan.onlab.quizapp.model.Question
import me.peterzoltan.onlab.quizapp.model.Quiz
import me.peterzoltan.onlab.quizapp.view.QuestionPage
import me.peterzoltan.onlab.quizapp.viewModel.QuizViewModel


@Composable
@Preview
fun App() {

    val quiz = Quiz()
    quiz.addQuestion(Question(
        text = "First Question",
        answers = listOf("a", "b"),
        correctIndex = 0,
        time = 20_000
    ))
    quiz.addQuestion(Question(
        text = "Second Question",
        answers = listOf("a", "b"),
        correctIndex = 0,
        time = 20_000
    ))

    MaterialTheme {
        QuestionPage(vm = QuizViewModel(quiz))
    }
}