package com.loan555.learnui_demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pay.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pay)

        button.setOnClickListener {
            val intent: Intent = Intent(this@SecondActivity,ThreeActivity::class.java)
            startActivity(intent)
        }
    }
}