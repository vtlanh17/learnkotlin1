fun main(args: Array<String>) {
//    var i=0
//    while (i<=5) {
//        i++
//    }
//    println(" i= $i")
    var n=0
    while (n<1||n>99) {
        println("hay nhap so nguyen tu 1 den 99 : ")
        var s: Int? = readLine()?.toInt()
        if (s != null) {
            n=s
        }
    }
    println("ban nhap hop le, n = $n")
}