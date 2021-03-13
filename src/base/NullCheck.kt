package base

import java.lang.Exception


/**
 * @author LRH
 * 空指针检查
 */
class NullCheck {


    fun nullCheck() {
        try {
            //类型后面加?表示可为空
            var age: String? = "18"


            //字段后面加”？“不做处理返回 null
            val ages1 = age?.toInt()
            println("ages1-------> $ages1")

            //使用”?:“ 表示age为空返回-1
            val ages2 = age?.toInt() ?: -1
            println("ages2-------> $ages2")


            val ages3 = parseInt(age)
            println("ages3-------> $ages3")


            //字段后面加"!!"抛出空指针异常
            val ages = age!!.toInt()
            println("ages-------> $ages")

        } catch (e: Exception) {
            println("error ------> ${e.message}")
        }
    }

    //String? 传入参数可能为空
    //Int? 返回Int可能为null
    private fun parseInt(s: String?): Int? {
        //s为null时返回null
        return s?.toInt()
    }
}

fun main() {
    val nullCheck = NullCheck()
    nullCheck.nullCheck()
}