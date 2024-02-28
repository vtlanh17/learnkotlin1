fun main(args: Array<String>) {
    var nam:Int=0
    var nhuan:Boolean=false
    println("nhap nam : ")
    var s:Int?= readLine()?.toInt()
    if (s!=null)
        nam=s
    if ((nam%4==0&&nam%100!=0)||nam%400==0){
        nhuan==true
        println("day la nam nhuan")
    }else{
        println("day la nam khong nhuan")
    }
    var thang:Int=0
    println("thang can xem ngay : ")
    var x:Int?= readLine()?.toInt()
    if (x!=null)
        thang=x
    if (thang==4||thang==6||thang==9||thang==11)
        println("thang "+thang+"/" +nam+" co 30 ngay")
    else if (thang==2)
        if (nhuan==true)
            println("thang "+thang+"/" +nam+" co 29 ngay" )
        else
            println("thang "+thang+"/" +nam+" co 28 ngay")
    else if (thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12)
        println("thang "+thang+"/" +nam+" co 31 ngay")
    else
        println("ban da nhap sai thang, can nhap lai")





}