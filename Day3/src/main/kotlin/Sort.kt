import java.util.SortedSet

object Sort {

    fun findDuplicateItem(sack: String): Char {
        val compartmentA: CharArray = sack.toCharArray(0, sack.length / 2);
        val compartmentB: CharArray = sack.toCharArray(sack.length / 2, sack.length)

        val sortedA: SortedSet<Char> = compartmentA.toSortedSet()
        val sortedB: SortedSet<Char> = compartmentB.toSortedSet()

        val duplicate: Char
        if (sortedA.size > sortedB.size)
            duplicate = findDuplicate(sortedA, sortedB).get(0)
        else
            duplicate = findDuplicate(sortedB, sortedA).get(0)
        return duplicate

    }


    fun findDuplicateItem(sacks: List<String>): Char {

        val sortedA: SortedSet<Char> = sacks.get(0).toCharArray().toSortedSet()
        val sortedB: SortedSet<Char> = sacks.get(1).toCharArray().toSortedSet()
        val sortedC: SortedSet<Char> = sacks.get(2).toCharArray().toSortedSet()

        var duplicate: List<Char>
        if (sortedA.size > sortedB.size)
            duplicate = findDuplicate(sortedA, sortedB)
        else
            duplicate = findDuplicate(sortedB, sortedA)

        return findDuplicate(sortedC, duplicate.toSortedSet()).get(0)


    }

    fun findDuplicate(setA: SortedSet<Char>, setB: SortedSet<Char>): List<Char> {
        val duplicate: MutableList<Char> = mutableListOf()
        setA.forEach() { if (setB.contains(it)) duplicate.add(it) }
        return duplicate;
    }

}