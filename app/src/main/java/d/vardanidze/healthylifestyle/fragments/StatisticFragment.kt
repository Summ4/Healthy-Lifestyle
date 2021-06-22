package d.vardanidze.healthylifestyle.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import d.vardanidze.healthylifestyle.R

class StatisticFragment : Fragment() {

    private lateinit var searchId: EditText
    private lateinit var sendButton: Button

    private lateinit var ourView : View
    private lateinit var mAuth: FirebaseAuth


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ourView = inflater.inflate(R.layout.fragment_statistic, container, false)

        mAuth = FirebaseAuth.getInstance()
        init()

        return ourView
    }

    private fun init() {

        searchId = ourView.findViewById(R.id.searchId)
        sendButton = ourView.findViewById(R.id.sendButton)


    }
}