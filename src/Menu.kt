import kotlin.system.exitProcess

class Menu : Callback {
    var inputMenu = 0

    fun menuGame() {
        println("*********************************************")
        println(" Selamat Bermain Di Game Suit")
        println("*********************************************")
        println("  PILIH PILIHAN ANDA: ")
        println("*********************************************")
        println("   1. Pemain lawan Player")
        println("   2. Pemain lawan Komputer")
        println("   3. Exit")
        print("Enter your choice :) : ")
        inputMenu = readLine()!!.toInt()

        when (inputMenu) {
            1 -> {
                var controller = Controller()
                controller.lawanPlayer(this)
            }
            2 -> {
                var controller = Controller()
                controller.lawanKomputer(this)
            }
            3 -> {
                println("Exit game")
                exitProcess(0)
            }
        }
    }

    override fun sendResults(hasil: String) {
        print(hasil)
    }
}