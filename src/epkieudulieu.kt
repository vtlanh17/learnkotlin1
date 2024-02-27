fun main(args: Array<String>) {
//ép tường minh
    var soA:Int=15
    var soB:Long = soA.toLong()
    println(soA:: class.java.typeName)
    println(soB:: class.java.typeName)
    println(soA)
    println(soB)
//ép kieeur hẹp
   var x:Short = 367
   var y:Byte = x.toByte()
    println(x::class.java.typeName)
    println(y::class.java.typeName)
    println("y=$y")
    println(x)
    println(y)
    //ví dụ 2
    var a:Short =120
    var b:Byte = a.toByte()
    println(b)
    println("b= $b")
    //ví dụ 3
    var diemtoan : Float = 9.2f
    var diemvan : Int = diemtoan.toInt()
    println(diemtoan)
    println(diemvan)

}