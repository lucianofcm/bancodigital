package dominio

import java.math.BigDecimal

class Conta @JvmOverloads constructor(
    var numeroConta: Int,
    var titular: Titular,
    var saldo: BigDecimal = BigDecimal(0)
){
    fun deposita(valor:BigDecimal){
        this.saldo +=valor
    }
}