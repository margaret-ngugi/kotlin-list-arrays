fun main() {

//Q1
    numbers()
//Q2
    println(peopleName("Ann","Faith","Maggie"))

//Q3
personObjects()

//Q4



}

//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)

fun numbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers[1].plus(numbers[4]))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())


}


//2. Given a list of Person objects, each with the attributes, name, age, height, and weight. Sort the
// list in order of descending age (2 points)

data class Person(var names: String,var  age:Int,var height: Int,var  weight:Int)
fun personObjects() {
    val person1 = Person("John", 13, 1, 20)
    val person2 = Person("marion", 24, 3, 61)
    val person3 = Person("Ruth", 29, 2, 50)
    val personList = listOf(person1, person2, person3)
    println( personList.sortedByDescending { person -> person.age })

}






//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)


fun peopleName(name1:String,name2:String,name3:String):String {
    var people = arrayOf(name1, name2, name3)
    return people.contentToString()
}
//4. Write a function that takes in a list of Car objects each with a registration and mileage
// attribute and returns the average mileage of all the vehicles in the list. (3 points)

data class Vehicle(var registration:String,var mileage:Int)
fun vehicleObject(vehicle: List<Vehicle>):Int{
    var x = Vehicle("KXWYP",42)
    var w = Vehicle("KVCMT",60)
    var z = Vehicle("KNBRD",80)
    var allVehicles = listOf(x,w,z)
    var avg=0
    vehicle.forEach { car ->
        car.mileage
        avg += car.mileage
    }
    var totalAvg=vehicle.count()
   return totalAvg
}