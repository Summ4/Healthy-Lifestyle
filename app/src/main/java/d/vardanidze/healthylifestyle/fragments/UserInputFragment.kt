package d.vardanidze.healthylifestyle.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import d.vardanidze.healthylifestyle.R
import d.vardanidze.healthylifestyle.RecyclerViewAdapter
import d.vardanidze.healthylifestyle.ViewItem

class UserInputFragment : Fragment() {

    private lateinit var ourView : View
    private lateinit var mAuth: FirebaseAuth
    private lateinit var rv: RecyclerView
    private lateinit var list: List<ViewItem>

    private lateinit var plusButton: Button
    private lateinit var workoutEditText: EditText
    private lateinit var quantityEditText: EditText

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        ourView =  inflater.inflate(R.layout.user_input, container, false)

        mAuth = FirebaseAuth.getInstance()

        plusButton = ourView.findViewById(R.id.addButton)
        workoutEditText = ourView.findViewById(R.id.workNameTextView)
        quantityEditText = ourView.findViewById(R.id.quantityTextView)

        rv = ourView.findViewById(R.id.recyclerView2)
        // load from database and fill the list
        list = listOf()
        rv.adapter = RecyclerViewAdapter(list)

        registerListeners()

        return ourView
    }

    private fun registerListeners(){
        plusButton.setOnClickListener{
           val workout = workoutEditText.text.toString()
           val quantity = quantityEditText.text.toString().toInt()
            workoutEditText.setText("")
            quantityEditText.setText("")

            // add new item in list
            // update adapter
           rv.adapter = RecyclerViewAdapter(listOf(ViewItem(workout, quantity)))
        }

    }


}