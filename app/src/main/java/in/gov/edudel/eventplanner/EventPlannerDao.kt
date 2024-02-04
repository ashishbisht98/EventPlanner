package `in`.gov.edudel.eventplanner

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import java.util.concurrent.Flow


@Dao
interface EventPlannerDao {

@Upsert
suspend fun upsertEventPlannerDetail(eventPlanner: EventPlanner)

@Query("SELECT * FROM eventplanner WHERE cityName=='Dehradun'")
fun getDetails()

}