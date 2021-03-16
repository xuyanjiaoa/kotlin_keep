package base

/**
 * 数据类讲解
 *
 *
 *1、主构造函数应该至少有一个参数；
 *2、主构造函数的所有参数必须标注为val或者var；
 *3、数据类不能是abstract，open，sealed，或者inner	；
 *4、数据类不能继承其它的类（但可以实现接口）；
 *5、在JVM中如果构造函数是无参的，则所有的属性必须有默认的值 data	class	User(val	name:	String	=	"",	val	age:	Int	=	0)
 */
data class User(val name: String, val age: Int)


fun main() {
    //copy函数的使用
    val user = User(name = "张三", age = 14)
    val copyUser = user.copy(name = "李四")
    //toString格式是"User(name=john,	age=42)"
    println(copyUser.toString())

    //多重说明
    val jane = User("jane", 20)
    val (name, age) = jane
    println("jane`s name is $name age is $age")


    //输出结果
//    User(name=李四, age=14)
//    jane`s name is jane age is 20
}



