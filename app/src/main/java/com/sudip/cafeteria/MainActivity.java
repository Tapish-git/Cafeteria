package com.sudip.cafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView numberOfCups;
    EditText comment;
    Button addButton;
    Button minusButton;
    Button order;
    CheckBox option1;
    CheckBox option2;
    CheckBox checkedOption;
    public void order(View view){
        String category = (String)checkedOption.getText();
        String quantity = (String)numberOfCups.getText();
        String message;
        if (Integer.valueOf(quantity)>0) {
            message = "Your order for " + quantity + " cups of " + category + " successfully placed.";
            numberOfCups.setText("0");
        }else{
            message = "Please Enter a valid quantity";
        }
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
    public void checkOptionOne(View view){
        checkedOption = option1;
        option1.setChecked(true);
        option2.setChecked(false);
    }
    public void checkOptionTwo(View view){
        checkedOption = option2;
        option1.setChecked(false);
        option2.setChecked(true);
    }
    public void minus(View view){
        Integer quantity = Integer.valueOf((String)numberOfCups.getText());
        if (quantity>0){
            quantity-=1;
            numberOfCups.setText(String.valueOf(quantity));
        }
    }
    public void add(View view){
        Integer quantity = Integer.valueOf((String)numberOfCups.getText());
        quantity+=1;
        numberOfCups.setText(String.valueOf(quantity));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOfCups = findViewById(R.id.textView4);
        comment = findViewById(R.id.editTextTextPersonName);
        addButton = findViewById(R.id.button2);
        minusButton = findViewById(R.id.button);
        order = findViewById(R.id.button3);
        option1 = findViewById(R.id.checkBox1);
        option2 = findViewById(R.id.checkBox2);
        option1.setChecked(true);
        checkedOption = option1;
    }
}