fun main() {
    val getDiscountWords = configDiscountWords()
    println(getDiscountWords("沐浴露"))

    //能接收函数或者返回函数的函数又叫做高级函数，高级函数广泛应用于函数式编程
}

private fun configDiscountWords(): (String) -> String {
    return { goodsName: String ->
        val curYear = 2027;
        val hour = (1..24).shuffled().last()
        "${curYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
}