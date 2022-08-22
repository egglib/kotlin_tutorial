//定义时不取名字的函数，称之为匿名函数，匿名函数通常整体传递给其他函数或者从其他函数返回

//匿名函数对kotlin来说很重要，有了它，就能够根据需要制定特殊规则，轻松制定标准库里的内置函数
fun main() {

    val total = "mississippi".count()
    println(total)

    val totals = "mississippi".count { letter ->
        letter == 'i'
    }

    println(totals)

    //和具名函数不一样，除了极少数情况外，匿名函数不需要return关键字来返回数据
    //匿名函数会隐式或自动返回函数体最后一行语句的结果
    //变量的类型是一个匿名函数
    val blessingFunc: () -> String = {
        "happy new year"
    }
    //    blessingFunc = {
    //      "happy new year"
    //    }
    println(blessingFunc())
    //和具名函数一样，匿名函数可以不带参数，也可以带一个或多个任何类型的参数
    //需要带参数时，参数的类型放在匿名函数的类型定义中，参数名则放在函数定义中
    val blessingFunc1: (String) -> String = { name ->
        "$name,happy new year"
    }
    println(blessingFunc1("jack"))

    //定义只有一个参数的匿名函数时，可以使用it关键字来表示参数名，当你需要传入两个值参，it关键字就不能用了
    val blessingFunc2: (String) -> String = {
        "$it,happy new year"
    }
    println(blessingFunc2("jack"))

    //定义一个变量时，如果已把匿名函数作为变量赋值给他，就不需要显示指明变量类型
    val blessingFunc3 = {
        "happy new year"
    }
    println(blessingFunc3())

    //类型推断也支持带参数的匿名函数，但为了帮助编译器更准确地推断变量类型，
    //匿名函数的参数名和参数类型必须有
    val blessingFunc4:(String,Int)->String = {name,year->
        "$name,happy new year $year"
    }
    println(blessingFunc4("jack",2000))

    //将匿名函数称为lambda，将它的定义称为lambda表达式，它返回的数据称为lambda结果
    //为什么叫lambda？lambda可以使用希腊字符λ表示，是lambda演算的简称，lambda演算
    //是一套数理演算逻辑，由数学家Alonzo Church（阿隆佐.丘齐），于20世纪30年代发明，
    //在定义匿名函数时，使用了lambda演算记法

}

//匿名函数也有类型，匿名函数可以当作变量赋值给函数类型变量，就像其他变量一样
//匿名函数就可以在代码里传递了，变量有类型，变量可以等于函数，函数也会有类型
//函数的类型，由传入的参数和返回类型决定


