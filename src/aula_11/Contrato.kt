package aula_11

class Contrato(override val nome: String, override val tipoDeDocumento:String) : Imprimivel {
    override fun imprimir() = println("Sou um contrato muito legal $nome $tipoDeDocumento")
}