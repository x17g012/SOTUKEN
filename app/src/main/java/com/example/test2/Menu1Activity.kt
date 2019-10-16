package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test2.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_menu1.*
import kotlinx.android.synthetic.main.activity_title.*

class Menu1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        //ボタンをクリックしたとき
        button4.setOnClickListener {
            //画面遷移!
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
