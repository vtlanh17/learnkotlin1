fun main(args: Array<String>) {
    var n : Int
    var i =0
    println("nhap vao ban phim so tu nhien n : ")
    var s:String?= readLine()
    var tong=0
    var j=1
    var giaithua=1
    if (s!=null){
        n=s.toInt()
        /*if (n%2==0){
            while (i in 0..n ){
                tong = tong +i
                i+=2
            }
            println(" tong cac so chan tu 0 den $n = $tong ")
        }else{

        println("khong tinh tong so le ")
        }*/
        while (j<=n ){
            giaithua=giaithua*j
            j++
        }

        }
    }


