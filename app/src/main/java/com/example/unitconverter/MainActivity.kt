package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)
        val b5: Button = findViewById(R.id.b5)
        val b6: Button = findViewById(R.id.b6)
        val b7: Button = findViewById(R.id.b7)
        val b8: Button = findViewById(R.id.b8)
        val b9: Button = findViewById(R.id.b9)
        val b0: Button = findViewById(R.id.b0)
        val b00: Button = findViewById(R.id.b00)
        val delbtn: Button = findViewById(R.id.delbtn)
        val clearbtn: Button = findViewById(R.id.clearbtn)
        val acbtn: Button = findViewById(R.id.allclear)
        val metertxtview: TextView = findViewById(R.id.metertxt)


        b1.setOnClickListener {
            metertxt.append(b1.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b2.setOnClickListener {
            metertxt.append(b2.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b3.setOnClickListener {
            metertxt.append(b3.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b4.setOnClickListener {
            metertxt.append(b4.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b5.setOnClickListener {
            metertxt.append(b5.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b6.setOnClickListener {
            metertxt.append(b6.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b7.setOnClickListener {
            metertxt.append(b7.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b8.setOnClickListener {
            metertxt.append(b8.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b9.setOnClickListener {
            metertxt.append(b9.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b0.setOnClickListener {
            metertxt.append(b0.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        b00.setOnClickListener {
            metertxt.append(b00.text)
            foottxt.text = (metertxtview.text.toString().toDouble() / 0.3048).toString()
        }

        acbtn.setOnClickListener {
            metertxt.text = ""
            foottxt.text = ""
        }

        clearbtn.setOnClickListener {
            metertxt.text = ""
            foottxt.text = ""
        }

        delbtn.setOnClickListener {
           if(metertxt.text.isEmpty()){
               foottxt.text = "0"
           } else {
               foottxt.text= (metertxtview.text.toString().toDouble() / 0.3048).toString()
               metertxt.text = metertxtview.text.substring(0, metertxt.text.length - 1)
           }
        }

        bstop.setOnClickListener {
            metertxt.append(bstop.text)
        }

    }
}