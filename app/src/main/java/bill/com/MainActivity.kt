package bill.com

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bill.com.ui.theme.KotlinAndComposeTheme
import bill.com.ui.theme.Purple40
import bill.com.ui.theme.PurpleGrey80


class MainActivity : ComponentActivity() {

    data class Message(val a: String, val b: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinAndComposeTheme {
                FirstComposableFunction(Message("Android", "Jetpack Compose"))
            }
        }
    }

    @Composable
    fun FirstComposableFunction(msg: Message) {
        Surface(
            shape = MaterialTheme.shapes.extraLarge,
            color = Purple40,
            shadowElevation = 2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 15.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_playstore),
                    contentDescription = "Ícone do launcher",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(20.dp))
                )

                Spacer(modifier = Modifier.width(10.dp))

                Column(
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Surface(
                        shape = MaterialTheme.shapes.medium,
                        shadowElevation = 5.dp,
                        color = PurpleGrey80
                    ) {
                        Text(
                            text = "Hello",
                            modifier = Modifier.padding(all = 10.dp),
                            style = MaterialTheme.typography.titleSmall,
                            fontSize = 18.sp,
                            color = Purple40,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Surface(
                        shape = MaterialTheme.shapes.medium,
                        shadowElevation = 2.dp,
                        color = PurpleGrey80
                    ) {
                        Text(
                            text = "${msg.a} and ${msg.b}",
                            modifier = Modifier.padding(all = 10.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Center,
                            fontSize = 15.sp,
                            color = Purple40,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }

}
