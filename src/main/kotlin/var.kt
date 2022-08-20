const val MAX = 100
fun main(args: Array<String>) {

    //变量的声明
    //声明可修改变量，使用var关键字
    //声明只读变量，使用val关键字
    //类型推断，对于已声明并赋值的变量，允许省略类型定义
    var strValue:String = "hello kotlin"
    println(strValue)
    var charValue:Char
    var intValue:Int
    var boolValue:Boolean
    var doubleValue:Double
    var listValue:List<String>
    var mapValue:Map<String,String>

    val str:String = "hello val"
    println(str)

    //只读变量并非绝对只读
    //编译时常量只能在函数之外定义，
    //因为编译时常量必须在编译时赋值，而函数都是在运行时才调用
    //函数内的变量也是在运行时赋值，编译时常量要在这些变量赋值前就已存在
    //const val MIN = 10 错误

    //查看kotlin的字节码  show kotlin bytecode

    //java有两种数据类型：引用类型（堆内存）和基本数据类型（栈内存）
    //kotlin只提供引用类型这一种数据类型，出于更高性能的需要，kotlin编译器会在java字节码中改用基本数据类型
}