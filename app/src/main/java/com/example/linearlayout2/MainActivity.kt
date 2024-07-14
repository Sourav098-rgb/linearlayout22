package com.example.linearlayout2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var btn:Button?=null
    var btn2:Button?=null
    var editText1 : EditText? = null
    var editText2 : EditText? = null
    var editText3 : EditText? = null
    var editText4 : EditText? = null
    var editText5 : EditText? = null
    var editText6 : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn = findViewById(R.id.btnsave)
        btn2 = findViewById(R.id.btncancle)
        editText1 = findViewById(R.id.edtname)
        editText2 = findViewById(R.id.edtcontact)
        editText3 = findViewById(R.id.edtmail)
        editText4 = findViewById(R.id.edtaddress)
        editText5 = findViewById(R.id.edtPassword)
        editText6 = findViewById(R.id.edtConfirmPassword)

      btn?.setOnClickListener {
          if (editText1?.text.toString().isNullOrEmpty()||
              editText2?.text.toString().isNullOrEmpty()||
              editText3?.text.toString().isNullOrEmpty()||
              editText4?.text.toString().isNullOrEmpty()||
              editText5?.text.toString().isNullOrEmpty()||
              editText6?.text.toString().isNullOrEmpty()) {
              Toast.makeText(this, " enter full details", Toast.LENGTH_SHORT).show()
              if(editText1.text.toString().isNullOrEmpty(){

                  editText1?.error="Enter your name"
                      )

      }
                  if(editText2?.text.toString().isNullOrEmpty()){
                      editText2?.error="Enter contact"
                  }
              if (editText3?.text.toString().isNullOrEmpty()){
                  editText3?.error="Enter E-mail"
              }
              if (editText4?.text.toString().isNullOrEmpty()){
                  editText4?.error="Enter Address"
              }
              if (editText5?.text.toString().isNullOrEmpty()){
                  editText5?.error="Enter Password"
              }
              if (editText6?.text.toString().isNullOrEmpty()){
                  editText6?.error="Enter confirm password"
              }


            }
          else if (editText6?.text.toString()!=
              editText5?.text.toString()){
              editText6?.error="Password does not match "
          }
          else{
              var intent=Intent(this,LinearLayout::class.java)
          }
}
        btn2?.setOnClickListener {
            Toast.makeText(this,editText1?.text.toString() ,Toast.LENGTH_SHORT).show()
        }
    }
}