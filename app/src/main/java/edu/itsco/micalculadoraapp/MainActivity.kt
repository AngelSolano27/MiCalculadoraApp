package edu.itsco.micalculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var operacion: Int = 0
   var numero1: Double =0.0
    lateinit var textview2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview2=findViewById(R.id.textView2)
        val btnborrar: Button = findViewById(R.id.btnborrar)
        val btnigual: Button = findViewById(R.id.btnigual)

        btnigual.setOnClickListener {
            var numero2: Double = textview2.text.toString().toDouble()
            var respuesta: Double = 0.0

            when (operacion){
                1 -> respuesta = numero1 + numero2
                2 -> respuesta = numero1 - numero2
                3 -> respuesta = numero1 * numero2
                4 -> respuesta = numero1 / numero2
            }
            textview2.setText(respuesta.toString())
            textview2.setText("")

        }
        btnborrar.setOnClickListener {
            textview2.setText("")
            numero1= 0.0

        }

    }
    fun presionarDigito(view: View){

        var num2: String = textview2.text.toString()

        when(view.id){
            R.id.btn0 -> textview2.setText(num2 + "0")
            R.id.btn1 -> textview2.setText(num2 + "1")
            R.id.btn2 -> textview2.setText(num2 + "2")
            R.id.btn3 -> textview2.setText(num2 + "3")
            R.id.btn4 -> textview2.setText(num2 + "4")
            R.id.btn5 -> textview2.setText(num2 + "5")
            R.id.btn6 -> textview2.setText(num2 + "6")
            R.id.btn7 -> textview2.setText(num2 + "7")
            R.id.btn8 -> textview2.setText(num2 + "8")
            R.id.btn9 -> textview2.setText(num2 + "9")
            R.id.btnp -> textview2.setText(num2 + ".")


        }

    }
    fun clicOperecion (view: View){
        numero1=textview2.text.toString().toDouble()
        var num2_text:String= textview2.text.toString()
        textview2.setText("")
        when (view.id){
            R.id.btnsuma ->{
                textview2.setText(num2_text + "+")
                operacion=1
            }
            R.id.btnresta ->{
                textview2.setText(num2_text + "-")
                operacion=2

            }
            R.id.btnmulti ->{
                textview2.setText(num2_text + "*")
                operacion=3

            }
            R.id.btndiv ->{
                textview2.setText(num2_text + "/")
                operacion=4

            }


        }

    }
}