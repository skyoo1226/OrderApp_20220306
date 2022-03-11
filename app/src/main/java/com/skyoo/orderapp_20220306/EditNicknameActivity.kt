package com.skyoo.orderapp_20220306

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*
import kotlinx.android.synthetic.main.fragment_my_profile.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnSave.setOnClickListener {
            val inputNickname = btnEditNickname.text.toString()
            val resultintent = Intent()

            resultintent.putExtra("nick", inputNickname)
            setResult(RESULT_OK, resultintent)

            finish()
        }

    }
}