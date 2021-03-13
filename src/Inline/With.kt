package Inline



/**
 * with函数使用
 * 适用场景：适用于调用同一个类的多个方法时，可以省去类名重复，直接调用类的方法即可
 */
fun main(args: Array<String>) {
    var user = User("测试", "男")
    user = with(user) {
        //打印信息
        println("name == $name ,sex == $sex")
        //赋值
        User("小明", "男")
    }

    println("姓名：${user.name},性别:${user.sex}")




    //
    var user1 = User("user1", "未知")
    val name = user1.name
    val sex1 = user1.sex
    println("name --> $name,sex --> $sex1 ")
    user1 = User("user11", "男")
    println("姓名：${user1.name},性别:${user1.sex}")
}