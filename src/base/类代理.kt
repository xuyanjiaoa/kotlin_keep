package base

interface IProxy {
    fun print()
}

class ProxyImpl(val x: Int) : IProxy {
    override fun print() {
        println("x = $x")
    }
}

class Derived(b: IProxy) : IProxy by b


fun main() {
    val b = ProxyImpl(100)
    Derived(b).print()
}