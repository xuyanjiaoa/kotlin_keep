package base

/**
 * 循环
 */
class Looper {
    /**
     * 遍历集合的两种方式
     */
    fun traversalList1() {
        val list = listOf("java","python","C","C++","Php")
        for (item in list) {
            println("$item")
        }
    }
    fun traversalList2() {
        val list = listOf("java","python","C","C++","Php")
        for (index in list.indices) {
            println("the $index item is ${list[index]}")
        }
    }

    /**
     * while 循环
     */
    fun whileLoop(list: List<String>) {
        var index = 0
        while (index < list.size) {
            println("the $index item is ${list[index++]}")
        }
    }

}

fun main() {

    val looper = Looper()

    //for循环的两种方式
//    looper.traversalList1()
//    looper.traversalList2()

    //while循环
    val list = listOf("java","python","C","C++","Php")
    looper.whileLoop(list)
}