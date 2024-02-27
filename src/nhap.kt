fun main(args: Array<String>) {
    // nhap chuoi tu ban phim
    println("nhap ten:")
    var ten:String? = readLine()
    println("ten vua nhap laf: "+ten)
    //nhap so tu ban phim
    println("nhap tuoi : ")
    var s:String?= readLine()
    if (s!=null){
        var tuoi=s.toShort()
        println("tuoi vua nhap : "+tuoi)
    }
}