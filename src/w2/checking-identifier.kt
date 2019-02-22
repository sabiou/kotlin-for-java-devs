package w2

// Implement a function that checks whether a string is a valid identifier.
// A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
// digits and underscores.

fun isValidIdentifier(string: String): Boolean {
    fun isValidCharacter(char: Char) = char == '_' || char.isLetterOrDigit()

    for (char in string) {
        if (!isValidCharacter(char)) return false
        if (string.isEmpty() || string[0].isDigit()) return false
    }
    return true
}

fun main() {
    println(isValidIdentifier("farouk"))
    println(isValidIdentifier("_hello"))
    println(isValidIdentifier("9dq"))
    println(isValidIdentifier("-check"))
}