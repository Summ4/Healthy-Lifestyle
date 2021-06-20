package d.vardanidze.healthylifestyle.fragments

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import d.vardanidze.healthylifestyle.LoginActivity
import d.vardanidze.healthylifestyle.PasswordChangeActivity
import d.vardanidze.healthylifestyle.R

class SettingsFragment : Fragment(){
    private lateinit var emailTextView: TextView
    private lateinit var passwordChangeButton: Button
    private lateinit var logoutButton: Button
    private lateinit var ourView : View
    private lateinit var mAuth: FirebaseAuth

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        ourView =  inflater.inflate(R.layout.fragment_settings, container, false)

        mAuth = FirebaseAuth.getInstance()
        init()
        registerListeners()

        return ourView
    }



    private fun init() {

        emailTextView = ourView.findViewById(R.id.emailAdress)
        passwordChangeButton = ourView.findViewById(R.id.passwordChangeButton)
        logoutButton = ourView.findViewById(R.id.logoutButton)
        emailTextView.text = mAuth.currentUser?.email

    }

    private fun registerListeners() {

        passwordChangeButton.setOnClickListener {
            startActivity(Intent(activity, PasswordChangeActivity::class.java))
        }

        logoutButton.setOnClickListener {
            startActivity( Intent(activity, LoginActivity::class.java))
            mAuth.signOut()

//            finish()
        }

    }


}