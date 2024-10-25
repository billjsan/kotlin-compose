package bill.com

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import bill.com.ui.theme.KotlinAndComposeTheme

class MainActivity : ComponentActivity() {

    data class Message(val a: String, val b: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinAndComposeTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    FirstComposableFunction(Message("Android", "Jetpack Compose"))
                }
                //fistComposableFunction("From Compose")
            }
        }
    }

    @Composable
    fun FirstComposableFunction(msg: Message) {
        Row(modifier = Modifier.padding(start = 20.dp, top = 40.dp, bottom = 40.dp, end = 20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_playstore),
                contentDescription = "Icone do launcher",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(text = "Hello")
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "${msg.a} and ${msg.b}")
            }
        }
    }

}
