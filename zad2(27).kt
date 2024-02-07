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
        if(a+b>c && a+c>b && b+c>a){
            res = true
        }
        if (res == true){
            println("такой треуголник со строронами можно нарисовать")
        }
        else println("такой треугоьник нельзя нарисовать")
    } catch (e:Exception){ println("неверный формат")}
}