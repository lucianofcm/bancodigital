package repositorio

import dominio.Conta
import dominio.Titular
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ContaImpTest {
    private lateinit var conta: Conta
    private lateinit var contaImp: ContaRepoImp
    private lateinit var contas: MutableList<Conta>

    @BeforeEach
    fun setUp() {
        var titular = Titular("Luciano", "77788486191")
        conta = Conta(1234, titular)
        contas = mutableListOf()
        contaImp = ContaRepoImp(contas)
        contaImp.salvar(conta)
    }

    @Test
    fun salvar() {
        contaImp.salvar(conta)
        assertEquals(2, contas.size)
    }

    @Test
    fun recuperarConta() {
        assertEquals("77788486191", contaImp.recuperarConta(1234)?.titular?.cpf ?: "" )
    }
}