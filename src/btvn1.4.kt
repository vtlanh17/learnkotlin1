fun main(args: Array<String>) {
    while (true) {
        println("nhap so tu nhien de tinh giai thua : ")
        var n: Int? = readLine()?.toInt()
        var giaithua =1
        if (n!=null){
            if (n>0){
                for (i in 1..n ){
                    giaithua=giaithua*i
                }
                println(" $n ! = $giaithua ")
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