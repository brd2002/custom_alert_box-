package com.example.custom_alert_box

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.custom_alert_box.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var dialog : Dialog
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dialog = Dialog(this)
        dialog.setContentView(R.layout.activity_custom_aler2)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.dialog_box_backgroun))
        // create variable for the custom variable
        val GoToNextButton = dialog.findViewById<Button>(R.id.buttonForExit)
        binding.launchAlert.setOnClickListener {
            dialog.show()
        }
        GoToNextButton.setOnClickListener {
            dialog.dismiss()
        }

    }
}