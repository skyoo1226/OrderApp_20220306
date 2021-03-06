package com.skyoo.orderapp_20220306.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.skyoo.orderapp_20220306.EditNicknameActivity
import com.skyoo.orderapp_20220306.R
import com.skyoo.orderapp_20220306.datas.ProfileData
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_CODE_NICKNAME = 3000

//    val  mMyProfileList = ArrayList<ProfileData>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        여기에 닉네임 변경 버튼을 누르면 실행 되는 코드 입력 해야 될것 같음.
        btnEditNickname.setOnClickListener {

            val myIntent = Intent(requireContext(), EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode == REQ_CODE_NICKNAME) {

            if (resultCode == Activity.RESULT_OK) {

                val resultNickname = data!!.getStringExtra("nickname")
                txtNickname.text = resultNickname
            }
        }
    }
}