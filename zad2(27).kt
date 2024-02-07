import kotlin.math.*
fun main(){
    try {
        println("введите a")
        var a = readln()!!.toDouble()
        println("введите b")
        var b = readln()!!.toDouble()
        println("введите c")
        var c = readln()!!.toDouble()
        var res = false
        var res1 = false
        var res2 = false
        when{
            (a+b>c) -> res = true
            (a+c>b) -> res1 = true
            (b+c>a) -> res2 = true
            else -> res = false
        }
        if (res == true && res1 == true && res2 == true){
            println("такой треуголник со строронами можно нарисовать")
        }
        else println("такой треугоьник нельзя нарисовать")
    } catch (e:Exception){ println("неверный формат")}
}