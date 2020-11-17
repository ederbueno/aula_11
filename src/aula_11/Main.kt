package aula_11

fun main() {

    var documento = Documento("exercicio", ".docx")
    var foto = Foto("Rosana", "Carteira")
    var contrato = Contrato("Imovel", "RgEscolar")
    var impressora = Impressora()

    impressora.adicionaImprimivel(documento)
    impressora.adicionaImprimivel(foto)
    impressora.adicionaImprimivel(contrato)
    impressora.imprimaTudoListaImprimivel()
}