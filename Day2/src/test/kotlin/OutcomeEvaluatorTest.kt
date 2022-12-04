import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class OutcomeEvaluatorTest {

    @Test
    fun scoreIsReturned() {
        var result = OutcomeEvaluator.evaluateMove("A Y")
        assertTrue { 8 == result }

        result = OutcomeEvaluator.evaluateMove("B X")
        assertTrue { 1 == result }

        result = OutcomeEvaluator.evaluateMove("C Z")
        assertTrue { 6 == result }
    }


    @Test
    fun scoreIsCorrectlyPredicted() {
        var result = OutcomeEvaluator.predictScore("A Y")
        assertTrue { 4 == result }

        result = OutcomeEvaluator.predictScore("B X")
        assertTrue { 1 == result }

        result = OutcomeEvaluator.predictScore("C Z")
        assertTrue { 7 == result }
    }
}