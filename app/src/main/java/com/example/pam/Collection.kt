package com.example.pam


fun ContohList(){
    print("=== List ===")
    //list Read.Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)


    //list Mutable
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangle")
    println(shape)

    //menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle")
    print(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
//set bersifat unordered, artinya data yang di masukkan tidak memiliki posisi tertentu
//set bersifat mutable dan read only,artinya data yang di masukkan dapat diubah dan tidak dapat di ubah
//set read only menggunakan setof
//set mutable menggunakan mutablesetof

fun ContohSet() {
    println()
    println("=== Set ===")

    //set read only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)


//set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data kedalam setmutable
    shape.add("Rectangle")
    //menghapus data dari setmutable
    shape.remove("Circle")
    println(shape)

    //set read-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)

}



