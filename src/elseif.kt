import com.sun.source.tree.IfTree

fun main(args: Array<String>) {
    var dtb:Float
    println("nhap vao diem trung binh : ")
    var s:String?= readLine()
    if (s!=null){
        dtb=s.toFloat()
        if (dtb>=8.5){
            println("A")
        }else if (dtb>=6.5&&dtb<8.5){
            println("B")
        }else if (dtb>=5&&dtb<6.5){
            println("C")
        }else if (dtb>=4&&dtb<5){
            println("D")
        }else if (dtb>=0&&dtb<5){
            println("F")
        }else{
            println("ban da nhap sai, hay nhap lai")
        }
    }
}