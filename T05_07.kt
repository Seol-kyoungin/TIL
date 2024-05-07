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
