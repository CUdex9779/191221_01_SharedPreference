package com.example.a191221_01_sharedpreference.utils

import android.content.Context

class ContextUtil {


    companion object{
        //    우리가 사용할 Preference의 이름 : 메모장 - 저장/로드할 파일이름
        val prefName = "MyProjectPreference"

        //    사용자의 ID를 저장-set/로드-get 할 때 사용하는 항목의 이름을 상수로 저장.
        val USER_ID = "USER_ID"


        //    USER_ID를 저장하는 기능을 구현
        fun setUserId(context: Context, inputId : String ){

//        메모장에서 txt파일을 여는 것과 같은 행위
//        SharedPreference를 열어줌
            val pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

//        열어준 preference에 USER_ID항목에 inputId변수의 값을 저장/확정
            pref.edit().putString(USER_ID , inputId).apply()
        }


        fun getUserId(context: Context) : String{

            val pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            return pref.getString(USER_ID,"")!!

        }
    }

}