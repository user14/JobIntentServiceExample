package com.pooja.jobintentserviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enqueueWork(view: View){
        val input = edit_text_input.text.toString()
        val serviceIntent = Intent(this, ExampleJobIntentService::class.java)
        serviceIntent.putExtra("inputExtra",input)
        ExampleJobIntentService.enqueueWork(this, serviceIntent)
    }
}