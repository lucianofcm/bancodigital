package repositorio

import dominio.Conta

interface ContaRepo {
    fun salvar(conta: Conta)
    fun recuperarConta(numeroConta: Int):Conta?
}