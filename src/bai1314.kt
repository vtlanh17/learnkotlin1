fun main(args: Array<String>) {
   /* for(i in 10..30 ){
        if (i%3==0)
            println(" $i la so chia het cho 3")
    }*/
    var tong=0
    var giaithua=1
    println("nhap so n ban muon tinh tong giai thua tu 1 den no : ")
    var n: Int?= readLine()?.toInt()
    if (n!=null&&n>=1){
        for (i in 1..n ){
            giaithua=giaithua*i
            tong=tong+giaithua
        }
        println(" tong cac giai thua la = $tong")
    }else(println("ban da nhap sai, vui long nhap lai"))


}