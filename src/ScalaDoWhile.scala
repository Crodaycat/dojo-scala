object ScalaDoWhile {
    def main(args: Array[String]): Unit = {
        var k = 0

        do {
            println(s"K vale $k")
            k = k + 1
        } while (k < 5)
    }
}