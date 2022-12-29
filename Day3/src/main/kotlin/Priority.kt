object Priority {
    val lowercaseStart = 1
    val uppercaseStart = 27

    fun findPriority(value: Char) :Int {
        if (value.isLowerCase())
            return lowercaseStart+ (value.code-'a'.code)
        else
            return uppercaseStart+(value.code-'A'.code)
    }
}
