package com.example.calcubasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    double n1,n2,res;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void botton0(View view)
{
display=(TextView)findViewById(R.id.pantalla);
display.setText(display.getText().toString()+"0");
}
    public void botton1(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"1");
    }
    public void botton2(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"2");
    }
    public void botton3(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"3");
    }
    public void botton4(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"4");
    }
    public void botton5(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"5");
    }
    public void botton6(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"6");
    }
    public void botton7(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"7");
    }
    public void botton8(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"8");
    }
    public void botton9(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        display.setText(display.getText().toString()+"9");
    }
    public void OnClick(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        n1=Double.parseDouble(display.getText().toString());
        display.setText("");
    }
    public void suma(View view)
    {
     operador="+";
     OnClick(view);
    }
    public void resta(View view)
    {
        operador="-";
        OnClick(view);
    }
    public void multi(View view)
    {
        operador="*";
        OnClick(view);
    }
    public void division(View view)
    {
        operador="/";
        OnClick(view);
    }
    public void igual(View view)
    {
        display=(TextView)findViewById(R.id.pantalla);
        n2=Double.parseDouble(display.getText().toString());
        if (operador.equals("+"))
        {
        res=n1+n2;
        }
        else if (operador.equals("-"))
        {
            res=n1-n2;
        }
        else if (operador.equals("*"))
        {
            res=n1*n2;
        }
        else if (operador.equals("/"))
        {
            res=n1/n2;
        }
        display.setText(""+res);
    }
    public void borrar(View view)
    {
    n1=0;
    n2=0;
    display=(TextView)findViewById(R.id.pantalla);
    display.setText("");
    }


}