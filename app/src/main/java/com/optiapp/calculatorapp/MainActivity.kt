package com.optiapp.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val meter:TextView = findViewById(R.id.meter)
        val foot:TextView = findViewById(R.id.foot)
        val button7:Button= findViewById(R.id.button10)
        val button8:Button= findViewById(R.id.button11)
        val button9:Button= findViewById(R.id.button12)
        val button4:Button= findViewById(R.id.button9)
        val button5:Button= findViewById(R.id.button15)
        val button6:Button= findViewById(R.id.button14)
        val button1:Button= findViewById(R.id.button8)
        val button2:Button= findViewById(R.id.button18)
        val button3:Button= findViewById(R.id.button17)
        val button00:Button =findViewById(R.id.button4)
        val button0:Button= findViewById(R.id.button5)
        val buttond:Button= findViewById(R.id.button6)
        val convert:Button= findViewById(R.id.button16)
        val clear: Button = findViewById(R.id.button19)
        val del: Button = findViewById(R.id.button7)


        meter.setOnClickListener {
            button7.setOnClickListener {
                meter.append(button7.text)

            }
            button8.setOnClickListener {
                meter.append(button8.text)

            }
            button9.setOnClickListener {
                meter.append(button9.text)

            }
            button4.setOnClickListener {
                meter.append(button4.text)

            }
            button5.setOnClickListener {
                meter.append(button5.text)

            }
            button6.setOnClickListener {
                meter.append(button6.text)

            }
            button1.setOnClickListener {
                meter.append(button1.text)

            }
            button2.setOnClickListener {
                meter.append(button2.text)

            }
            button3.setOnClickListener {
                meter.append(button3.text)

            }
            button00.setOnClickListener {
                meter.append(button00.text)

            }
            button0.setOnClickListener {
                meter.append(button0.text)

            }
            buttond.setOnClickListener {
                meter.append(buttond.text)

            }

        }
        foot.setOnClickListener {
            button7.setOnClickListener {
                foot.append(button7.text)

            }
            button8.setOnClickListener {
                foot.append(button8.text)

            }
            button9.setOnClickListener {
                foot.append(button9.text)

            }
            button4.setOnClickListener {
                foot.append(button4.text)

            }
            button5.setOnClickListener {
                foot.append(button5.text)

            }
            button6.setOnClickListener {
                foot.append(button6.text)

            }
            button1.setOnClickListener {
                foot.append(button1.text)

            }
            button2.setOnClickListener {
                foot.append(button2.text)

            }
            button3.setOnClickListener {
                foot.append(button3.text)

            }
            button00.setOnClickListener {
                foot.append(button00.text)

            }
            button0.setOnClickListener {
                foot.append(button0.text)

            }
            buttond.setOnClickListener {
                foot.append(buttond.text)

            }

        }
        convert.setOnClickListener {
            if(TextUtils.isEmpty(foot.text.toString())){
                val met: String = meter.text.toString()
//                Log.v("print",met);
                val fet= Integer.valueOf(met)*3.28084
                val result=fet.toString()
                foot.append(result)
            }
            if(TextUtils.isEmpty(meter.text.toString())){
                val fet: String = foot.text.toString()
                val met= Integer.valueOf(fet)/3.28084
                val result=met.toString()
                meter.append(result)
            }
        }
        clear.setOnClickListener {
            meter.text = ""
            foot.text = ""

        }
        del.setOnClickListener {
            val con= meter.text.toString()
            val input=con.length
            if(input>0){
                meter.text = con.substring(0, input-1)
                foot.text = ""
            }
            val non= foot.text.toString()
            val input1=non.length
            if(input1>0){
                foot.text = non.substring(0, input-1)
                meter.text = ""
            }

        }



    }

}