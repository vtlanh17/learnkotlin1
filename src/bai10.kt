fun main(args: Array<String>) {
    println("Nha so tu nhien n : ")
    var tong=0
    var n:Int?= readLine()?.toInt()
    if (n!=null && n>0){
        var i=1
        while (i in 1..n){
            if (i%2!=0){
                if (i==3){
                    i+=1
                    continue
                }

                else {
                    println(i)
                    tong += i
                }
            }
            i+=1
   }
        println(" tong = $tong")
    }
}