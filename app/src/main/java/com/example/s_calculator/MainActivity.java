package com.example.s_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bac,bc,bsqrt,bsquare,bb1,bb2,bmod,bdiv,bmul,bsum,bsub,bequal,bdot,bpi;
   TextView tvsec,tvmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String pi = "3.14159265";
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bmod = findViewById(R.id.bmod);
        bdiv = findViewById(R.id.bdiv);
        bmul = findViewById(R.id.bmul);
        bsum = findViewById(R.id.bsum);
        bsub = findViewById(R.id.bsub);
        bequal = findViewById(R.id.bequal);
        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //ON Click listeners.
        b1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "1");

            }
        }));
        b2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "2");

            }
        }));
        b3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "3");

            }
        }));
        b4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "4");

            }
        }));
        b5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "5");

            }
        }));
        b6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "6");

            }
        }));
        b7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "7");

            }
        }));
        b8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "8");

            }
        }));
        b9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "9");

            }
        }));
        b0.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "0");

            }
        }));
        bac.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText("");
                tvsec.setText(" ");

            }
        }));
        bc.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);

            }
        }));
        bsum.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "+");

            }
        }));
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bsqrt.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));

            }
        }));
        bpi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + pi);

            }
        }));
        bdiv.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "÷");

            }
        }));
        bmul.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "×");

            }
        }));
        bequal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tvmain.getText().toString();
                String replacedstr=val.replace('÷','/').replace('×','*');
                double result=eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);

            }
        }));
        bdot.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + ".");

            }
        }));
        bb1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "(");

            }
        }));
        bb2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + ")");

            }
        }));
        bsquare.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d * d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d + "²");

            }
        }));
    }

public static double eval(final String str){
    return new Object(){
        int pos =-1,ch;
        void nextChar(){
            ch=(++pos<str.length()) ? str.charAt(pos):-1;
        }
        boolean eat(int charToEat){
            while(ch==' ') nextChar();
            if(ch==charToEat){
                nextChar();
                return true;
            }
            return false;
        }
        double parse(){
            nextChar();
            double x=parseExpressio();
            if(pos<str.length()) throw new RuntimeException("Unexpected: "+(char)ch);
            return x;
        }
        //expression =term|expressio'+' term|expresson  "-"term
        //term=factor|- factor|( expresiion ')'|number|functionName factor|factor ^ factor
       double parseExpressio(){
            double x=parseTerm();
            for(;;)
            {
                if(eat('+'))x+=parseTerm();//addition
                else if(eat('-'))x-=parseTerm();//subtraction
                else return x;
            }
       }
       double parseTerm(){
            double x=parseFactor();
            for(;;){
                if(eat('*'))x*=parseFactor();//multiplication.
                else if(eat('/'))x/=parseFactor();
                else return x;
            }
       }
       double parseFactor(){
            if(eat('+'))return parseFactor();//unary plus
           if(eat('-'))return -parseFactor();//unary minus
           double x;
           int startPos=this.pos;
           if(eat('(')){
               //parenthesis
               x=parseExpressio();
               eat(')');
           }else if((ch>='0'&&ch<='9')||ch=='.'){
               //numbers
               while((ch>='0'&&ch<='9')||ch=='.')nextChar();
               x=Double.parseDouble(str.substring(startPos,this.pos));
           }else if(ch>='a'&&ch<='z'){
               //fuctions
               while(ch>='a'&&ch<='z')nextChar();
               String func=str.substring(startPos,this.pos);
               x=parseFactor();
               if(func.equals("sqrt"))x=Math.sqrt(x);
               else throw new RuntimeException("unknown function: "+func);
           }else{
               throw new RuntimeException("Unexpected: "+(char)ch);

           }
           if(eat('^'))x=Math.pow(x,parseFactor());//exponentiation
           return x;
       }
    }.parse();
        }


    }
