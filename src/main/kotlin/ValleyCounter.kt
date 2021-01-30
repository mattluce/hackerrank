/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here

    var elevation = 0
    var numValleys = 0


    "s".toCharArray().filter { it == 'a' }

    path.toCharArray().forEach {
        val inValleyBeforeStep = elevation < 0
        when (it) {
            'D' -> elevation--
            'U' -> elevation++
        }
        val inValleyAfterStep = elevation < 0
        if (!inValleyBeforeStep && inValleyAfterStep) {
            numValleys++
        }

    }
    return numValleys
}

fun main(args: Array<String>) {

    val result = countingValleys(8, "UDDDUDUU")
    println(result)
}