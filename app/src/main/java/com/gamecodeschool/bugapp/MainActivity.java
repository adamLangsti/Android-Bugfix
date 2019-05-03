package com.gamecodeschool.bugapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements 	View.OnClickListener {

    // An int variable to hold a value
    private int value = 0;

    // A bunch of Buttons and a TextView
    public Button btnAdd;
    public Button btnTake;
    private TextView txtValue;
    private Button btnGrow;
    private Button btnShrink;
    private Button btnReset;
    private Button btnHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to all the buttons in our UI
        // Match them up to all our Button objects we declared earlier
        btnAdd =  findViewById(R.id.btnAdd);
        btnTake =  findViewById(R.id.btnTake);
        txtValue = findViewById(R.id.textValue);
        btnGrow = findViewById(R.id.btnGrow);
        btnShrink = findViewById(R.id.btnShrink);
        btnReset = findViewById(R.id.btnReset);
        btnHide = findViewById(R.id.btnHide);

        //Listens for click
        txtValue.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        // A local variable to use later
        float size;

        //Action toggle after click

        switch(view.getId()){
            case R.id.btnAdd:
                value ++;
                txtValue.setText(""+ value);

                break;

            case R.id.btnTake:
                value--;
                txtValue.setText(""+ value);

                break;

            case R.id.btnReset:
                value = 0;
                txtValue.setText(""+ value);

                break;

            case R.id.btnGrow:
                size = txtValue.getTextScaleX();
                txtValue.setTextScaleX(size + 1);

                break;

            case R.id.btnShrink:
                size = txtValue.getTextScaleX();
                txtValue.setTextScaleX(size - 1);

                break;

            case R.id.btnHide:
                if (txtValue.getVisibility() == View.VISIBLE) {
                    txtValue.setVisibility(View.INVISIBLE);

                    btnHide.setText("SHOW");
                } else {
                    txtValue.setVisibility(View.VISIBLE);

                    btnHide.setText("HIDE");

                    break;
                }

        }

    }
}

