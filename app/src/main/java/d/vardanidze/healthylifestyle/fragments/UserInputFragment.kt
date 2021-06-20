package d.vardanidze.healthylifestyle.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import d.vardanidze.healthylifestyle.R

class UserInputFragment : Fragment() {

    private lateinit var ourView : View
    private lateinit var mAuth: FirebaseAuth


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        ourView =  inflater.inflate(R.layout.user_input, container, false)

        mAuth = FirebaseAuth.getInstance()
//        init()
//        registerListeners()

        return ourView
    }
}