package Inline


/**
 * apply函数使用示例
 * 使用范围：整体作用功能和run函数很像，唯一不同点就是它返回的值是对象本身，而run函数是一个闭包形式返回，返回的是最后一行的值。正是基于这一点差异它的适用场景稍微与run函数有点不一样。apply一般用于一个对象实例初始化的时候，需要对对象中的属性进行赋值。
 */
fun main() {
    val user = User("apply", "未知")

    //apply函数的返回值为对象自身，即user
    val ret = user?.apply {
        println("fun name is $name,fun sex is $sex")
        //打印信息：fun name is apply,fun sex is 未知
        -1
    }
    println("fun apply ret is $ret")
    //打印信息：fun apply ret is User(name=apply, sex=未知)
}