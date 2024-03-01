fun main(args: Array<String>) {
    while (true)
    {println("nhap vao so nguyen n can kiem tra : ")
    var n:Int?= readLine()?.toInt()
    if (n!=null){
        var demUoc=0
        for (i in 1..n){
            if (n%i==0){
                demUoc++
            }
        }
        if (demUoc==2){
            println("day la so nguyen to ")
        }else(println("day khong phai la so nguyen to "))
    }
        println("ban co muon tiep tuc hoac bam Y de thoat :")
        var s:String?= readLine()
        if (s!=null)
            if (s=="y"||s=="Y"){
                println("cam on da su dung chuong trinh !")
                break}

    }

}