fun main(args: Array<String>) {
    var a:Float=0f
    var b:Float=0f
    println("nhap tong :")
    var s:Float?= readLine()?.toFloat()

    println("nhap hieu : ")
    var x:Float?= readLine()?.toFloat()

    if (x!=null&&s!=null){
        println("so lon la : "+((x+s)/2))
        println("so be la : "+((s-x)/2))
    }

}