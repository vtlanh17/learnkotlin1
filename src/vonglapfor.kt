fun main(args: Array<String>) {
    var tong:Int=0
    for (i in 1..10 step 1)// khoi tao bien 1 co gia trij tu 1 den 10, moi buoc nhay la 1 don vi
    { if (i==1)
        print("tong = $i"  )
        else print( " + $i")
       tong=tong+i
    }
     print(" = $tong" )
//khi không nhập step thì mặc định bước nhảy là 1
    //tinh giai thuwaf
    println("\n ban muon tinh giai thua : " )
    var j : Int?= readLine()?.toInt()
    var giathua:Int=1
    if (j !=null && j>=1 )
    for (i in 1..j  ){
        giathua=giathua*i
    }
    println("gia tri gia thua $j la : $giathua")
    // dang 3 : chạy từ soos đầu đến sác số cuối
    for (i in 1 until 9 ){
        println(i)
    }
    //dang 4 : chạy giậc lùi
    for (i in 9 downTo -1)
    {
        println(" dem lui $i")
    }
    // dang 5 :
    var dsTen = arrayOf("a","b","c","d","e")
    for (item in dsTen){
        println(item)
    }

}