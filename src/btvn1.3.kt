fun main(args: Array<String>) {
    while (true) {
        println("nhap so tu nhien de tinh tong tu 1 den no : ")
        var n: Int? = readLine()?.toInt()
        var tong =0
        if (n!=null){
            if (n>0){
                for (i in 1..n ){
                    tong=tong+i
                }
                println("tong cac so tu 1 den n la : $tong ")
                break
            }else {
                println("ban da nhap sai, neu muon nhap lai hay bam Y ")
                var s: String? = readLine()
                if (s!=null){
                    if (s=="y"||s=="Y"){
                        false
                    }else{
                        break
                    }
                }

            }

        }
    }
}