import org.junit.jupiter.api.Test
import java.nio.file.Path.of
import kotlin.test.assertNotNull

class ParserTest {
    @Test
    fun sucessfullyParsesAFileWithASingleElf() {
        val filepath = Parser::class.java.getResource("SimpleSingleBaggageTest.txt");
        val baggages = Parser.parseFile(of(filepath.toURI()))

        assertNotNull(baggages);
        assert(1==baggages.size)
        assert(7 == baggages.first().sum())
    }
    @Test
    fun sucessfullyParsesAFileWithMultipleElves() {
        val filepath = Parser::class.java.getResource("SimpleMultiBaggage.txt");
        val baggages = Parser.parseFile(of(filepath.toURI()))

        assertNotNull(baggages);
        assert(2==baggages.size)
        assert(15 == baggages.first().sum())
    }
}