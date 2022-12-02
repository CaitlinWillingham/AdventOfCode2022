import model.ElfBaggage
import java.nio.file.Path
import java.util.*
import kotlin.Comparator

fun main(args: Array<String>) {

    var elfBaggages: List<ElfBaggage> = Parser.parseFile(Path.of(Parser::class.java.getResource("input.txt").toURI()))
    val top3:List<ElfBaggage> = elfBaggages.sortedByDescending { elfBaggage -> elfBaggage.sum() }.subList(0,3)
    println("Sum of top 3 is ${top3.sumOf { elfbaggage -> elfbaggage.sum() }}");
    println("Summary of top 3 is \n ${top3.get(0)}\n ${top3.get(1)}\n ${top3.get(2)}")



}



