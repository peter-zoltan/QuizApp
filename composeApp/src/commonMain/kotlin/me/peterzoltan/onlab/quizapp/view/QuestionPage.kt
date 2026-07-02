package me.peterzoltan.onlab.quizapp.view

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import me.peterzoltan.onlab.quizapp.viewModel.QuizViewModel

@Composable
fun QuestionPage(vm: QuizViewModel) {

    val text = vm.text()

    Button(
        onClick = { vm.current++ }
    ) {
        Text(text)
    }

}