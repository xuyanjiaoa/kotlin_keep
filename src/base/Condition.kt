package base

/**
 * @author LRH
 * 条件表达式
 */
class Condition {
    /**
     * if  三元运算符
     */
    fun max(a: Int, b: Int): Int = if (a > b) a else b


    /**
     * when的使用
     */
    fun describe(obj: Any): String = when (obj) {
        is Int -> "obj is Int"
        is Float -> "obj is Float"
        is Long -> "obj is Long"
        is String -> "obj is String"
        else -> "obj unknown type"
    }
}

fun main() {
//    println("max is ------> ${max(10, 19)}")

    val conversion = Condition()
    while (true) {
        val input = readLine()
        if ("exit" == input) {
            println("程序退出！！！")
            break
        }
        val ret = input?.let { conversion.describe(it) }
        println(ret)
    }
}