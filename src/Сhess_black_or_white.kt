/*********************************************************************************************************************
                     This program shows the color of the chessboard at a certain coordinate.
 ********************************************************************************************************************/
fun main(args: Array<String>) {
    go()
}



//This function check if your input is correct, set x, output on display, asks if you want to repeat.
fun ChessBlackOrWhite(Symb: String, Number: Int) {
    var go = true
    var x = 0
    if (Number in 1..8) when (Symb) {
        "a", "A" -> {
            x = 1
        }
        "b", "B" -> {
            x = 2
        }
        "c", "C" -> {
            x = 3
        }
        "d", "D" -> {
            x = 4
        }
        "e", "E" -> {
            x = 5
        }
        "f", "F" -> {
            x = 6
        }
        "g", "G" -> {
            x = 7
        }
        "h", "H" -> {
            x = 8
        }
        else -> {
            println("Error.\n You entered wrong letter. \n Please repeat.")
            go = false
            repeat()
        }
    } else {
        println("Error.\n You entered wrong number. \n Please repeat.")
        go = false
        repeat()
    }
    if (go == true) {
        val y = Number

        /* Output */
        if (EvenOdd(x, y) == "even") {
            println("chess field on cordinate $Symb$y is BLACK")
            repeat()
        } else {
            println("chess field on cordinate $Symb$y is WHITE")
        repeat()
        }
    }
}
        /* This function of code asks if you want to repeat */
 fun repeat(){ println("Do you want to repeat Yes(Y/y), NO(N/n)")
    val Povtor: String? = readLine()
    if (Povtor == "Y" || Povtor == "y") {
        go()
    }
}

/* This function starts program  and asks for input. */
fun go() {
        println("Enter the letter.(A..H/a..h)")
        val Symb = readLine()!!.toString()
        println("Enter the number.(1..8)")
        val Number = readLine()!!.toInt()
        println(ChessBlackOrWhite(Symb, Number))
}

    /* This function сheck whether a number is even or odd using if...else expression. */
    fun EvenOdd(a: Int, b: Int): String {
        return if ((a + b) % 2 == 0) "even" else "odd"
    }
