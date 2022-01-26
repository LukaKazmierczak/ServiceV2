package com.virtualprogrammers.spring.ServiceV2

import java.io.Serializable


data class Data(var name: String, var topping: String, var kugeln: Int,var map: Array<Serializable>,var map2: Array<String>) {
    override fun toString(): String = "Price of $name with $topping is"


}