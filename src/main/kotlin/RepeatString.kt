import java.util.*

class RepeatString {

    fun repeatedString(s: String, n: Long): Long {


        //val repeated = s.

        return s.toCharArray().filter {it == 'a'}.size.toLong()

    }

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val s = scan.nextLine()

        val n = scan.nextLine().trim().toLong()

        val result = repeatedString(s, n)

        println(result)
    }

}