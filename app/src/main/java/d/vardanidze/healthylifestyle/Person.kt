package d.vardanidze.healthylifestyle

import android.graphics.drawable.Icon
import android.widget.Button

data class Person(
    val id: Long,
    val workIcon : Icon,
    val workNameTextView: String,
    val quantityTextView: String,
    val addButton: Button

)