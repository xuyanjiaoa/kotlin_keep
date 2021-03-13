package base

/**
 * @author LRH
 * 函数的定义与使用
 */
class Fun {
    /**
     * 普通函数
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 省略花括号
     */
    fun add1(a: Int, b: Int) = a + b

    /**
     * 不定长参数
     */
    fun add2(vararg args: Int): Int {
        var result: Int = 0
        for (i in args) {
            result += i
        }
        return result
    }

    /**
     * Lambda匿名函数
     */
    val addLambda: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }


}

fun main() {
    val fun0 = Fun()
    println("add------>${fun0.add(1, 2)}")
    println("add1----->${fun0.add1(1, 3)}")
    println("add2----->${fun0.add2(1, 2, 3, 4, 5)}")
    println("addLambda------->${fun0.addLambda(1, 23, 4)}")
}