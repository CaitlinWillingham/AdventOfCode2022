import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SortTest {
    val testString: String = "vJrwpWtwJgWrhcsFMMfFFhFp"
    val testGroup: List<String> = listOf(
        "vJrwpWtwJgWrhcsFMMfFFhFp",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
        "PmmdzqPrVvPwwTWBwg"
    )

    @Test
    fun whichItemIsInBothReturned() {
        var result = Sort.findDuplicateItem(testString)
        assert(result.equals('p'))
    }

    @Test
    fun parsingMultipleItems() {
        val result: List<Char> = Parser.parse(Parser::class.java.getResource("Sample.txt").toURI())
        result.forEach { println(it) }

        assert(result.size > 0)
    }

    @Test
    fun whichItemInGroupIsReturned() {
        val result: Char = Sort.findDuplicateItem(testGroup)
        assert(result.equals('r'))

    }  @Test
    fun parsingMultipleSacks() {
        val result: List<Char> = Parser.parseByGroup(Parser::class.java.getResource("SampleGroups.txt").toURI())
        result.forEach { println(it) }

        assert(result.size > 0)
    }
}
