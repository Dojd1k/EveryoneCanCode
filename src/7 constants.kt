fun main (args: Array<String>){
    //Utility
    val space_char = ' '
    val comma_char = ','

    //List of variables of string type
    val one ="Всего в это строчке "
    val two ="3"
    val three =" значения чисел ("
    val four ="6.69"
    val five ="45"
    val six ="1.7803E12"
    val seven ="), произведение которых равно: "

    //Calculation
    val res: Double = four.toDouble()*five.toDouble()*six.toDouble()

    //Output
    val Out: String = one+two+three+four+comma_char+space_char+five+comma_char+space_char+six+seven+res
    println(Out)
}