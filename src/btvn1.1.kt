
import kotlin.math.sqrt
fun main(args: Array<String>) {
    //tinh phuong trinh bac 1 &2
    while (true){
    println("ban muon giai phuong trinh bac 1 hay 2 :")
    var s:Int?= readLine()?.toInt()
    if (s!=null) {
        if (s==2){

        println(" nhap vao he so a : ")
        var a: Float? = readLine()?.toFloat()
        println(" nhap vao he so b : ")
        var b: Float? = readLine()?.toFloat()
        println(" nhap vao he so c : ")
        var c: Float? = readLine()?.toFloat()
        if (a != null && b != null && c != null) {
            if (a == 0f && b != 0f) {
                println("day la phuong trinh bac 1, khong phai bac 2")
                false
            }
            else if (a!=0f){
                println("phuong trinh co dang $a x^2 + $b x + c =0")
                var d = b*b-4*a*c
                if (d>0){
                    print("phuong trinh co 2 nghiem : \n x1 = "+ ((-b + sqrt(d))/(2*a))+"\n x2 = " +((-b + sqrt(d))/(2*a)) )
                }else if (d==0f){
                    print("\n phuong trinh co 1 nghiem duy nhat x = " + (-b/(2*a)))
                }else(
                    println("phuong trinh vo nghiem")
                )
                    break
            }
            else if (a==0f && b==0f ){
                println("phuong trinh khong co an, phuong trinh vo li ")
                false
            }
        }} else if (s==1){
            println(" nhap vao he so a : ")
            var a: Float? = readLine()?.toFloat()
            println(" nhap vao he so b : ")
            var b: Float? = readLine()?.toFloat()
            if (a!=null&&b!=null){
                if (a!=0f){
                    println("nghiem cua phuong trinh la x = "+(-b/(2*a)))
                    break
                }else if (a==0f && b!=0f){
                    println("phuong trinh khong co an , phuong trinh vo li")
                    false
                }
            }
        }


        }
    }
}