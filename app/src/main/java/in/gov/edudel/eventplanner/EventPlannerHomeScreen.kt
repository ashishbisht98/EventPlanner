package `in`.gov.edudel.eventplanner;

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventPlannerHomeScreen(
    navController: NavController,
    eventDao: EventPlannerDao,
    eventDatabase: EventPlannerDatabase
) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    val stateName by remember {
        mutableStateOf("")
    }
    val cityName by remember {
        mutableStateOf("")
    }
    val vendorName by remember {
        mutableStateOf("")
    }
    val vendorPhoneNumber by remember {
        mutableStateOf("")
    }
    val vendorRating by remember {
        mutableStateOf("")
    }



    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "EventsPlanner",
                    modifier = Modifier.weight(1F),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.primary
                )

            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {

                navController.navigate("AddEventPlannerAddScreen")
            }) {
                Icon(imageVector = Icons.Rounded.Add, contentDescription = "")
            }
        }


    ) {
        Text(text = "", modifier = Modifier.padding(it))
    }
}
