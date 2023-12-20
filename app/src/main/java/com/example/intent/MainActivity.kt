package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var username : EditText
    private lateinit var age : EditText
    private lateinit var email : EditText
    private lateinit var address : EditText
    private lateinit var gohome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username =findViewById(R.id.username)
        age =findViewById(R.id.age)
        email =findViewById(R.id.email)
        address =findViewById(R.id.address)
        gohome= findViewById(R.id.gohome)

        gohome.setOnClickListener {
            var username = username.text.toString()
            var age = age.text.toString()
            var email = email.text.toString()
            var address = address.text.toString()
            var intent = Intent(this@MainActivity, HomeActivity::class.java)
            intent.putExtra("username",username)
            intent.putExtra("age",age)
            intent.putExtra("email",email)
            intent.putExtra("address",address)
            startActivity(intent)
        }

    }
}