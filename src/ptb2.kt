import kotlin.math.abs

fun main(args: Array<String>) {
    println("nhap so a = ")
    var a:Float?= readLine()?.toFloat()
    println("nhap so b = ")
    var b:Float?= readLine()?.toFloat()
    println("nhap so c = ")
    var c:Float?= readLine()?.toFloat()
    var delta :Float
    if (a!=null&&b!=null&&c!=null)
           if (a!=0.0f)
           { println(" Phuong trinh cua ban la :"+a+"x^2 + "+b+"x + "+c)
               delta= b*b - 4*a*c
               if (delta>0){
                   println("phuong trinh co 2 nghiem phan biet : ")
                   println("nghiem x1= "+((-b*2-delta)/(2*a))+"\n"+"nghiem x2= "+((-b*2+delta)/(2*a)))
               }else if (delta==0.0f){
                   println("phuong trinh co motj nghiem duy nhat \n  nghiem x= "+(-b/(2*a)))
               }else{
                   println("phuong trinh vo nghiem")
               }
           }else if (a==0.0f&&b!=0.0f){
               println(" Phuong trinh cua ban la :" + b+"x + "+c)
               println("nghiem cua phuon trinh la : " +(-c/b))
           }else if (a==0.0f&&b==0.0f){
               println(" Phuong trinh cua ban la :" + c)
               println("phuong trinh vo nghiem")
        }
}