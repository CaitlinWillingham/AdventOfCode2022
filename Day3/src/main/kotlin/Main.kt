import java.util.stream.Collectors

fun main(args: Array<String>) {
    val duplicates: List<Char> = Parser.parseByGroup(Parser::class.java.getResource("input.txt").toURI())

    val sum = duplicates.stream().map { Priority.findPriority(it) }.collect(Collectors.toList()).sum()
    println(sum)
}