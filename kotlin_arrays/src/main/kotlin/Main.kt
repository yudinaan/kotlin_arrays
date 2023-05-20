fun main(args: Array<String>) {
    print("Введите количество символов: ")
    val length1 = readln()
    val length = length1.toInt()

    val string: String = getRandomString(length)

    val array = string.toCharArray()
    print("Сгерерированная строка: ")
    println(array)

    val arraySort = array.sorted()
    println("Отсортированная строка: $arraySort")
}

fun getRandomString(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

