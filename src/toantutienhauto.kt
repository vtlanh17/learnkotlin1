fun main(args: Array<String>) {
    var x=9
    var y=10
    var z=17
    var t=29
    x++ // phương thức x.inc()
    println(x)
    y-- // phương thức y.dec()
    println(y)
    ++z
    println(z)
    /* a++, a-- là Postfix
       ++a, --a là Prefix
    Ưu tiên
       Step 1 Tính Prefix
       Step 2 Các phép toán còn lại
       Step 3 Gán giá trị cho biến ở bên trái dấu bằng
       Step 4 Tính Postfix       */
}