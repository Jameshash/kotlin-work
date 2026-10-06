// Task 4.2: use of if and ranges

fun main() {
    println("Pizza menu")
    println("a.Margherita")
    println("b.Quattro Stagioni")
    println("c.Seafood")
    println("d.Hawaiian")
    println("choose a pizza")

    val choice = readln().lowercase()
    
    if (choice.length == 1 && choice[0] in 'a' .. 'd') {
        println("Order accepted")
    } else{
        println("Invalid chioice")
    }

}
