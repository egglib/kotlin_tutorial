//when表达式
//允许你编写条件式，在某个条件满足时，执行对应的代码
//只要代码包含else if分支，都建议改用when表达式

fun main() {
    val school = "小学"
    val level = when (school) {
        "学前班" -> "幼儿"
        "小学" -> "少儿"
        "中学" -> "青少年"
        else -> {
            print("未知")
        }
    }
    print(level)
}