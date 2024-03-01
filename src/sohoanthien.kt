fun main(args: Array<String>) {
    var uoc =1
    var tong =0
    println("nhap vao so can kiem tra ")
    var n:Int?= readLine()?.toInt()
    if (n!=null){
       for (i in 1 until n){
            if (n%i==0){
                tong=tong+i
            }
        }
        if (tong==n){
            println("day la so hoan thien ")
        }else(println("day khong phai la so hoan thien "))
    }
}