package com.virtualprogrammers.spring.ServiceV2


import javax.swing.JOptionPane
import org.springframework.stereotype.Service
import java.io.Serializable
import java.math.BigDecimal

@Service
class Description
{



    var map = mutableListOf<Data>()
    val listTopping = mutableListOf<String>("Sckokoladensoße", "Vanillesoße", "Erdbeersoße", "Streusel", "Sahne")
    val listIce = mutableListOf<String>("Sckokoladeneis", "Vanilleeis", "Erdbeereis")


    fun preis(name: String): BigDecimal {
        return when {
            name == "Vanilleeis" -> BigDecimal(1.50)
            name == "Erdbeereis" -> BigDecimal(1.25)
            name == "Schokoladeneis" -> BigDecimal(1.45)


            else -> BigDecimal(0)
        }
    }
    fun Topping(topping: String, kugeln: Int) : BigDecimal {
        return when {

            topping == "Schokoladensoße" -> BigDecimal(0.25)
            topping == "Vanillesoße" -> BigDecimal(0.25)
            topping == "Erdbeersoße" -> BigDecimal(0.25)
            topping == "Streusel" -> BigDecimal(0.1)
            topping == "Sahne" -> BigDecimal(0.2)

            else -> BigDecimal(0)
        }
    }

    constructor(){









        for (kugeln in 1..10) {
            for (topping in listTopping) {
                for (name in listIce) {
                    map.add(name,topping, kugeln,preis(name), Topping(topping,kugeln))
                }
            }

        }

    }
    val kombination
    get() = map.toList()

        fun adder(map: Array<Serializable>,map2: Array<String>){
            val input: String = JOptionPane.showInputDialog(null,"Was wollen Sie hinzufügen?")
            val input2 = JOptionPane.showInputDialog(null,"Welche Sorte wollen Sie haben?")
            val input4 = JOptionPane.showMessageDialog(null, "Wie teuer solle es sein?")
            if (input =="Topping"){
                map.add(input2)



            }else{
                map2.add(input)


            }

        }
    fun remover(map2: Array<String>, map: Array<Serializable>){
        val input3 = JOptionPane.showInputDialog(null,"Was soll entfernt werden?")
        if (input3 in listTopping){
            val index = map.indexOf(input3)
            listTopping.removeAt(index)
            println(listTopping)
        }else{
            val index2 = map2.indexOf(input3)
            listIce.removeAt(index2)
            println(listIce)
        }

    }










    fun price(kugeln: Int,name: String,topping: String): BigDecimal
            = preis(name).multiply(BigDecimal(kugeln)).plus(Topping(topping,kugeln))


}

private fun <E> Array<E>.add(input: E) {

}

private fun <E> MutableList<E>.add(name: String, topping: String, kugeln: Int, preis: BigDecimal, Topping: BigDecimal) {

}




