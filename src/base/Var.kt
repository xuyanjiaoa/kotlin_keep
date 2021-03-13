package base

/**
 * @author LRH
 * 介绍如何声明常量和变量
 *
 * 格式：var <变量名> : <变量类型> = <初始值>
 */
class Var {

    //变量
    private var vars: String = "变量"

    //常量(相当于Java final)
    private val constant = "常量"

    //可空变量
    private var variable: String? = null


    fun varTest() {
        //变量赋值
        vars = "赋值"
        variable = "给可控变量赋值"
    }
}