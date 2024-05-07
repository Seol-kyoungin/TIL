//for
fun main() {
    var sum = 0
    for (i in 1..101) {
        if(i %2 == 0){
            sum += i
        }
    }
    println(sum)
}


//while
fun main() {
    var a = 1
    var sum = 0
    
    while (a <= 100) {
        if (a % 2 == 0) {
            sum += a
             
        }
       
       a++
    }
     println(sum)
}



//홀수의 *1-n까지 출력

fun main() {
    val n = 3 // n까지 출력

    for (a in 1..n) {
        if (a % 2 != 0) { // 홀수인 경우
            for (count in 1..a) {
                print("*")
            }
            println()
        }
    }
}
