package com.rkvinikadze.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

const val MESSAGE_KEY = "extra_message"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.userImg).setOnClickListener{
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.imageButton).setOnClickListener{
            val intent = Intent(this, UserActivity::class.java)
                .putExtra(MESSAGE_KEY, findViewById<EditText>(R.id.editText).text.toString())
            startActivity(intent)
        }

    }
}