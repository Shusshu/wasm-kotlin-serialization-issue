import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Serializable
data class User(
    @SerialName("id")
    val id: String? = null,
)

@Composable
@Preview
fun App() {
    MaterialTheme(

    ) {

    }
}
