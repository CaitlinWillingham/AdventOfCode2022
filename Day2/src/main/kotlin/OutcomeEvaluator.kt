object OutcomeEvaluator {
    fun evaluateMove(move: String): Int {
        var score: Int = 0
        when (move) {
            "B X" -> score = 1
            "C Y" -> score = 2
            "A Z" -> score = 3
            "A X" -> score = 4
            "B Y" -> score = 5
            "C Z" -> score = 6
            "C X" -> score = 7
            "A Y" -> score = 8
            "B Z" -> score = 9

        }
        return score;
    }

    fun predictScore(move: String): Int {
        var score: Int = 0

        when (move) {
            "A Y" -> score = evaluateMove("A X")
            "B Y" -> score = evaluateMove("B Y")
            "C Y" -> score = evaluateMove("C Z")
            "A X" -> score = evaluateMove("A Z")
            "B X" -> score = evaluateMove("B X")
            "C X" -> score = evaluateMove("C Y")
            "A Z" -> score = evaluateMove("A Y")
            "B Z" -> score = evaluateMove("B Z")
            "C Z" -> score = evaluateMove("C X")
        }
        return score
    }
}