package com.example.auke_pc.mrpotatohead2;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.auke_pc.mrpotatohead2.R;

public class MainActivity extends AppCompatActivity {

    ImageView imgArms, imgEars, imgEyes, imgGlasses, imgNose, imgShoes, imgEyebrows, imgHat,
            imgMouth, imgMoustache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgArms = findViewById(R.id.arms);
        imgEars = findViewById(R.id.ears);
        imgEyes = findViewById(R.id.eyes);
        imgGlasses = findViewById(R.id.glasses);
        imgNose = findViewById(R.id.nose);
        imgShoes = findViewById(R.id.shoes);
        imgEyebrows = findViewById(R.id.eyebrows);
        imgHat = findViewById(R.id.hat);
        imgMouth = findViewById(R.id.mouth);
        imgMoustache = findViewById(R.id.moustache);
    }

    public void OnCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox_arms:

                if (checked)
                    imgArms.setVisibility(View.VISIBLE);
                else
                    imgArms.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_ears:

                if (checked)
                    imgEars.setVisibility(View.VISIBLE);
                else
                    imgEars.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_eyes:

                if (checked)
                    imgEyes.setVisibility(View.VISIBLE);
                else
                    imgEyes.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_glasses:

                if (checked)
                    imgGlasses.setVisibility(View.VISIBLE);
                else
                    imgGlasses.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_nose:

                if (checked)
                    imgNose.setVisibility(View.VISIBLE);
                else
                    imgNose.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_shoes:

                if (checked)
                    imgShoes.setVisibility(View.VISIBLE);
                else
                    imgShoes.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_eyebrows:

                if (checked)
                    imgEyebrows.setVisibility(View.VISIBLE);
                else
                    imgEyebrows.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_hat:

                if (checked)
                    imgHat.setVisibility(View.VISIBLE);
                else
                    imgHat.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_mouth:

                if (checked)
                    imgMouth.setVisibility(View.VISIBLE);
                else
                    imgMouth.setVisibility(View.INVISIBLE);
                break;

            case R.id.checkBox_moustache:

                if (checked)
                    imgMoustache.setVisibility(View.VISIBLE);
                else
                    imgMoustache.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int image_visibility = imgArms.getVisibility();
        outState.putInt("visArms", image_visibility);

        outState.putInt("visEars", imgEars.getVisibility());
        outState.putInt("visEyes", imgEyes.getVisibility());
        outState.putInt("visGlasses", imgGlasses.getVisibility());
        outState.putInt("visNose", imgNose.getVisibility());
        outState.putInt("visShoes", imgShoes.getVisibility());
        outState.putInt("visEyebrows", imgEyebrows.getVisibility());
        outState.putInt("visHat", imgHat.getVisibility());
        outState.putInt("visMouth", imgMouth.getVisibility());
        outState.putInt("visMoustache", imgMoustache.getVisibility());
    }

    @Override
    public void onRestoreInstanceState (Bundle inState) {
        super.onRestoreInstanceState(inState);

        int valueStored = inState.getInt("visArms");
        imgArms.setVisibility(valueStored);

        valueStored = inState.getInt("visEars");
        imgEars.setVisibility(valueStored);

        valueStored = inState.getInt("visEyes");
        imgEyes.setVisibility(valueStored);

        valueStored = inState.getInt("visGlasses");
        imgGlasses.setVisibility(valueStored);

        valueStored = inState.getInt("visNose");
        imgNose.setVisibility(valueStored);

        valueStored = inState.getInt("visShoes");
        imgShoes.setVisibility(valueStored);

        valueStored = inState.getInt("visEyebrows");
        imgEyebrows.setVisibility(valueStored);

        valueStored = inState.getInt("visHat");
        imgHat.setVisibility(valueStored);

        valueStored = inState.getInt("visMouth");
        imgMouth.setVisibility(valueStored);

        valueStored = inState.getInt("visMoustache");
        imgMoustache.setVisibility(valueStored);


    }
}
