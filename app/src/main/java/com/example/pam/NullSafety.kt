package com.example.pam

import org.jetbrains.annotations.NotNull

fun nullSafety(){
    // neverrNull has String type
    var neverNull: String = " This can't be Null"

    //throws a compiler error
    // neverNull = null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    //This is ok
    nullable = null

    //check for null in conditions
    if(neverNull == null){
        println("inferredNonNull is null")
    }else {
        println("InferredNonNull is not null")
    }

    // safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    //notNull doesn't accept null values
    fun srtLength(notNull: String): Int{
        return notNull.length
    }

    println(srtLength(neverNull))//18
}

fun main(){
    nullSafety()
}