import java.util.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

    val groupBy: Map<Int, List<Int>> = ar.groupBy { it }
    return groupBy.values.fold(0) {  sum, element -> sum + element.size.div(2) }



}

fun main(args: Array<String>) {

    val result = sockMerchant(9, arrayOf(10,20,20,10,10,30,50,10,20))
    println(result)
}