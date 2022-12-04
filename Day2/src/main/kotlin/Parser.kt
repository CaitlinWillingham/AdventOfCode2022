import java.io.File
import java.io.InputStream
import java.net.URI

object Parser {

    fun parse(uri: URI): List<Int> {
        val inputStream: InputStream = File(uri).inputStream()
        val results: MutableList<Int> = mutableListOf()

        inputStream.bufferedReader().useLines { lines ->
            lines.forEach { s ->
                results.add(OutcomeEvaluator.predictScore(s))
            }
        }

        return results;

    }

}