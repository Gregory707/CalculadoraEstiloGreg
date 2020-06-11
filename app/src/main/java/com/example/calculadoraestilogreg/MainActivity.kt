package com.example.calculadoraestilogreg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var aux:Double = 0.0;
    var datos: ArrayList<Double> = ArrayList();
    var operator:Int = 0;
    var operator2:Int = 0;

    fun algo(texto:String){
        val builder = AlertDialog.Builder(this)
        builder.setMessage(texto)

        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(applicationContext,
                    android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.show()
    }
    fun err(){
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Math Err.")

        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
            Toast.makeText(applicationContext,
                android.R.string.yes, Toast.LENGTH_SHORT).show()
        }

        builder.show()
    }
    fun acPressed(view : View){
        mitexto.setText("0");
        datos.clear();
        aux = 0.0
        operator = 0
        operator2 = 0
    }

    fun onePressed(view : View){
        val local:String = "1";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
        //algo(aux.toString())
    }
    fun twoPressed(view : View){
        val local:String = "2";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
       // algo(aux.toString())
    }
    fun threePressed(view : View){
        val local:String = "3";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
       // algo(aux.toString())
    }
    fun fourPressed(view : View){
        val local:String = "4";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
       // algo(aux.toString())
    }
    fun fivePressed(view : View){
        val local:String = "5";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
       // algo(aux.toString())
    }
    fun sixPressed(view : View){
        val local:String = "6";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
        //algo(aux.toString())
    }
    fun sevenPressed(view : View){
        val local:String = "7";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
        //algo(aux.toString())
    }
    fun eightPressed(view : View){
        val local:String = "8";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
        //algo(aux.toString())
    }
    fun ninePressed(view : View){
        val local:String = "9";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
        //algo(aux.toString())
    }
    fun ceroPressed(view : View){
        val local:String = "0";
        if(mitexto.text.equals("0")){
            mitexto.setText(local);

        }
        else{

            mitexto.setText(mitexto.text.toString().plus(local));
        }
        aux = mitexto.text.toString().toDouble();
       // algo(aux.toString())
    }



    fun pointSignPressed(view : View){
        val local:String = ".";
        if(mitexto.text.toString().toDouble()<=0 || mitexto.text.toString().toDouble()>0){
            mitexto.setText(mitexto.text.toString().plus(local));
        }
    }

    fun netativeSignPressed(view : View){

        val local:String = "-";
        if(operator == 3){
            if(mitexto.text.toString().equals("+")){
                mitexto.setText(local)
            }

        }
        else{
            if(mitexto.text.toString().equals("0")){
                mitexto.setText(local)
            }
            else if(aux>=0){
                datos.add(aux);
                aux=0.0
                operator = 1
                mitexto.setText(local)
            }
            else if(aux<0){
                datos.add(aux);
                aux=0.0
                operator = 2
                mitexto.setText(local)
            }
        }
    }
    fun positiveSignPressed(view : View){
        val local:String = "+";
        operator = 3;

        if(mitexto.text.toString().equals("0")){
            mitexto.setText(local.plus(""));
        }
        else if(mitexto.text.toString().toDouble()>=0){
            datos.add(aux);
            aux = 0.0;
            operator2 = 4;
            mitexto.setText(local.plus(""));
        }
        else{
            datos.add(aux);
            aux = 0.0;
            operator2 = 5;
            mitexto.setText(local.plus(""));
        }
    }
    fun diviSignPressed(view : View){
        val local:String = "/";
            datos.add(aux);
            aux = 0.0;
            operator = 4;

            mitexto.setText("");
    }
    fun multiSignPressed(view : View){
        val local:String = "x";
        datos.add(aux);
        //aux = 0.0;
        operator = 5;

        mitexto.setText("");
    }
        fun equalsPressed(view : View){
            datos.add(aux)
           // algo(aux.toString())
           // algo(operator.toString().plus("operaicon"))
            when(operator){
                1 ->{
                    if(datos.get(1)>0){
                        aux = datos.get(0)-datos.get(1);
                        mitexto.setText(aux.toString())
                    }
                    else{
                        aux = datos.get(0)+datos.get(1);
                        mitexto.setText(aux.toString())
                    }

                }
                2 ->{
                    aux = datos.get(0)+datos.get(1);
                    mitexto.setText(aux.toString())
                }
                3 ->{
                    when(operator2){
                            4 ->{

                            aux = datos.get(0)+datos.get(1);
                            mitexto.setText(aux.toString())
                            }
                            5 ->{
                                aux = datos.get(0)+datos.get(1);
                                mitexto.setText(aux.toString())
                            }
                        }
                    }
                4 ->{
                    if(datos.get(1)==0.0){
                        err();
                    }
                    else{
                        aux = datos.get(0)/datos.get(1);
                        mitexto.setText(aux.toString())
                    }

                }
                5 ->{
                    aux = datos.get(0)*datos.get(1);
                    mitexto.setText(aux.toString())
                    }
            }

        }
    }

