package Inline

/**
 * run函数的使用示例
 * 适用场景：适用于let,with函数任何场景。因为run函数是let,with两个函数结合体，
 *           准确来说它弥补了let函数在函数体内必须使用it参数替代对象，在run函
 *           数中可以像with函数一样可以省略，直接访问实例的公有属性和方法，另
 *           一方面它弥补了with函数传入对象判空问题，在run函数中可以像let函数
 *           一样做判空处理
 */
fun main() {
    val user = User("run", "未知")

    val ret = user?.run {
        println("fun name is $name,fun sex is $sex")
        -1
    }

    println("the run fun ret is $ret")
}