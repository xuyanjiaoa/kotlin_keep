package base


/**
 * 变长参数  关键字  vararg
 */
fun <T> asList(vararg tList: T): List<T> {
    val list = ArrayList<T>()
    for (t in tList)
        list.add(t)
    return list
}


fun main() {
    val a = arrayOf(1000, 2000, 4000)
    val list = asList(1, 2, 0, *a, 98, 100)
    println(list)
}