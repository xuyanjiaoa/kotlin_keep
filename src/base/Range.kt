package base


/**
 * 区间
 */
class Range {


    /**
     * 遍历  闭区间
     */
    fun traverse(start: Int, end: Int) {
        for (i in start..end) {
            println("----> $i")
        }
    }

    /**
     * 遍历 左闭右开区间
     */
    fun traverse2(start: Int, end: Int) {
        for (i in start until end) {
            println("======> $i")
        }
    }

    /**
     * 数列迭代
     */
    fun sequenceIteration(start: Int, end: Int) {
        for (i in start..end step 5) {
            println("数列遍历 ----> $i")
        }
    }

    fun sequenceIterationDown(start: Int, end: Int) {
        for (i in end downTo start step 5) {
            println("数列向下遍历 -----> $i")
        }
    }


    /**
     * 集合遍历
     */
    fun collectionTraversal() {
        val list = listOf("java", "kotlin", "C++", "php", "C")
        for (item in list) {
            println(item)
        }
    }


    /**
     * 集合+when使用
     */
    fun listWhen() {
        val list = listOf("java", "kotlin", "C++", "php", "C")

        when {
            "java" in list -> println("${list[0]} is the best lang!")
            "kotlin" in list -> println("${list[1]} is the best lang!")
            "C++" in list -> println("${list[2]}++ is the best lang!")
            "php" in list -> println("${list[3]} is the best lang!")
            "C" in list -> println("${list[4]} is the best lang!")
            else -> println("python is the best lang!")
        }
    }

    /**
     * 集合+lambda
     */
    fun listLambda() {
        val list = listOf("java", "kotlin", "C++", "php", "C", "javac", "javaT")
        list?.filter { it.startsWith("j") }
            //排序
            .sortedBy { it }
            //
            .map { it.toUpperCase() }
            //
            .forEach { println(it) }
    }


    /**
     * 测试
     */
    fun inputTest() {
        while (true) {
            print("输入数字：")
            val inputStr = readLine()
            if ("exit" == inputStr) {
                println("exit!!!")
                break
            }
            val num = inputStr?.toInt()

            print("输入起始区间：")
            val rangeStart = readLine()
            val rangeStartInt = rangeStart?.toInt()

            print("输入结束区间：")
            val rangeEnd = readLine()
            val rangeEndInt = rangeEnd?.toInt()

            if (num in rangeStartInt!!..rangeEndInt!!) {
                println("num is in range")
            } else {
                println("num is out of range")
            }
        }
    }
}

fun main() {
    val range = Range()

    //区间遍历
//    range.traverse2(0, 100)

    //数列遍历
//    range.sequenceIteration(0, 100)
//    range.sequenceIterationDown(0, 100)

    //集合遍历
//    range.collectionTraversal()

    //when
//    range.listWhen()

    //lambda
    range.listLambda()

}