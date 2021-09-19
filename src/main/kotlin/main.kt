import command.CreditoCommand
import dominio.Conta
import dominio.Titular
import servicos.TransfereServico
import java.math.BigDecimal
import java.util.*

fun main() {
    testContaTitular()
}

fun testeFor() {
    for (i in 1..50) {
        println(i)
    }
}

fun testContaTitular() {
    var titular = Titular("Luciano", "77788486191")
    var conta = Conta(1234, titular)
    var creditoCommand = CreditoCommand(conta, BigDecimal(5000))
    creditoCommand.execute()
    println(conta.saldo)
}

fun transfere() {
    var tranfereDe = Titular("Luciano", "77788486191")
    var contaDe = Conta(1234, tranfereDe)
    var tranferePara = Titular("Adriana", "88877788811")
    var contaPara = Conta(1111, tranferePara)
    var transfere = TransfereServico()
    transfere.transfere(contaDe, contaPara, BigDecimal(1000))
    println(contaDe.saldo)
    println(contaPara.saldo)
}