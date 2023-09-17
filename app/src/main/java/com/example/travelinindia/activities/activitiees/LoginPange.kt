package com.example.travelinindia.activities.activitiees

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.travelinindia.R
import com.example.travelinindia.activities.MainActivity
import com.example.travelinindia.databinding.LoginPageLayoutBinding
import com.google.android.material.button.MaterialButton


class LoginPange : AppCompatActivity() {
    private var binding:LoginPageLayoutBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val window=window
        window.statusBarColor=getColor(R.color.yellow)
        binding= LoginPageLayoutBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.loginButton.setBackgroundColor(ContextCompat.getColor(this@LoginPange, R.color.almost_teal))
        binding!!.loginButton.strokeColor=getColorStateList(R.color.black)
        binding!!.loginButton.strokeWidth=2
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
                // Item is already selected, show a message or handle it as needed
                Toast.makeText(this, "Item already selected", Toast.LENGTH_SHORT).show()
            }

        }
        binding!!.loginButton.setOnClickListener {
            val userName=binding!!.usernameEtRegister.text.toString()
            val userMail=binding!!.useremailEtRegister.text.toString()
            val password=binding!!.passwordEtRegister.text.toString()
            val confirmPassword=binding!!.passwordConfirmEtRegister.text.toString()
            if(password == confirmPassword){
                setDataToDatabase(userName,userMail,password,selectedOptions)
            }else{
                binding!!.passwordConfirmEtRegister.text!!.clear()
            }
        }


    }

    private fun setDataToDatabase(userName: String, userMail: String, password: String, selectedOptions: MutableList<String>) {
        val intent=Intent(this@LoginPange,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun loginPageFunction(loginButton: MaterialButton, signUpButton: TextView) {
        binding!!.signupLlLayout.visibility= View.GONE
        binding!!.loginLlLayout.visibility= View.VISIBLE
        binding!!.googleSignInButton.visibility=View.VISIBLE
        loginButton.text="Login"
        signUpButton.text="Sign Up"
        binding!!.loginMyAccountTv.text="Welcome Back!"
        binding!!.haveAccountOrNot.text="Don't have an account?"

        val userName=binding!!.usernameEtLogin.text!!.toString()
        val password=binding!!.passwordEtLogin.text!!.toString()
        binding!!.loginButton.setOnClickListener {
            getDataFromLoginDatabase(userName,password)
        }
    }

    private fun getDataFromLoginDatabase(userName: String, password: String) {
        val intent=Intent(this@LoginPange,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}