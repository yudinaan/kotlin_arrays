fun main() {
    print("Введите количество строк: ")
    val n = input()
    print("Введите количество символов: ")
    val length = input()
    arraySort(n,length)
}

fun input() : Int{
    val n1 = readln()
    val n = n1.toInt()
    return n
}

fun getRandomString(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun getArrayOfRandomString(n: Int, length: Int): Array<String> {
    var array = Array<String>(n, {""})
    print("Сгенерированный массив строк: ")
    var i = 0
    while (i <= n-1){
        array[i] = getRandomString(length)
        print(array[i])
        print("\t")
        i++
    }
    println()

    return array
}

fun arraySort(n: Int, length: Int){
    val array = getArrayOfRandomString(n, length)
    val arraySort = array.sortedArray()
    print("Отсортированный массив строк: ")
    var i = 0
    while (i <= n-1){
        print(arraySort[i])
        print("\t")
        i++
    }
    println()
}


