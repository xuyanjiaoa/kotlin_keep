package Inline

//class Let {
//    companion object{
//
//    }
/**
 * let函数使用
 */
fun main(args: Array<String>) {
    val str = "str"
    var str01 = "str01"
    //非空判断
    str01 = str?.let {
        //打印str字符串长度 it == str
        println(it.length)

        //为str01赋值
        it.substring(0, it.length - 2)
    }
    println(str01)
}
//}