package `in`.gov.edudel.eventplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import `in`.gov.edudel.eventplanner.ui.theme.EventPlannerTheme

class MainActivity : ComponentActivity() {

    private val database: EventPlannerDatabase by lazy {
        Room.databaseBuilder(
            applicationContext,
            EventPlannerDatabase::class.java,
            "eventPlanner.db"
        ).build()
    }

    val eventDatabase = database
    val eventDao = database.dao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventPlannerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "EventPlannerHomeScreen"
                    ) {
                        composable("EventPlannerHomeScreen") {
                            EventPlannerHomeScreen(
                                navController = navController,
                                eventDao, eventDatabase
                            )
                        }
                        composable("EventPlannerAddScreen") {
                            EventPlannerAddScreen(
                                navController = navController,
                                eventDao, eventDatabase
                            )
                        }
                    }

                }
            }
        }
    }
}

