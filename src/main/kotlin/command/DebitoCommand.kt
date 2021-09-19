package command

import dominio.Conta
import java.math.BigDecimal

class DebitoCommand @JvmOverloads constructor(
    private var conta: Conta,
    private var valor: BigDecimal
) {
    fun execute() = this.conta.debita(this.valor)
}