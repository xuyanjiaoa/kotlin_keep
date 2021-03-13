package base

/**
 * 类
 */

//普通类
class Student(var name: String, var sex: String) {

}

//数据类
data class Data(var data: Any) {

    //自动生成getter setter方法
}

//抽象类
abstract class Person() {
    var name: String = ""
    var sex: String = ""


    abstract fun isMale(): Boolean
}


//接口
interface Imp {
    fun impFun(): Unit
}

class Rectangle {
    var height: Float = 0.0f
    var width: Float = 0.0f


    var isSquare: Boolean = false
        //自定义隔天函数
        get() {
            return width == height
        }
        //自定义set函数
        set(value) {
            field = value
        }

}


//实现接口
open class Test : Imp{
    override fun impFun() {
        println("调用了impFun接口！")
    }
}


//继承抽象类
class Teacher : Person() {
    override fun isMale(): Boolean {
        //实现抽象方法
        return "男" == sex
    }

}

fun main() {
    //实现接口测试
    val test = Test()
    test.impFun()


    //自定义setter getter测试
    val rectangle = Rectangle()
    rectangle?.apply {
        width = 10f
        height = 10f
    }
    //rectangle.isSquare 调用了isSquare的get()方法
    println("the rectangle is square ----> ${rectangle.isSquare}")


    //类继承测试
    val teacher = Teacher()
    teacher.name = "Tom"
    teacher.sex = "男"
    println("the teacher is male -----> ${teacher?.isMale()}")



}