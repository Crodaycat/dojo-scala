object ScalaChallengeOne {
    def main (args: Array[String]): Unit = {
        var numeros = List(4, 8, 15, 16, 23, 42)

        numeros = numeros.map { x => x*2 }
        var numeros1= numeros.duplicate

        println(numeros1)

        println(numeros)
    }
}