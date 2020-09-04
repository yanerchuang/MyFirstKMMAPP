package com.ywj.myfirstkmmapp.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ywj.myfirstkmmapp.shared.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        val tv2: TextView = findViewById(R.id.text_view2)
        tv.text = greet()
        tv2.text="文本长度：%d".format(Greeting().calculateNameLength(tv2.text.toString()))
    }
}
