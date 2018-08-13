fun main(args : Array<String>){
    val I = 10
    val F = 10.2F
    val D = 10.3
    val I_sum : Int = I + F.toInt() + D.toInt()
    val F_sum : Float = I.toFloat() + F + D.toFloat()
    val D_sum : Double = I.toDouble() + F.toDouble() + D
    println("I = "+I+", F = "+F+", D = "+ D)
    println("Sum to Int = "+I_sum)
    println("Sum to Float = "+F_sum)
    println("Sum to Double = "+D_sum)
}
