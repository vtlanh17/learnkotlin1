fun main(args: Array<String>) {
    //break
    var n=0
    var tong=0
    while (n<100){
        n++
        if (n==10)
            continue
        println("n trong vong lap = $n ")
        tong=tong+n
    }
    println(tong)
}