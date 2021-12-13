package loveh.myapplication.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val q1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            arrayListOf(
                "Argentina",
                "Australia",
                "Armenia",
                "Austria",
            ),
            0
        )
       questionsList.add(q1)
        val q2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            arrayListOf(
                "Belgium",
                "Brazil",
                "Sweden",
                "Japan",
            ),
            1
        )
        questionsList.add(q2)

        return questionsList
    }
}