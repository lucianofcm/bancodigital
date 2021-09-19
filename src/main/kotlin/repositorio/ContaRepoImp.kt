package repositorio

import dominio.Conta
import java.util.*

class ContaRepoImp(var contas: MutableList<Conta>) : ContaRepo {
    override fun salvar(conta: Conta) {
        this.contas.add(conta)
    }

    override fun recuperarConta(numeroConta: Int): Conta? {
        return contas.find { conta -> conta.numeroConta.equals(numeroConta) }
    }

}