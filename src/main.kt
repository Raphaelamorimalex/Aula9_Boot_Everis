/*private fun fullNamestr(name: String, lastName: String):String{
    val fullname = "$name $lastName"
    return fullname
}*/

/*private fun fullNamestr(name : String, lastName: String):String{
    return "$name $lastName"
}*/
private fun fullNamestr(name: String, lastName: String) = "$name $lastName"

fun main(){
    val nome = "Raphael"
    val last = "Amorim"
    var completo: String
    completo = fullNamestr(nome,last)
    println("Bem Vindo $completo")
}