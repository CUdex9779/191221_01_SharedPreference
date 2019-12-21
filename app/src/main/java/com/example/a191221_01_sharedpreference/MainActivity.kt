package com.example.a191221_01_sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a191221_01_sharedpreference.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setEvents() {

//        Q1.아이디 저장 로직 구현
//        loginBtn이 눌리면
//        idCheckBox가 체크되어있는 지 검사
//        되어 있다면 idEdt에 적혀있는 값을 userId라는 val로 저장

        loginBtn.setOnClickListener {
            if (idCheckBox.isChecked){
                val userId = idEdt.text.toString()

                ContextUtil.setUserId(mContext,userId)

            }
        }

    }

    override fun setValues() {

    }
}
