package loveh.myapplication.quizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val options: ArrayList<String>,
    val correctAnswerIndex: Int
)
