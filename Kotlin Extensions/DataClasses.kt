//  Data classes in kotlin are used to store data in a class which can be used in the application UI
//  We store the data here without using getters and setters


fun main() {
    val p1 = DataClasses(12,"Ashish")
    val p2 = DataClasses(12,"Ashish")

    println(p1)
    println(p2)

    // toString(), hashCode() and equals() are the functions of Data Classes
    println(p1.hashCode())
    println(p1.equals(p2))


    // Utility functions
    val p3 = p1.copy(id = 3)
    println(p3)

    val(id:Int, Names:String) = p2
    println(p2.component1())
    println(p2.component2())
}

data class DataClasses(val id:Int, val Name: String){

    override fun toString(): String {
        return "DataClasses id = $id, Name = $Name"
    }
}


