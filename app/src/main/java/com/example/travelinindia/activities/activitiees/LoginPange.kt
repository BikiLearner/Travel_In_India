package com.example.travelinindia.activities.activitiees

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.edit
import com.example.travelinindia.R
import com.example.travelinindia.activities.ForConstant
import com.example.travelinindia.activities.MainActivity
import com.example.travelinindia.databinding.LoginPageLayoutBinding
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginPange : AppCompatActivity() {
    private var binding:LoginPageLayoutBinding?=null
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val window=window
        window.statusBarColor=getColor(R.color.blanchedalmond)
        binding= LoginPageLayoutBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.loginButton.setBackgroundColor(ContextCompat.getColor(this@LoginPange, R.color.almost_teal))
        binding!!.loginButton.strokeColor=getColorStateList(R.color.black)
        binding!!.loginButton.strokeWidth=2
        auth = Firebase.auth

        checkLoginStatus()
        loginPageFunction(binding!!.loginButton, binding!!.signUpButton)
        binding!!.signUpButton.setOnClickListener {
            if(binding!!.signUpButton.text=="Login") {
                loginPageFunction(binding!!.loginButton, binding!!.signUpButton)
            }else{
                signUpFunction(binding!!.loginButton,binding!!.signUpButton)
            }
        }



    }

    private fun signUpFunction(loginButton: MaterialButton, signUpButton: TextView) {
        binding!!.loginLlLayout.visibility= View.GONE
        binding!!.signupLlLayout.visibility= View.VISIBLE
        binding!!.googleSignInButton.visibility=View.GONE
        loginButton.text="Sign Up"
        signUpButton.text="Login"
        binding!!.loginMyAccountTv.text="Create an account!"
        binding!!.haveAccountOrNot.text="I have an account?"

        val travelPreferences = ArrayList<String>()
        travelPreferences.add("Beach vacations")
        travelPreferences.add("Adventure travel")
        travelPreferences.add("Cultural experiences")
        travelPreferences.add("City exploration")
        travelPreferences.add("Wildlife and nature trips")
        travelPreferences.add("Food and culinary tours")
        travelPreferences.add("Historical sites and museums")
        travelPreferences.add("Relaxing spa retreats")
        travelPreferences.add("Skiing and winter sports")
        travelPreferences.add("Road trips")
        travelPreferences.add("Cruises")
        travelPreferences.add("Backpacking and hiking")
        travelPreferences.add("Luxury resorts")
        travelPreferences.add("Wellness and yoga retreats")
        val selectedOptions = mutableListOf<String>()
        val adapter=ArrayAdapter(this,R.layout.preferences_list_layout,travelPreferences)
        binding!!.autoCompleteTextView.setAdapter(adapter)
        binding!!.autoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())
        binding!!.autoCompleteTextView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = adapter.getItem(position)

            if (!selectedOptions.contains(selectedItem)) {
                // Item is not already selected, so add it to the list
                selectedOptions.add(selectedItem!!)
            } else {
                Toast.makeText(this, "Item already selected", Toast.LENGTH_SHORT).show()
            }

        }
        binding!!.loginButton.setOnClickListener {
            val userName=binding!!.usernameEtRegister.text.toString()
            val userMail=binding!!.useremailEtRegister.text.toString()
            val password=binding!!.passwordEtRegister.text.toString()
            val confirmPassword=binding!!.passwordConfirmEtRegister.text.toString()
            if(userMail.isNotEmpty() && password.isNotEmpty() && password == confirmPassword) {
                createAccount(userMail,password)
                val sharedPreferences = getSharedPreferences(ForConstant.myProfileData, Context.MODE_PRIVATE)
                val editor=sharedPreferences.edit()
                editor.putString(ForConstant.myProfileUserName,userName)
                editor.apply()
            }else{
                Toast.makeText(this@LoginPange,"Please Enter user name ",Toast.LENGTH_LONG).show()
            }
        }


    }

    @SuppressLint("SetTextI18n")
    private fun loginPageFunction(loginButton: MaterialButton, signUpButton: TextView) {
        binding!!.signupLlLayout.visibility= View.GONE
        binding!!.loginLlLayout.visibility= View.VISIBLE
        binding!!.googleSignInButton.visibility=View.VISIBLE
        loginButton.text="Login"
        signUpButton.text="Sign Up"
        binding!!.loginMyAccountTv.text="Welcome Back!"
        binding!!.haveAccountOrNot.text="Don't have an account?"

        binding!!.loginButton.setOnClickListener {
            val userName=binding!!.usernameEtLogin.text!!.toString()
            val password=binding!!.passwordEtLogin.text!!.toString()
            if(userName.isNotEmpty() && password.isNotEmpty()) {
                signIn(userName,password)
            }else{
                Toast.makeText(this@LoginPange,"Please Enter user name ",Toast.LENGTH_LONG).show()
            }

        }
    }
    private fun createAccount(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user=auth.currentUser
                    Toast.makeText(
                        baseContext,
                        "Your account has been created",
                        Toast.LENGTH_SHORT,
                    ).show()
                    loginPageFunction(binding!!.loginButton, binding!!.signUpButton)
                } else {
                    Toast.makeText(
                        baseContext,
                        "Create account failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                }
            }
    }
    private fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        baseContext,
                        "Your account has been created",
                        Toast.LENGTH_SHORT,
                    ).show()
                    startActivity(Intent(this@LoginPange,MainActivity::class.java))
                    finish()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(
                        baseContext,
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                }
            }
    }
    private fun checkLoginStatus(){
        if(auth.currentUser!=null) {
            startActivity(Intent(this@LoginPange,MainActivity::class.java))
            finish()
        }
    }

}