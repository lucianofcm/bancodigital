package command

import dominio.Conta
import dominio.Titular
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.math.BigDecimal

internal class CreditoCommandTest {
    lateinit var creditoCommand:CreditoCommand
    lateinit var conta:Conta

    @BeforeEach
    fun setUp() {
        var titular = Titular("Luciano", "77788486191")
        conta = Conta(1234, titular)

    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun execute() {
        creditoCommand = CreditoCommand(conta, BigDecimal(1000))
        creditoCommand.execute()
        assertEquals(BigDecimal(1000), conta.saldo)
    }
}