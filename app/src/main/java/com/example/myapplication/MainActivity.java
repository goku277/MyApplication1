package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView t1;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b_exit,b_CE,b_dot,b_power;
    private boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal, power;
    private  double input1 = 0, input2 = 0;
    ArrayList<String> list1= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView) findViewById(R.id.result);
        b1= (Button) findViewById(R.id.btn_1);
        b2= (Button) findViewById(R.id.btn_2);
        b3= (Button) findViewById(R.id.btn_3);
        b5= (Button) findViewById(R.id.btn_4);
        b6= (Button) findViewById(R.id.btn_5);
        b7= (Button) findViewById(R.id.btn_6);
        b8= (Button) findViewById(R.id.btn_7);
        b9= (Button) findViewById(R.id.btn_8);
        b10= (Button) findViewById(R.id.btn_9);
        b0= (Button) findViewById(R.id.btn_0);
        b11= (Button) findViewById(R.id.btn_modulo);
        b12= (Button) findViewById(R.id.btn_divide);
        b13= (Button) findViewById(R.id.btn_into);
        b14= (Button) findViewById(R.id.btn_minus);
        b15= (Button) findViewById(R.id.btn_plus);
        b16= (Button) findViewById(R.id.btn_equals);
        b_exit= (Button) findViewById(R.id.btn_exit);
        b_CE= (Button) findViewById(R.id.btn_clear);
        b_exit= (Button) findViewById(R.id.btn_exit);
        b_dot=(Button) findViewById(R.id.btn_dot);
        b_power=(Button) findViewById(R.id.btn_power);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b0.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b_exit.setOnClickListener(this);
        b_CE.setOnClickListener(this);
        b_dot.setOnClickListener(this);
        b_power.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                t1.setText(t1.getText() + "1");
                    break;
            case R.id.btn_0:
                t1.setText(t1.getText() + "0");
                break;
            case R.id.btn_2:
                t1.setText(t1.getText() + "2");
                break;
            case R.id.btn_3:
                t1.setText(t1.getText() + "3");
                break;
            case R.id.btn_4:
                t1.setText(t1.getText() + "4");
                break;
            case R.id.btn_5:
                t1.setText(t1.getText() + "5");
                break;
            case R.id.btn_6:
                t1.setText(t1.getText() + "6");
                break;
            case R.id.btn_7:
                t1.setText(t1.getText() + "7");
                break;
            case R.id.btn_8:
                t1.setText(t1.getText() + "8");
                break;
            case R.id.btn_9:
                t1.setText(t1.getText() + "9");
                break;
            case R.id.btn_into:
                if (t1.getText().length() != 0) {
                    input1 = Float.parseFloat(t1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    t1.setText(null);
                }
                break;
            case R.id.btn_modulo:
                if (t1.getText().length() != 0) {
                    input1 = Float.parseFloat(t1.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    t1.setText(null);
                }
                break;
            case R.id.btn_plus:
                if (t1.getText().length() != 0) {
                    input1 = Float.parseFloat(t1.getText() + "");
                    Addition = true;
                    decimal = false;
                    t1.setText(null);
                }
                break;
            case R.id.btn_minus:
                if (t1.getText().length() != 0) {
                    input1 = Float.parseFloat(t1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    t1.setText(null);
                }
                break;
            case R.id.btn_divide:
                if (t1.getText().length() != 0) {
                    input1 = Float.parseFloat(t1.getText() + "");
                    Division = true;
                    decimal = false;
                    t1.setText(null);
                }
                break;
            case R.id.btn_power:
                if (t1.getText().length() != 0) {
                    input1 = Float.parseFloat(t1.getText() + "");
                    power = true;
                    decimal = false;
                    t1.setText(null);
                }
                break;
            case R.id.btn_clear:
                t1.setText("");
                input1 = 0.0;
                input2 = 0.0;
                break;
            case R.id.btn_equals:
                if (Addition || Subtract || Multiplication || Division || mRemainder || power) {
                    input2 = Float.parseFloat(t1.getText() + "");
                }
                if (Addition) {
                    t1.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract) {
                    t1.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if (Multiplication) {
                    t1.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    t1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    t1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
                if (power) {
                    t1.setText(Math.pow(input1,input2) + "");
                    power=false;
                }
                break;
            case R.id.btn_exit:
                finish();
                System.exit(0);
                break;
            case R.id.btn_dot:
                if (decimal) {
                } else {
                    t1.setText(t1.getText() + ".");
                    decimal = false;
                }
                break;
        }
    }
}
