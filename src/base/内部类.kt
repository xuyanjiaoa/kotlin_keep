package base

/**
 * 内部类示例
 */
class Outer{

    private val bar = "这是外部成员变量"

    inner class Inner{

        //可以访问外部成员变量
        fun bar() = bar

    }
}

fun main() {
    val bar = Outer().Inner().bar()
    println(bar)
}