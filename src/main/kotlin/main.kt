import dominio.Conta
import dominio.Titular
import java.math.BigDecimal

fun main() {
    testContaTitular()
}

fun testeFor() {
    for (i in 1..50) {
        println(i)
    }
}

fun testContaTitular() {
    var titular = Titular("Luciano","77788486191")
    var conta = Conta(1234, titular)
    conta.deposita(BigDecimal(10))
    conta.deposita(BigDecimal(5))
    conta.deposita(BigDecimal(-2))
    println(conta.saldo)
}