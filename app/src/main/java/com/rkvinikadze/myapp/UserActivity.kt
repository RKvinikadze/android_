package com.rkvinikadze.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class UserActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val msg = if (intent.getStringExtra(MESSAGE_KEY) == null) "" else intent.getStringExtra(MESSAGE_KEY)

        if (msg != "")
            findViewById<TextView>(R.id.profile_text).text = "Hello, $msg"

        findViewById<ImageButton>(R.id.to_main).setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

}