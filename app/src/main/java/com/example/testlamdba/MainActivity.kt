package com.example.testlamdba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            Toast.makeText(this , "dd" , Toast.LENGTH_LONG).show()
        }

        run {
            val telephone = Telephone("English")
            telephone
        }.callMe("sssss")

        val telephone: Telephone? = Telephone("English")


        //Let it Run this literal, it Also Apply this
        //Let & Run return last line ， Also & Apply return self

        //如果變數為? 可改使用run
        with(telephone){
            telephone?.whoCallMe = "s"
        }

        //不可變更參數名稱
        telephone?.run {
            whoCallMe
        }

        //let可以變更參數名稱，否則預設it
        telephone?.let {telephone
            telephone.whoCallMe = "s"
        }
    }


}
