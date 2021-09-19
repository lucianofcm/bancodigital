package command

import dominio.Conta
import java.math.BigDecimal

class CreditoCommand @JvmOverloads constructor(
    private var conta: Conta,
    private var valor: BigDecimal
) {
    fun execute() = this.conta.credita(this.valor)
}