package com.ozanyazici.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozanyazici.intentkotlin.databinding.ActivityNextBinding
import android.view.View

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromMain = intent //getIntent()
        val name = intentFromMain.getStringExtra("name")
        binding.textView3.text = "Name: ${name}"


    }

    fun previous(view : View) {
        val intentToMain = Intent(this@NextActivity, MainActivity::class.java)
        startActivity(intentToMain)
        finish()
    }
}