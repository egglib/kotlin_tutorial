//range表达式
//in a..b，in关键字用来检查某个值是否在指定范围之内
fun main() {
    var age = 3;
    if (age in 0..3) {
        print("婴幼儿")
    } else if (age in 3..12) {
        print("少儿")
    } else {
        print("未知")
    }

    if (age !in 1..3) {

    }
}