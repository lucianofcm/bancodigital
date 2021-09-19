package dominio

import java.math.BigDecimal

class Conta @JvmOverloads constructor(
    var numeroConta: Int,
    var titular: Titular,
    var saldo: BigDecimal = BigDecimal(0)
){
    fun credita(valor:BigDecimal){
        this.saldo +=valor
    }
    fun debita(valor:BigDecimal){
        this.saldo -= valor
    }
}