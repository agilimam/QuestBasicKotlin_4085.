package com.example.pam

// Lambda Function
// Lambda Function adalah fungsi yang tidak memiliki nama
// Lambda Function biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return  string.uppercase()
}

//dapat ditulis dalam ekspresi lambda sbb :
fun main(){
    uppercaseString("hello")
    println({ string: String -> string.uppercase()}("Hello"))
    //HELLO
}