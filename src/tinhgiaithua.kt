fun main(args: Array<String>) {
    var n : Int
    var i =0
    println("nhap vao ban phim so tu nhien n : ")
    var s:String?= readLine()
    var tong=0
    var j=1
    var giaithua=1
    var k=0
    var tongle=0
    if (s!=null){
        n=s.toInt()
       /* if (n%2==0){
            while (i in 0..n ){
                tong = tong +i
                i=i+2
            }
            println(" tong cac so chan tu 0 den $n = $tong ")
        }else{

        println("khong tinh tong so le ")
        }*/
        while (j<=n ){
            giaithua=giaithua*j
            j++
        }
        println("$n ! = $giaithua ")
        while (k<=n){
            if (k%2!=0){
                if (k==3)
                    break
                tongle=tongle+k

            }
            k++

        }
        println("tong cac so le tu 0 den $n loai tru so 3  = $tongle")
        }
    }


