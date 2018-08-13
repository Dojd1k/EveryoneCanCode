fun main (args: Array<String>) {
    lol('g')
}

fun lol(ret : Char ) {
    if (ret == 'g'){
    val D: Double = 66.9075
    val R: Double = 0.0152
    val Perevod: Double
    println("Что желаете перевести ?")
    println(" Рубли(R) или Доллары(D)")
    val VALUTE: String? = readLine()
    if (VALUTE == "D" || VALUTE == "d") {
        println("Введите сумму ,которую желаете перевести. (в долларах)")
        val vvod: String? = readLine()
        Perevod = vvod!!.toDouble() * D
        println("Это " + Perevod + " РУБЛЕЙ")
    } else {
        if (VALUTE == "R" || VALUTE == "r") {
            println("Введите сумму ,которую желаете перевести. (в рублях)")
            val vod: String? = readLine()
            Perevod = vod!!.toDouble() * R
            println("Это " + Perevod + " ДОЛЛАРОВ")
        } else {
            println("Ошибка.Попробуйте ещё раз.")
        }
    }
            println("Повторить? ДА(Y/y) НЕТ(N/n)")
            val Povtor: String? = readLine()
            if (Povtor == "Y" || Povtor == "y") {
                lol('g')
            }
    } else {
        println("Приходите ещё. =)")
    }
}


