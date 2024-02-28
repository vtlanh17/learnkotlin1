fun main(args: Array<String>) {
    var nam:Int=0
    println("nhap nam : ")
    var s:Int?= readLine()?.toInt()
    if (s!=null)
        nam=s
    if ((nam%4==0&&nam%100!=0)||nam%400==0){
        println("day la nam nhuan")
    }else{
        println("day la nam khong nhuan")
    }

}