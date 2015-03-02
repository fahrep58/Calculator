package com.example.fahrep58.calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public final static String MY_MSG = "com.example.fahrep58.calculator.MESSAGE";
    public void sendMessage(View v)
    {
       Intent intent = new Intent(this, Solve.class);
        TextView tv = (TextView)findViewById(R.id.textView2);
        String message = tv.getText().toString();

        InfixEvaluator infix = new InfixEvaluator();

        infix.convertToPostfix(message);

        message = "" + infix.evaluatePostfix(infix.getExpression());

        intent.putExtra(MY_MSG, message);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String excellent = "";


    }

    public String excellent = "";

    public void backspace(View view) {

        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "")
        {
            tv.setText(excellent);
        }
        else
        {
            excellent = excellent.substring(0,excellent.length() -1);
        }

        tv.setText(excellent);

    }
    public void addToListOne(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "1";
        else excellent = excellent + "1";

        tv.setText(excellent);
    }

    public void addToListTwo(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "2";
        else excellent = excellent + "2";

        tv.setText(excellent);
    }

    public void addToListThree(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "3";
        else excellent = excellent + "3";

        tv.setText(excellent);
    }
    public void addToListFour(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "4";
        else excellent = excellent + "4";

        tv.setText(excellent);
    }

    public void addToListFive(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "5";
        else excellent = excellent + "5";

        tv.setText(excellent);
    }

    public void addToListSix(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "6";
        else excellent = excellent + "6";

        tv.setText(excellent);
    }

    public void addToListSeven(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "7";
        else excellent = excellent + "7";

        tv.setText(excellent);
    }

    public void addToListEight(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "8";
        else excellent = excellent + "8";

        tv.setText(excellent);
    }

    public void addToListNine(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "9";
        else excellent = excellent + "9";

        tv.setText(excellent);
    }

    public void addToListZero(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "0";
        else excellent = excellent + "0";

        tv.setText(excellent);
    }

    public void addToListPeriod(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = ".";
        else excellent = excellent + ".";

        tv.setText(excellent);
    }

    public void addToListLeft(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "(";
        else excellent = excellent + "(";

        tv.setText(excellent);
    }

    public void addToListRight(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = ")";
        else excellent = excellent + ")";

        tv.setText(excellent);
    }

    public void addToListMulti(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "*";
        else excellent = excellent + "*";

        tv.setText(excellent);
    }

    public void addToListAdd(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "+";
        else excellent = excellent + "+";

        tv.setText(excellent);
    }

    public void addToListSub(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "-";
        else excellent = excellent + "-";

        tv.setText(excellent);
    }

    public void addToListDivide(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "/";
        else excellent = excellent + "/";

        tv.setText(excellent);
    }

    public void addToListIntDivide(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        if (excellent == "") excellent = "i";
        else excellent = excellent + "i";

        tv.setText(excellent);
    }

    public void clearList(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView2);

        excellent = "";


        tv.setText(excellent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
