//定义参数是函数的函数

fun main() {
    //函数的参数是另一个函数
    //    val getDiscountWords = { goodsName: String, hour: Int ->
    //        val curYear = 2027;
    //        "${curYear}年，双11${goodsName}促销倒计时：$hour 小时"
    //    }
    //    showOnBoard("卫生纸", getDiscountWords)

    //如果一个函数的lambda参数排在最后，或是唯一的参数，那么括住lambda值参的一对圆括号就可以省略
    showOnBoard("卫生纸") { goodsName: String, hour: Int ->
        val curYear = 2027;
        "${curYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
}


private fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}