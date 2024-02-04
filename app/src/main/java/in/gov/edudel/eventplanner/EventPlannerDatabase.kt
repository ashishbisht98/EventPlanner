package `in`.gov.edudel.eventplanner

import androidx.room.Database
import androidx.room.RoomDatabase
import `in`.gov.edudel.eventplanner.EventPlanner


@Database(entities = [EventPlanner::class], version = 1)
abstract class EventPlannerDatabase:RoomDatabase() {


    abstract val dao:EventPlannerDao

}