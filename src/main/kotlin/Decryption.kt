import Decryption.decryptPassword

object Decryption {

    fun decryptPassword(s: String): String {

        val decrypted = MutableList<String?>(s.length) { _ -> null }

        val charArray = s.toCharArray()

        var numberIndex = 0
        charArray.withIndex().forEach {

            if (it.value.isDigit() && it.value.toString().toInt() == 0) {
                decrypted[it.index] = charArray[numberIndex].toString()
                numberIndex = numberIndex.inc()
            }
        }

        charArray.withIndex().forEach {
            if (it.value.toString() == "*") {
                //decrypted.append(charArray[it.index - 1]).append(charArray[it.index - 2])
            }
        }

        return decrypted.toString()
    }

}

fun main(args: Array<String>) {
    //val s = readLine()!!

    val result = decryptPassword("43Ah*ck0rr0nk")

    println(result)
}