fun main(args: Array<String>) {

    // ====================================================================================
    // Arithmetic operators
    // ====================================================================================

    val n1 = 10.2
    val n2 = 4.5

    val res1 = n1 + n2          // n1.plus(n2)
    println("Res 1 = $res1")

    val res2 = n1 - n2          // n1.minus(n2)
    println("Res 2 = $res2")

    val res3 = n1 * n2          // n1.times(n2)
    println("Res 3 = $res3")

    val res4 = n1 / n2          // n1.div(n2)
    println("Res 4 = $res4")

    val n3 = 12
    val n4 = 8

    var res5 = n3 / n4
    println("Res 5 = $res5")

    var res6 = n3 % n4          // n1.mod(n2)
    println("Res 6 = $res6")

    var res7 = n1 % n2
    println("Res 7 = $res7")

    // ====================================================================================
    // Assignment operators
    // ====================================================================================

    var n5 = 11

    n5 += 10        // n5.plusAssign(10)
    println(n5)

    n5 -= 10        // n5.minusAssign(10)
    println(n5)

    n5 *= 10        // n5.timesAssign(10)
    println(n5)

    n5 /= 10        // n5.divAssign(10)
    println(n5)

    n5 %= 10        // n5.modAssign(10)
    println(n5)

    // ====================================================================================
    // Unary prefix Operators
    // ====================================================================================

    var n6 = -10
    println(+n6)    // n6.unaryPlus()
    println(-n6)    // n6.unaryMinus()

    println(++n6)   // n6.inc()
    println(n6++)
    println(n6)

    println(--n6)   // n6.dec()
    println(n6--)
    println(n6)

}