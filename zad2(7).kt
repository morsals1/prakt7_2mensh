import kotlin.math.*
fun main(){
    try {
        println("введите a")
        var a = readln()!!.toInt()
        println("введите b")
        var b = readln()!!.toInt()
        println("введите c")
        var c = readln()!!.toInt()
        when{
            (a>=b) -> if (b>=c) println("a = ${a*2}; b = ${b*2}; c = ${c*2}")
            else println("a = ${abs(a)}; b = ${abs(b)}; c = ${abs(c)}")
        }
    } catch (e:Exception){ println("неверный формат")}
}