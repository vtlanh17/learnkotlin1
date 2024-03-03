fun main(args: Array<String>) {
    while (true){
    println("nhap thang ban muon kiem tra quy : ")
    var thang:Int?= readLine()?.toInt()
    if (thang!=null){
        when (thang){
            in 1..3 -> println(" day la quy 1 ")
            in 4..6 -> println(" day la quy 2 ")
            in 7..9 -> println(" day la quy 3 ")
            in 10..12 -> println(" day la quy 4 ")
            else -> {
                println("ban da nhap sai thang, ban muon nhap lai khong : \n 1. co     2. khong ")
                var s:String?= readLine()
                if (s!=null){
                    if (s=="1"||s=="co"){
                        false
                    } else {
                        break
                    }
                }
            }
        }
        break
    } else{
        println("ban da nhap sai thang, ban muon nhap lai khong : \n 1. co     2. khong ")
        var s:String?= readLine()
        if (s!=null) {
            if (s == "1" || s == "co") {
                false
            } else {
                break
            }
        }}}
}