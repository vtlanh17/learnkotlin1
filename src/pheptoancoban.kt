fun main(args: Array<String>) {
    var a=10//tự động nhận kiểu dữ liệu, khai báo tắt
    var b=3
    println(a::class.java.typeName)
    println(b::class.java.typeName)
    //phep cong plus
    println("c1 a+b="+(a+b))
    println("c2 a+b="+(a.plus(b)))
    //phep tru minus
    println("\n c1 a.b="+(a-b))
    println("c2 a.b="+(a.minus(b)))
    //phep nhan times
    println("\n c1 axb="+(a*b))
    println("c2 axb="+(a.times(b)))
    //phep chia div
    println("\n c1 a:b="+(a/b))
    println("c2 a:b="+(a.div(b)))
    var kq:Float =a.toFloat()/b
    println("\n a/b="+kq)
    //chia lay du rem
    println("\n c1 a%b="+(a%b))
    println("c2 a%b="+(a.rem(b)))
    //-tự động thêm dấu trừ vào giá trị biến
    var x:Float=9.2f
    var y=x.unaryMinus()
    println("x="+x)
    println("y="+y)
    //tự động thêm dấu cộng vào giá trị biến
    var z=y.unaryPlus()
    println("z="+y)

}