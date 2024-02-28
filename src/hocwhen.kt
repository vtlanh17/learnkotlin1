/* when( biểu thức expression){
        Giá trị 1 -> câu lệnh 1
        _______ 2 -> ________ 2
        _______ n -> -------- n
        else -> câu lệnh  }*/
fun main(args: Array<String>) {
    /*println("hay nhap thu nhap cua ban : ")
    var thunhap : Int?= readLine()?.toInt()
    if (thunhap!=null)
        if (thunhap>0) {
            when (thunhap) {
                in 1..3 -> println("qua thap")
                in 4..7 -> println("hoi thap")
                in 8..19 -> println("kha")
                in 20..50 -> println("cao")
                in 51..1000 -> println("rat cao")
                else -> println("qua giau")
            }
        } else println("do an bam")*/
    println("nhap so kiem tra :")
    var a:Int?= readLine()?.toInt()
    var check = when(a){
        in 0..100 ->false
        else -> true
    }
    println("so da kiem tra : "+a+ "\t "+ check )

}