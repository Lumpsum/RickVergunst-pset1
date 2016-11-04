package com.example.rick.rickvergunst_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {

    // Initialization of the ImageViews in the XML
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

    // Initialization of the HashMap for the SavedState
    Map<String, Boolean> hm = new HashMap<String, Boolean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Creation of the savedState and loading of XML
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning of the images inside the XML
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

        // Check for saved instance
        if (savedInstanceState != null) {
            hm = (HashMap<String, Boolean>) savedInstanceState.getSerializable("hm");

            // Loop trough the HashMap to check for changed visbilities
            for (HashMap.Entry<String, Boolean> entry : hm.entrySet()) {

                // Make a case for every available String inside the HashMap
                switch(entry.getKey()) {
                    case "arm":
                        // Set visible if Boolean is True and invisible if False
                        if (entry.getValue() == TRUE)
                            arm.setVisibility(View.VISIBLE);
                        else
                            arm.setVisibility(View.GONE);
                    case "ear":
                        if (entry.getValue() == TRUE)
                            ear.setVisibility(View.VISIBLE);
                        else
                            ear.setVisibility(View.GONE);
                    case "eyebrow":
                        if (entry.getValue() == TRUE)
                            eyebrow.setVisibility(View.VISIBLE);
                        else
                            eyebrow.setVisibility(View.GONE);
                    case "eye":
                        if (entry.getValue() == TRUE)
                            eye.setVisibility(View.VISIBLE);
                        else
                            eye.setVisibility(View.GONE);
                    case "glass":
                        if (entry.getValue() == TRUE)
                            glass.setVisibility(View.VISIBLE);
                        else
                            glass.setVisibility(View.GONE);
                    case "hat":
                        if (entry.getValue() == TRUE)
                            hat.setVisibility(View.VISIBLE);
                        else
                            hat.setVisibility(View.GONE);
                    case "mouth":
                        if (entry.getValue() == TRUE)
                            mouth.setVisibility(View.VISIBLE);
                        else
                            mouth.setVisibility(View.GONE);
                    case "mustache":
                        if (entry.getValue() == TRUE)
                            mustache.setVisibility(View.VISIBLE);
                        else
                            mustache.setVisibility(View.GONE);
                    case "nose":
                        if (entry.getValue() == TRUE)
                            nose.setVisibility(View.VISIBLE);
                        else
                            nose.setVisibility(View.GONE);
                    case "shoe":
                        if (entry.getValue() == TRUE)
                            shoe.setVisibility(View.VISIBLE);
                        else
                            shoe.setVisibility(View.GONE);
                }
            }
        }
    };

    // Create outState that holds the HashMap after changing to a new orientation
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("hm", (Serializable) hm);
    }

    // Function to check if checkboxes are clicked and change the Img accordingly
    public void onCheckboxClicked(View view) {

        // Check if the checkbox is checked
        boolean checked = ((CheckBox) view).isChecked();

        // Case for every possible checkbox
        switch(view.getId()) {
            case R.id.arms:
                // If checked makes ImgView visible and puts item in HashMap to keep track if you change orientation
                if (checked) {
                    arm.setVisibility(View.VISIBLE);
                    hm.put("arm", TRUE);
                }
                // Does the opposite if the checkbox is not checked
                else {
                    arm.setVisibility(View.GONE);
                    hm.put("arm", FALSE);
                }
                break;
            case R.id.ears:
                if (checked) {
                    ear.setVisibility(View.VISIBLE);
                    hm.put("ear", TRUE);
                }
                else {
                    ear.setVisibility(View.GONE);
                    hm.put("ear", FALSE);
                }
                break;
            case R.id.eyebrows:
                if (checked) {
                    eyebrow.setVisibility(View.VISIBLE);
                    hm.put("eyebrow", TRUE);
                }
                else {
                    eyebrow.setVisibility(View.GONE);
                    hm.put("eyebrow", FALSE);
                }
                break;
            case R.id.eyes:
                if (checked) {
                    eye.setVisibility(View.VISIBLE);
                    hm.put("eye", TRUE);
                }
                else {
                    eye.setVisibility(View.GONE);
                    hm.put("eye", FALSE);
                }
                break;
            case R.id.glasses:
                if (checked) {
                    glass.setVisibility(View.VISIBLE);
                    hm.put("glass", TRUE);
                }
                else {
                    glass.setVisibility(View.GONE);
                    hm.put("glass", FALSE);
                }
                break;
            case R.id.hat:
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                    hm.put("hat", TRUE);
                }
                else {
                    hat.setVisibility(View.GONE);
                    hm.put("hat", FALSE);
                }
                break;
            case R.id.mouth:
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                    hm.put("mouth", TRUE);
                }
                else {
                    mouth.setVisibility(View.GONE);
                    hm.put("mouth", FALSE);
                }
                break;
            case R.id.mustache:
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                    hm.put("mustache", TRUE);
                }
                else {
                    mustache.setVisibility(View.GONE);
                    hm.put("mustache", FALSE);
                }
                break;
            case R.id.nose:
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                    hm.put("nose", TRUE);
                }
                else {
                    nose.setVisibility(View.GONE);
                    hm.put("nose", FALSE);
                }
                break;
            case R.id.shoes:
                if (checked) {
                    shoe.setVisibility(View.VISIBLE);
                    hm.put("shoe", TRUE);
                }
                else {
                    shoe.setVisibility(View.GONE);
                    hm.put("shoe", FALSE);
                }
                break;
        }
    }
}
