package aula_11

import java.text.CollationElementIterator

class Impressora {

     val listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionaImprimivel(lista: Imprimivel){
         listaImprimivel.add(lista)
    }

    fun imprimaTudoListaImprimivel(){
        for(nomeDalista in listaImprimivel){
            if(nomeDalista is Documento)
                nomeDalista.imprimir()
              else if(nomeDalista is Foto)
                  nomeDalista.imprimir()
                else if(nomeDalista is Contrato)
                    nomeDalista.imprimir()
     }


   /* fun imprimaTudoListaImprimivel() {
        for (tipoDaLista in listaImprimivel) {
            println("Item: ${tipoDaLista.nome}, Tipo de Documento: ${tipoDaLista.tipoDeDocumento}")
        }*/

    }

}
