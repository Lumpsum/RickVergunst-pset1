package com.example.rick.rickvergunst_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static com.example.rick.rickvergunst_pset1.R.id.armsImg;

public class MainActivity extends AppCompatActivity {

    ImageView arm;
    ImageView ear;
    ImageView eyebrow;
    ImageView eye;
    ImageView glass;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arm = (ImageView) findViewById(R.id.armsImg);
        ear = (ImageView) findViewById(R.id.earsImg);
        eyebrow = (ImageView) findViewById(R.id.eyebrowsImg);
        eye = (ImageView) findViewById(R.id.eyesImg);
        glass = (ImageView) findViewById(R.id.glassesImg);
        hat = (ImageView) findViewById(R.id.hatImg);
        mouth = (ImageView) findViewById(R.id.mouthImg);
        mustache = (ImageView) findViewById(R.id.mustacheImg);
        nose = (ImageView) findViewById(R.id.noseImg);
        shoe = (ImageView) findViewById(R.id.shoesImg);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.arms:
                if (checked)
                    arm.setVisibility(View.VISIBLE);
                else
                    arm.setVisibility(View.GONE);
                break;
            case R.id.ears:
                if (checked)
                    ear.setVisibility(View.VISIBLE);
                else
                    ear.setVisibility(View.GONE);
                break;
            case R.id.eyebrows:
                if (checked)
                    eyebrow.setVisibility(View.VISIBLE);
                else
                    eyebrow.setVisibility(View.GONE);
                break;
            case R.id.eyes:
                if (checked)
                    eye.setVisibility(View.VISIBLE);
                else
                    eye.setVisibility(View.GONE);
                break;
            case R.id.glasses:
                if (checked)
                    glass.setVisibility(View.VISIBLE);
                else
                    glass.setVisibility(View.GONE);
                break;
            case R.id.hat:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.GONE);
                break;
            case R.id.mouth:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.GONE);
                break;
            case R.id.mustache:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.GONE);
                break;
            case R.id.nose:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.GONE);
                break;
            case R.id.shoes:
                if (checked)
                    shoe.setVisibility(View.VISIBLE);
                else
                    shoe.setVisibility(View.GONE);
                break;
        }
    }
}
