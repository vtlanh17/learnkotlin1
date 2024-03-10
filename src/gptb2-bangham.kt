import kotlin.math.sqrt

fun giaptb2(a : Double, b:Double, c:Double){
    if (a==0.0){
        if (b==0.0&&c==0.0){
            return println("phuong trinh vo so nghiem")
        }else if (b==0.0&&c!=0.0 ){
            return println("phuong trinh vo nghiem ")
        }else {
            return println("phuong trinh co 1 nghiem là x = " + (-b/(2*a)))
        }
    } else{
        var delta = b*b-4*a*c
        if (delta<0.0){
            return println("phuong trinh vo nghiem")
        }else if (delta==0.0){
            return println("phuong trinh co 1 nghiem duy nhat x = " +(-b/(2*a)))
        }else{
            return println("phuong trinh co 2 nghiem phan bier \n x1 = "+((-b- sqrt(delta))/(2*a)) + "\n x2 = "+((-b+ sqrt(delta))/(2*a)))
        }
    }
}
fun main(args: Array<String>) {
    println("nhap vao he so a : ")
    var x:Double?= readLine()?.toDouble()
    println("nhap vao he so b : ")
    var y:Double?= readLine()?.toDouble()
    println("nhap vao he so c : ")
    var z:Double?= readLine()?.toDouble()
    if (x!=null&&y!=null&&z!=null){
        giaptb2(x,y,z)
    }
}