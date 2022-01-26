package com.virtualprogrammers.spring.ServiceV2
class Test{
    var list = listOf<String>("Hello", "Bye")
    val index = list.indexOf("Bye")

    }


fun main(){
    println(Test().index)
}