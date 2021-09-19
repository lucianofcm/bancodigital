package servicos

import dominio.Conta
import java.math.BigDecimal

class TransfereServico @JvmOverloads constructor() {
    fun transfere(contade: Conta, contaPara: Conta, valor: BigDecimal) {
        contade.debita(valor)
        contaPara.credita(valor)
    }
}