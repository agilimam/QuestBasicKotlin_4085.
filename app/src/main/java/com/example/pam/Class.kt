package com.example.pam

class motor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1,"mary@gmail.com")
    //print the value of the property: email
    println(contact.email)

    //updates the value of the property : email
    contact.email = "jane@gmail.com"
}