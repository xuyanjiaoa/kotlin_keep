package base

/**
 * 单例模式/静态 类似java 中的static
 */
object Instance {

    fun get(): Instance = this

}

interface IFactory<T> {
    fun create(): T
}


class Fellow {
    /**
     * 类似java中的静态成员（但不完全是）
     * 可以实现接口
     */
    companion object Factory : IFactory<Fellow> {
        override fun create(): Fellow {
            println("调用伴生对象的create函数！！！")
            return Fellow()
        }


        /**
         * 静态方法
         */
        @JvmStatic
        fun staticfun() = println("加上@JvmStatic注解后，为静态成员")

        /**
         * 静态成语变量
         */
        @JvmStatic
        var staticVar = 0
    }
}

fun main() {
    /**
     * 使用类名调用，实际上是单例模式
     */
    val instance = Instance.get()
    println(instance)

    /**
     * 伴生对象
     */
    val create = Fellow.Factory.create()
    //静态函数、变量
    Fellow.staticfun()
    Fellow.staticVar = 100
    println(Fellow.staticVar)

}

