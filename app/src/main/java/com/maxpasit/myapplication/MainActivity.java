package com.maxpasit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;
public class MainActivity extends AppCompatActivity {


    Button mheeButton = new Button(this);
    EditText name = new EditText(this);
    Resources r = getResources();
    RelativeLayout mheeLayout = new RelativeLayout(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mheeButton.setText("Mheeeeeee!!!!!!");
        mheeButton.setBackgroundColor(Color.GREEN);
        mheeButton.setId(1);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        name.setBackgroundColor(Color.WHITE);
        name.setId(2);
        name.setWidth(px);



        RelativeLayout.LayoutParams buttonPostiton = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams namePostiton = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        namePostiton.addRule(RelativeLayout.ABOVE, mheeButton.getId());
        namePostiton.addRule(RelativeLayout.CENTER_HORIZONTAL);

        buttonPostiton.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonPostiton.addRule(RelativeLayout.CENTER_VERTICAL);



        mheeLayout.addView(mheeButton,buttonPostiton);
        mheeLayout.addView(name, namePostiton);
        mheeLayout.setBackgroundColor(Color.GRAY);

        setContentView(mheeLayout);
    }
}
