package `in`.gov.edudel.eventplanner

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EventPlanner(
@PrimaryKey(autoGenerate = true)
    val id:Int=0,
    val stateName:String,
    val cityName:String,
    val vendorName:String,
    val vendorPhoneNumber:String,
    val vendorRating:Float,

)
