package com.skyoo.orderapp_20220306.adapters

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.skyoo.orderapp_20220306.R
import kotlinx.android.synthetic.main.fragment_my_profile.*
import kotlinx.android.synthetic.main.my_profile_list.*

class ProfileAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_profile_list)

        btnSave.setOnClickListener {
            val  inputNickname = btnEditNickname.text.toString()
            val  resultintent = Intent()
            resultintent.putExtra("nick", inputNickname)

            setResult(RESULT_OK, resultintent)

            finish()
        }
    }
}