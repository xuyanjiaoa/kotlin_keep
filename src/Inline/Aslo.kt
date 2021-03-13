package Inline

/**
 * also函数使用
 * 使用场景：适用于let函数的任何场景，also函数和let很像，只是唯一的不同点就是let函数最后的返回值是最后一行的返回值而also函数的返回值是返回当前的这个对象。一般可用于多个扩展函数链式调用
 */
fun main() {
    var user:User? = User("also", "未知")

//    user = null

    //跟let函数类似，但是返回值为对象本身，即user
    val ret = user?.also {
        //访问对象属性需要it
        println("fun name is ${it.name},fun sex is ${it.sex}")
        //打印信息：fun name is also,fun sex is 未知
        -1
    }

    println("fun also ret is $ret")
    //打印信息：fun also ret is User(name=also, sex=未知)
}