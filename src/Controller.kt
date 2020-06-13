class Controller {

    val pilihan = mutableListOf<String>("BATU", "GUNTING", "KERTAS")
    var hasil = String()


    fun lawanPlayer(listener: Callback) {
        println("Player 1 Choice : ")
        var playerSatu = readLine()!!.toLowerCase()
        println("Player 2 Choice : ")
        var playerDua = readLine()!!.toLowerCase()
        println("Result : ")


        if (playerSatu.equals(playerDua)) {
            hasil = "Draw"
        } else if (playerSatu == "batu" && playerDua == "gunting" || playerSatu == "gunting" && playerDua == "kertas" ||
            playerSatu == "kertas" && playerDua == "batu"
        ) {
            hasil = "Player Satu Win! "
        } else if (playerDua == "batu" && playerSatu == "gunting" || playerDua == "gunting" && playerSatu == "kertas" ||
            playerDua == "kertas" && playerSatu == "batu"
        ) {
            hasil = "Player Dua Win!"
        } else {
            hasil = "Wrong Input! Try Again "
        }
        listener.sendResults(hasil)
    }

    fun lawanKomputer(listener: Callback) {
        var komputer = pilihan.random().toLowerCase()
        println("Enter Player Choice  : ")
        var player = readLine()!!.toString().toLowerCase()
        println("$komputer && $player")
        if (player.equals(komputer)) {
            hasil = "Draw $player dengan $komputer"
        } else if (player.equals("batu") && komputer.equals("gunting") || player.equals("gunting") && komputer.equals("kertas") ||
            player.equals("kertas") && komputer.equals("batu")
        ) {
            hasil = "Player Win! $player mengalahkan $komputer"
        } else if (player.equals("batu") && komputer.equals("gunting") || player.equals("gunting") && komputer.equals("kertas") ||
            player.equals("kertas") && komputer.equals("batu")
        ) {
            hasil = "Komputer Win! $komputer mengalahkan $player"
        }
        listener.sendResults(hasil)
    }

    fun cetakHasil(listener: Callback){
    }


}
