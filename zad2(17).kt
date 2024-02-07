import kotlin.math.*
fun main(){
    try {
        println("введите k")
        var k = readln()!!.toInt()
        println("введите l")
        var l = readln()!!.toInt()
        println("введите n")
        var n = readln()!!.toInt()
        println("введите m")
        var m = readln()!!.toInt()
        var res = false
        var res1 = false
        var res2 = false
        var l1 = l
        var n1 = n
        var m1 =m
        l1 = l%k
        n1 = n%k
        m1 = m%k
        if (l1 == 0 && n1 == 0 && m1 == 0){
            res = true
        }
        if(res == true){
            println("l = ${l/k}; n = ${n/k}; m = ${m/k}; является делителем всех чисел")
        }
        else println("не является делителем всех чисел")
    } catch (e:Exception){ println("неверный формат")}
}