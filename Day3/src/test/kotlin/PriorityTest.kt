import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PriorityTest {

    @Test
    fun priorityIsLowercaseTest() {
        var result = Priority.findPriority('a')
        println(result)
        assert(result==1)
    }
    @Test
    fun priorityIsUppercaseTest() {
        var result = Priority.findPriority('A')
        println(result)
        assert(result==27)
    }

    @Test
    fun priorityIsLowercaseZTest() {
        var result = Priority.findPriority('z')
        println(result)
        assert(result==26)
    }
    @Test
    fun priorityIsUppercaseZTest() {
        var result = Priority.findPriority('Z')
        println(result)
        assert(result==52)
    }
}
