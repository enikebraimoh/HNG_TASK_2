package com.zuri.hng.i4g.hng_task_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.zuri.hng.i4g.hng_task_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.input.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               binding.output.text = s
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.button.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://hng.tech/"))
            startActivity(i)
        }
        binding.button2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://ingressive.org"))
            startActivity(i)
        }
        binding.button3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://training.zuri.team"))
            startActivity(i)
        }
        setContentView(binding.root)
    }
}