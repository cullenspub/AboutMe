package com.cjd.learning.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var setNickname = findViewById<Button>(R.id.done_button)
        setNickname.setOnClickListener{v-> addNickname(v)}
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nick_name_edit)
        val nickNameText = findViewById<TextView>(R.id.nickname_text)
        nickNameText.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nickNameText.visibility = View.VISIBLE

        //hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
