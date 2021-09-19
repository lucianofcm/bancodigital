package command

import dominio.Conta
import dominio.Titular
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class DebitoCommandTest {

    lateinit var debitoCommand: DebitoCommand
    lateinit var conta: Conta

    @BeforeEach
    fun setUp() {
        var titular = Titular("Luciano", "77788486191")
        conta = Conta(1234, titular, BigDecimal(300))
    }

    @Test
    fun execute() {
        debitoCommand = DebitoCommand(conta, BigDecimal(150))
        debitoCommand.execute()
        assertEquals(BigDecimal(150), conta.saldo)
    }

}