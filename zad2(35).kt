import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    try {
        var res1 = false
        var res2 = false
        println("введите k")
        var k = readln()!!.toDouble()
        println("введите a")
        var b = readln()!!.toDouble()
        println("введите b")
        var c = readln()!!.toDouble()
        var k1 = k * (-1)
        var b1 = b*(-1)
        var x1 = (b1 + sqrt( b.pow(2) - 4*1*c ))/(2*1)
        var x2 = (b1 - sqrt( b.pow(2) - 4*1*c ))/(2*1)
        println("x1 = ${x1}; x2 = ${x2}")
        when{
            (x1>k1 && x1<k) -> res1 = true
            (x2>k1 && x2<k) -> res2 = true
            else ->{
                res1 = false
                res2 = false
            }
        }
        if (res1 == true && res2 == true){
            println("a и b попадают в отрезок k")
        }
        else  println("a и b не попадают в отрезок k")
    }catch (e:Exception){ println("неверный формат")}
}