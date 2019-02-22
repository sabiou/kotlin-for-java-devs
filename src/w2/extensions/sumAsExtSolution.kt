package w2.extensions

// solution
fun List<Int>.sumAsExt(): Int {
    var result = 0
    for (i in this) {
        result += i
    }

    return result
}