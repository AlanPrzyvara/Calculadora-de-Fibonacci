import java.math.BigInteger

fun fibonacci(n: Int): BigInteger {
    if (n <= 1) return BigInteger.valueOf(n.toLong())
    var a = BigInteger.ZERO
    var b = BigInteger.ONE
    var temp: BigInteger
    for (i in 2..n){
        temp = a + b
        a = b
        print("$b, ")
        b = temp
    }
    return b
}
fun main() {
    while (true) {
        print("Digite o número que deseja (ou 'sair' para encerrar): ")
        val input = readln()

        if (input.lowercase() == "sair") {
            println("Programa encerrado.")
            break
        }

        val n = input.toIntOrNull()
        if (n == null || n < 3) {
            println("Número informado não é válido! ou precisa ser maior que 3!")
            continue
        }

        println("Sequência de Fibonacci:")
        val finalNumber = fibonacci(n)
        println("O número final é $finalNumber\n")
    }
}