import java.nio.file.Path

fun main(args: Array<String>) {
    val scores: List<Int> = Parser.parse(Parser::class.java.getResource("input.txt").toURI())
    println( "Total Scores: ${scores.sum()}")
}