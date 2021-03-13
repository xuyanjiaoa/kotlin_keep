package base

/**
 * @author LRH
 * 类型转换
 */
class TypeConversion {
    companion object {


        fun getStrLength(obj: Any?): Int {
            //判断类型
            if (obj is String) {
                //自动转换成String类型
                return obj.length
            }
            return -1
        }
    }


}

fun main() {
    while (true) {
        val str = readLine()

        if ("exit" == str) {
            println("exit！！！！")
            break
        }

        val strLength = TypeConversion.getStrLength(str)
        println("str length -----> $strLength")
    }

}