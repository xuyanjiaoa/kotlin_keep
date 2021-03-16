package base

class Outer1{

    //嵌套类Nested成员不能访问
    private val foo = "这是外部类的成员变量"


    //相当于java中的 static class Nested{}
    class Nested{
        fun foo() = "这是嵌套类的成员"
    }

}

fun main() {
    val foo = Outer1.Nested().foo()
    println(foo)
}