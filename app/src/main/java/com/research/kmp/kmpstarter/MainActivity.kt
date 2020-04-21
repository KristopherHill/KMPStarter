package com.research.kmp.kmpstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstName = "Kris"
        val lastName = "Hill"
        val address = "Huddersfield HD5"
        val phoneNumber = "01484 123321"
        val age = 22

        val user = User(firstName, lastName, address, phoneNumber, age)

        val userIdView = findViewById<TextView>(R.id.userInfo)
        val systemInfo = findViewById<TextView>(R.id.systemOs)

        userIdView.text = user.fullDetails
        systemInfo.text = platformName

    }
}
