import java.lang.Exception

//对于null值问题，kotlin反其道而行之，除非另有规定，变量不可为null值
//这样一来，运行时崩溃从根源上得到解决
fun main() {
    var str: String? = "butterfly"
    str = ""
    //println(str?.capitalize())
    /*str = str?.let {
        //非空白的字符串
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "默认字符串"
        }
    }*/

    //str = null
    // println(str)

    //!!.又称感叹号操作符，当变量值为null时，会抛出KotlinNullPointerException
    //println(str!!.capitalize())

    if (str!=null){
        str = str.capitalize()
    }else{
        println("为null")
    }

    str = str?.capitalize()?.plus("is great")
    println(str)
    println(str?:"Jack")
    str = null
    str = str?.let { it.capitalize() } ?:"butterfly"
    println(str)



}