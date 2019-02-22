package w2.extensions

// Change the 'sum' function so that it was declared as an extension to List<Int>.

fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun main() {
    // without extension function
    val sum = sum(listOf(1, 2, 3))
    println(sum)

    // using our extension function
    val newSum = listOf(1,2,3).sumAsExt()
    println(newSum)

    // RESULT ARE THE SAME !!
}