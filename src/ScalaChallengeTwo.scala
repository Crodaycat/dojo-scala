object ScalaChallengeTwo {
    def main (args: Array[String]): Unit = {
        println(factorial(0))
    }

    def factorial (n: Int): Int = {
        if (n == 0) {
            return 1
        } else {
            return (n * factorial(n-1))
        }
    }
}