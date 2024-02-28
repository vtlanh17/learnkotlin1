import kotlin.math.pow

fun main(args: Array<String>) {
    println("nhap chieu cao : ")
    var chieucao:Float?= readLine()?.toFloat()
    println("nhap can nang : ")
    var cannang :Float?= readLine()?.toFloat()
    var bmi :Float=0f
    if (chieucao!=null&&cannang!=null)
    { bmi=(cannang/chieucao.pow(2))
        println("chieu cao da nhap : " + chieucao)
    println("can nang da nhap : " + cannang)
        println("BMI la : " + bmi)
    }
    if (bmi>=15&&bmi<16){
        println("QUA GAY")
    }else if (bmi>=16&&bmi<18.5){
        println("HOI GAY")
    }else if (bmi>=18.5&&bmi<25){
        println("BINH THUONG")
    }else if (bmi>=25&&bmi<30){
        println("HOI BEO")
    }else if (bmi>=30&&bmi<35){
        println("BEO")
    }else if (bmi>=35){
        println("QUA BEO")
    }
}