
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


data class Fleet ( val vehicles: List<Vehicle>? = null )
