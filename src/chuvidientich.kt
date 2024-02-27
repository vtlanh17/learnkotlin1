fun main(args: Array<String>) {
    var a:Double=0.0
    var b:Double=0.0
    println("chieu dai : ")
    var s:String? = readLine()
    if (s!=null){
         a=s.toDouble()}
    println("chieu rong : ")
    var x:String?= readLine()
    if (x!=null){
        b=x.toDouble()
    }
    if (a>=0&&b>=0){
        println("chu vi hinh chu nhat la : "+((a+b)*2))
        println("dien tich hinh chu nhat la : "+(a*b))
    }
}