package base


enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}




enum class ProtocolStatus() {
    WAITTING {
        override fun single(): ProtocolStatus = TALKING

    },

    TALKING {
        override fun single(): ProtocolStatus = WAITTING

    };


    abstract fun single(): ProtocolStatus;
}

fun main() {
    val waitting = ProtocolStatus.valueOf("WAITTING")
    println(waitting.name)
    println(waitting.ordinal)
    println(waitting)
}