
/**
 * Jackson's polymorphic deserialization. Moshi can also be used in case 
 * @JsonCreator @JvmStatic   yet to explore nit working  ref: https://www.baeldung.com/jackson-inheritance
 */



@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "abc"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = Car::class, name = "car"),
    JsonSubTypes.Type(value = Truck::class, name = "truck")
)
sealed class Vehicle(open var make: String="", open var model: String=""){

//    companion object {
//        @JsonCreator
//        @JvmStatic
//        private fun creator(name: String): Vehicle? {
//           return Vehicle::class.sealedSubclasses.firstOrNull { it.simpleName == name }?.objectInstance
//        }
//    }
}


data class Car // no-arg constructor, getters and setters
    (override var make: String="", override var model: String="",  var seatingCapacity: Int=0,  var topSpeed: Double=2.2) : Vehicle(make!!, model!!)

data class Truck // no-arg constructor, getters and setters
    (override var make: String="", override var model: String="",  var payloadCapacity: Double=0.1) : Vehicle(make!!, model!!)



// tests


package com.udaan.paymentstransfer.models

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.Test
import java.util.*


class CarTest{

    @Test
   fun testFun(){
        val car = Car("Mercedes-Benz", "S500", 5, 250.0)
                val truck = Truck("Isuzu", "NQR", 7500.0)

                val vehicles: MutableList<Vehicle> = ArrayList()
                vehicles.add(car)
                vehicles.add(truck)

                val serializedFleet = Fleet(vehicles)
        val mapper = ObjectMapper()
        val jsonDataString: String = mapper.writeValueAsString(serializedFleet)
        println(jsonDataString)
        println(mapper.writeValueAsString(car))
        println(mapper.writeValueAsString(truck))

        val fleet = mapper.readValue(jsonDataString, Fleet::class.java)
        println(fleet)
    }
}



data class Fleet ( val vehicles: List<Vehicle>? = null )
