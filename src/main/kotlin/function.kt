fun main() {
    println(test("哈哈",18))
    test1("哈哈")
    //如果使用命名值参，就可以不用管值参的顺序
    test1(age=10, name = "嘿嘿")
    println(test1(age=20, name = "嘿嘿"))

    //TODO函数的任务就是抛出异常，就是永远别指望它运行成功，返回noting类型
    TODO("noting")
    println("after noting")

    //为了支持kotlin和java互相操作，而kotlin和java各自却有着不同的保留关键字，不能作为函数名，
    //使用反引号括住函数名就能避免任何冲突
    MyJava.`is`()
}

private fun test(name:String,age:Int) :String{
 return "姓名：$name 年龄：$age"
}


//如果不打算传入参数，可以预先给参数指定默认值
fun test1(name:String,age:Int = 2){
    println("$name $age")
}


//不是所有的函数都有返回值，kotlin中没有返回值的函数叫做Unit函数，
//也就是说他们的返回类型是Unit，在kotlin之前，函数不返回任何东西用void描述
//意思是"没有返回类型，不会带来什么，忽略它"，也就是说如果函数不返回任何东西，
//就忽略类型，但是void这种解决方案无法解释现代语言的一个重要特征，泛型

//反引号中的函数名
//kotlin可以使用空格和特殊字符对函数命名，不过函数名要用一对反引号括起来
fun `**~ special function with weird name ~**`(){

}