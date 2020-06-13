class Main {
    companion object : Callback {
        @JvmStatic
        fun main(args: Array<String>) {

            do {
                var menu = Menu()
                menu.menuGame()
                print("Play Again? Y/N")
                var continuePlay = readLine()!!.toUpperCase()
            } while (continuePlay == "Y")
        }

        override fun sendResults(hasil: String) {
            print(hasil)
        }
    }
}