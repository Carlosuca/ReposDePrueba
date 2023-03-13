package com.cmpp.exampletree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var mEmailEditText: EditText
    private lateinit var mDisplayMessageTextView: TextView
    private lateinit var mSendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

        mDisplayMessageTextView.text = ""
        mSendButton.setOnClickListener{
            val message = mEmailEditText.text.toString()
            mDisplayMessageTextView.text = getString(R.string.greeting_text, message)

        }
    }

    fun bind () {
        mEmailEditText = findViewById(R.id.name_edit_text)
        mDisplayMessageTextView = findViewById(R.id.display_greeting)
        mSendButton = findViewById(R.id.action_send)
    }
}