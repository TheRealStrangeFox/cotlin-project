package com.example.myapplication

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val  CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ge,
            "Georgia",
            "Portugal",
            "United Kingdom",
            "Spain",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.brazil,
            "Angola",
            "Brazil",
            "Australia",
            "Armenia",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.chile,
            "Belarus",
            "Belize",
            "Brunei",
            "Chile",
            4
        )

        questionsList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.china,
            "Bahamas",
            "china",
            "Barbados",
            "Belize",
            2
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.france,
            "Gabon",
            "France",
            "Fiji",
            "Finland",
            2
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.germ,
            "Germany",
            "Georgia",
            "Greece",
            "none of these",
            1
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.jap,
            "Dominica",
            "Egypt",
            "Japan",
            "Ethiopia",
            3
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.kaz,
            "Ireland",
            "Iran",
            "Hungary",
            "Kazakhstan",
            4
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.portugal,
            "Australia",
            "Portugal",
            "Tuvalu",
            "United States of America",
            2
        )

        questionsList.add(que9)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.usa,
            "United States of America",
            "Jordan",
            "Sudan",
            "Palestine",
            1
        )

        questionsList.add(que10)

        return questionsList
    }
}