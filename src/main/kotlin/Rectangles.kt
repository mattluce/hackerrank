import Rectangles.nearlySimilarRectangles

object Rectangles {

    fun nearlySimilarRectangles(sides: Array<Array<Long>>): Long {


        val count = sides.map {
            it[0].toDouble().div(it[1].toDouble())
        }.groupBy { it }
            .values.fold(0) { acc, list -> acc + list.size - 1 }

        return count.toLong()
    }

}

fun main(args: Array<String>) {


    val sides: Array<Array<Long>> = arrayOf(
        arrayOf(4, 8),
        arrayOf(15, 30),
        arrayOf(25, 50),
        arrayOf(9, 3),
        arrayOf(12, 4),

        )

    val result = nearlySimilarRectangles(sides)

    println(result)
}