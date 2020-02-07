package com.example.testlamdba

data class Telephone private constructor(var whoCallMe : String){

    var title: String = "default value"
    set(value) {
        field = "ss"
    }
    get() {
        return title.toUpperCase()
    }

    fun callMe(myName : String){
        println()
    }
}