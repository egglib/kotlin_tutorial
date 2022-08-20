
fun main(args: Array<String>) {
    //变量的声明
    //声明可修改变量，使用var关键字
    //声明只读变量，使用val关键字
    //类型推断，对于已声明并赋值的变量，允许省略类型定义
    var strValue:String = "hello kotlin";
    println(strValue)
    var charValue:Char;
    var intValue:Int;
    var boolValue:Boolean;
    var doubleValue:Double;
    var listValue:List<String>;
    var mapValue:Map<String,String>;

    val str:String = "hello val";
    println(str)

    //只读变量并非绝对只读
    //编译时常量只能在函数之外定义

}