
fun cong(a:Double,b:Double){
    println("$a + $b = "+(a+b))
}
fun tru(a:Double,b:Double){
    println("$a - $b = "+(a-b))
}
fun nhan(a:Double,b:Double){
    println("$a x $b = "+(a*b))
}
fun chia(a:Double,b:Double){
    println("$a : $b = "+(a/b))
}
fun main(args: Array<String>) {
    println("nhap a : ")
    var a:Double?= readLine()?.toDouble()
    println("nhap b : ")
    var b:Double?= readLine()?.toDouble()
    println("nhap phep tinh ban muon tinh : ")
    var pheptinh:String?= readLine()
    if (a!=null&&b!=null&&pheptinh!=null){
        if (pheptinh=="+"){
            cong(a,b)
        }else if (pheptinh=="-"){
            tru(a,b)
        } else if (pheptinh=="x"){
            nhan(a,b)
        }else if (pheptinh=="+"){
            chia(a,b)
        }else(println("nhap sai phep tinh roi"))
    }

}