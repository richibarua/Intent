package com.example.intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var username : TextView
    private lateinit var age : TextView
    private lateinit var email : TextView
    private lateinit var address : TextView
    private lateinit var goback : Button
   @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        goback=findViewById(R.id.goback)
        username =findViewById(R.id.textview1)
        age =findViewById(R.id.textview2)
        email =findViewById(R.id.textview3)
        address =findViewById(R.id.textview4)
        var username=intent.getStringExtra("mess")
        var age=intent.getStringExtra("mess")
        var email=intent.getStringExtra("mess")
        var address=intent.getStringExtra("mess")

       username =username.toString()
       age =age.toString()
       email=email.toString()
       address =address.toString()

       goback.setOnClickListener {
           startActivity(Intent(this@HomeActivity,MainActivity::class.java))
       }
    }
}