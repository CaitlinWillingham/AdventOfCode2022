import java.io.File
import java.io.InputStream
import java.net.URI

object Parser {

    fun parse(uri: URI): List<Char> {
        val inputStream: InputStream = File(uri).inputStream()
        val results: MutableList<Char> = mutableListOf()

        inputStream.bufferedReader().useLines { lines ->
            lines.forEach { s ->
                results.add(Sort.findDuplicateItem(s))
            }
        }

        return results;

    }

    fun parseByGroup(uri: URI): List<Char> {
        val inputStream: InputStream = File(uri).inputStream()
        val results: MutableList<Char> = mutableListOf()
        val sacks: MutableList<String> = mutableListOf()

        inputStream.bufferedReader().useLines { lines ->
            lines.forEach { s ->
                sacks.add(s)
                if (sacks.size == 3) {
                    results.add(Sort.findDuplicateItem(sacks))
                    sacks.clear()
                }
            }

        }

        return results;

    }

}