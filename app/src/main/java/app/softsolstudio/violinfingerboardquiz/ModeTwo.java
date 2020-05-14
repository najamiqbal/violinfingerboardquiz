package app.softsolstudio.violinfingerboardquiz;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;
import java.util.Random;

public class ModeTwo extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Question QQQ;
    String questionString, sname;
    Common common;
    int resID;
    Drawable drawable;
    int wrong_count = 0, corect_counter = 0, total_counter = 0;
    private String mAnswer;
    Handler myhandler;
    ImageView answer1, answer2, answer3, answer4;
    TextView d0, d1, d2, d3, d4, d5, d6, d7, g0, g1, g2, g3, g4, g5, g6, g7, e0,
            e1, e2, e3, e4, e5, e6, e7, a0, a1, a2, a3, a4, a5, a6, a7, correct_counter, wrong_counter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood_two);
        toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle("Quiz mode 2");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        QQQ = new Question();
        common = new Common();
        myhandler = new Handler();
        initialization();
        final int min = 1;
        final int max = 45;
        final int random = new Random().nextInt((max - min) + 1) + min;
        RandomQuestion(random);
    }

    private void initialization() {
        a0 = findViewById(R.id.a0);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        a7 = findViewById(R.id.a7);
        g0 = findViewById(R.id.g0);
        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);
        g7 = findViewById(R.id.g7);
        d0 = findViewById(R.id.d0);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        e0 = findViewById(R.id.e0);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);
        e7 = findViewById(R.id.e7);
        wrong_counter = findViewById(R.id.wrong_counter);
        correct_counter = findViewById(R.id.correct_counter);
        answer1 = findViewById(R.id.image_question1);
        answer2 = findViewById(R.id.image_question2);
        answer3 = findViewById(R.id.image_question3);
        answer4 = findViewById(R.id.image_question4);
        answer1.setOnClickListener(this);
        answer2.setOnClickListener(this);
        answer3.setOnClickListener(this);
        answer4.setOnClickListener(this);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //menu item selected
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private void RandomQuestion(int random) {
        //mind_think.setBackgroundColor(getResources().getColor(R.color.white));
        total_counter++;
        if (total_counter > 20) {
            showDialog();
        } else {

/*            final int min = 1;
            final int max = 45;
            final int random = new Random().nextInt((max - min) + 1) + min;*/
            Log.d("Mode One", "random value" + random);
            switch (random) {
                case 1:
                    answer1.setImageResource(R.drawable.e0);
                    //wrong images
                    answer2.setImageResource(R.drawable.d0);
                    answer3.setImageResource(R.drawable.d6);
                    answer4.setImageResource(R.drawable.e1);

                    mAnswer = "e0";
                    answer1.setTag(mAnswer);
                    e0.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 2:
                    answer1.setImageResource(R.drawable.g7);
                    //wrong images
                    answer2.setImageResource(R.drawable.a6);
                    answer3.setImageResource(R.drawable.d0);
                    answer4.setImageResource(R.drawable.g11);
                    mAnswer = "g7";
                    answer1.setTag(mAnswer);
                    g7.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 3:
                    answer1.setImageResource(R.drawable.a7);
                    //wrong images
                    answer2.setImageResource(R.drawable.g1);
                    answer3.setImageResource(R.drawable.a6);
                    answer4.setImageResource(R.drawable.e0);
                    mAnswer = "a7";
                    answer1.setTag(mAnswer);
                    a7.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 4:
                    answer1.setImageResource(R.drawable.e7);
                    //wrong images
                    answer2.setImageResource(R.drawable.a6);
                    answer3.setImageResource(R.drawable.g11);
                    answer4.setImageResource(R.drawable.e2);
                    mAnswer = "e7";
                    answer1.setTag(mAnswer);
                    e7.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 5:
                    answer1.setImageResource(R.drawable.g3);
                    //wrong images
                    answer2.setImageResource(R.drawable.g11);
                    answer3.setImageResource(R.drawable.a6);
                    answer4.setImageResource(R.drawable.d0);
                    mAnswer = "g3";
                    answer1.setTag(mAnswer);
                    g3.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 6:
                    answer1.setImageResource(R.drawable.a6);
                    //wrong images
                    answer2.setImageResource(R.drawable.g0);
                    answer3.setImageResource(R.drawable.d1);
                    answer4.setImageResource(R.drawable.e1);
                    mAnswer = "a6";
                    answer1.setTag(mAnswer);
                    a6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 7:
                    answer1.setImageResource(R.drawable.a3);
                    //wrong images
                    answer2.setImageResource(R.drawable.a7);
                    answer3.setImageResource(R.drawable.e22);
                    answer4.setImageResource(R.drawable.g3);
                    mAnswer = "a3";
                    answer1.setTag(mAnswer);
                    a3.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 8:
                    answer1.setImageResource(R.drawable.e4);
                    //wrong images
                    answer2.setImageResource(R.drawable.g33);
                    answer3.setImageResource(R.drawable.e22);
                    answer4.setImageResource(R.drawable.a4);
                    mAnswer = "e4";
                    answer1.setTag(mAnswer);
                    e4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 9:
                    answer1.setImageResource(R.drawable.d2);
                    //wrong images
                    answer2.setImageResource(R.drawable.a44);
                    answer3.setImageResource(R.drawable.d0);
                    answer4.setImageResource(R.drawable.g33);
                    mAnswer = "d2";
                    answer1.setTag(mAnswer);
                    d2.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 10:
                    answer1.setImageResource(R.drawable.g6);
                    //wrong images
                    answer2.setImageResource(R.drawable.a44);
                    answer3.setImageResource(R.drawable.g33);
                    answer4.setImageResource(R.drawable.e2);
                    mAnswer = "g6";
                    answer1.setTag(mAnswer);
                    g6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 11:
                    answer1.setImageResource(R.drawable.e6);
                    //wrong images
                    answer2.setImageResource(R.drawable.g2);
                    answer3.setImageResource(R.drawable.a66);
                    answer4.setImageResource(R.drawable.d2);
                    mAnswer = "e6";
                    answer1.setTag(mAnswer);
                    e6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 12:
                    answer2.setImageResource(R.drawable.a0);
                    //wrong images
                    answer1.setImageResource(R.drawable.a66);
                    answer3.setImageResource(R.drawable.e22);
                    answer4.setImageResource(R.drawable.g2);
                    mAnswer = "a0";
                    answer2.setTag(mAnswer);
                    a0.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 13:
                    answer2.setImageResource(R.drawable.d4);
                    //wrong images
                    answer1.setImageResource(R.drawable.g2);
                    answer3.setImageResource(R.drawable.e22);
                    answer4.setImageResource(R.drawable.a44);
                    mAnswer = "d4";
                    answer2.setTag(mAnswer);
                    d4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 14:
                    answer2.setImageResource(R.drawable.g1);
                    //wrong images
                    answer1.setImageResource(R.drawable.d2);
                    answer3.setImageResource(R.drawable.e5);
                    answer4.setImageResource(R.drawable.a66);
                    mAnswer = "g1";
                    answer2.setTag(mAnswer);
                    g1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 15:
                    answer2.setImageResource(R.drawable.e2);
                    //wrong images
                    answer1.setImageResource(R.drawable.a5);
                    answer3.setImageResource(R.drawable.g1);
                    answer4.setImageResource(R.drawable.g0);
                    mAnswer = "e2";
                    answer2.setTag(mAnswer);
                    e2.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 16:
                    answer4.setImageResource(R.drawable.d1);
                    //wrong images
                    answer2.setImageResource(R.drawable.a0);
                    answer3.setImageResource(R.drawable.g7);
                    answer1.setImageResource(R.drawable.e5);
                    mAnswer = "d1";
                    answer4.setTag(mAnswer);
                    d1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 17:
                    answer3.setImageResource(R.drawable.g4);
                    //wrong images
                    answer2.setImageResource(R.drawable.g1);
                    answer1.setImageResource(R.drawable.e5);
                    answer4.setImageResource(R.drawable.d2);
                    mAnswer = "g4";
                    answer3.setTag(mAnswer);
                    g4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 18:
                    answer4.setImageResource(R.drawable.d11);
                    //wrong images
                    answer2.setImageResource(R.drawable.a0);
                    answer3.setImageResource(R.drawable.e5);
                    answer1.setImageResource(R.drawable.d2);
                    mAnswer = "d11";
                    answer4.setTag(mAnswer);
                    d1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 19:
                    answer3.setImageResource(R.drawable.g5);
                    //wrong images
                    answer2.setImageResource(R.drawable.e5);
                    answer1.setImageResource(R.drawable.a0);
                    answer4.setImageResource(R.drawable.d2);
                    mAnswer = "g5";
                    answer3.setTag(mAnswer);
                    g5.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 20:
                    answer4.setImageResource(R.drawable.g2);
                    //wrong images
                    answer2.setImageResource(R.drawable.a0);
                    answer3.setImageResource(R.drawable.e5);
                    answer1.setImageResource(R.drawable.e66);
                    mAnswer = "g2";
                    answer4.setTag(mAnswer);
                    g2.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 21:
                    answer2.setImageResource(R.drawable.e66);
                    //wrong images
                    answer1.setImageResource(R.drawable.a5);
                    answer3.setImageResource(R.drawable.e0);
                    answer4.setImageResource(R.drawable.g1);
                    mAnswer = "e66";
                    answer2.setTag(mAnswer);
                    e6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 22:
                    answer2.setImageResource(R.drawable.e22);
                    //wrong images
                    answer1.setImageResource(R.drawable.e66);
                    answer3.setImageResource(R.drawable.g1);
                    answer4.setImageResource(R.drawable.a0);
                    mAnswer = "e22";
                    answer2.setTag(mAnswer);
                    e2.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 23:
                    answer2.setImageResource(R.drawable.d3);
                    //wrong images
                    answer1.setImageResource(R.drawable.d2);
                    answer3.setImageResource(R.drawable.g0);
                    answer4.setImageResource(R.drawable.g5);
                    mAnswer = "d3";
                    answer2.setTag(mAnswer);
                    d3.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 24:
                    answer2.setImageResource(R.drawable.d0);
                    //wrong images
                    answer1.setImageResource(R.drawable.e44);
                    answer3.setImageResource(R.drawable.g0);
                    answer4.setImageResource(R.drawable.e1);
                    mAnswer = "d0";
                    answer2.setTag(mAnswer);
                    d0.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 25:
                    answer3.setImageResource(R.drawable.d6);
                    //wrong images
                    answer2.setImageResource(R.drawable.d2);
                    answer1.setImageResource(R.drawable.g2);
                    answer4.setImageResource(R.drawable.g7);
                    mAnswer = "d6";
                    answer3.setTag(mAnswer);
                    d6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 26:
                    answer3.setImageResource(R.drawable.d66);
                    //wrong images
                    answer2.setImageResource(R.drawable.d0);
                    answer1.setImageResource(R.drawable.e7);
                    answer4.setImageResource(R.drawable.e44);
                    mAnswer = "d66";
                    answer3.setTag(mAnswer);
                    d6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 27:
                    answer3.setImageResource(R.drawable.a4);
                    //wrong images
                    answer2.setImageResource(R.drawable.a3);
                    answer1.setImageResource(R.drawable.e44);
                    answer4.setImageResource(R.drawable.g0);
                    mAnswer = "a4";
                    answer3.setTag(mAnswer);
                    a4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 28:
                    answer4.setImageResource(R.drawable.d44);
                    //wrong images
                    answer2.setImageResource(R.drawable.e44);
                    answer3.setImageResource(R.drawable.a0);
                    answer1.setImageResource(R.drawable.d7);
                    mAnswer = "d44";
                    answer4.setTag(mAnswer);
                    d4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 29:
                    answer4.setImageResource(R.drawable.e3);
                    //wrong images
                    answer2.setImageResource(R.drawable.a3);
                    answer3.setImageResource(R.drawable.g4);
                    answer1.setImageResource(R.drawable.e7);
                    mAnswer = "e3";
                    answer4.setTag(mAnswer);
                    e3.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 30:
                    answer4.setImageResource(R.drawable.a5);
                    //wrong images
                    answer2.setImageResource(R.drawable.a0);
                    answer3.setImageResource(R.drawable.g33);
                    answer1.setImageResource(R.drawable.g4);
                    mAnswer = "a5";
                    answer4.setTag(mAnswer);
                    a5.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 31:
                    answer2.setImageResource(R.drawable.g33);
                    //wrong images
                    answer1.setImageResource(R.drawable.e5);
                    answer3.setImageResource(R.drawable.a66);
                    answer4.setImageResource(R.drawable.g7);
                    mAnswer = "g33";
                    answer2.setTag(mAnswer);
                    g3.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 32:
                    answer3.setImageResource(R.drawable.a1);
                    //wrong images
                    answer2.setImageResource(R.drawable.a0);
                    answer1.setImageResource(R.drawable.a7);
                    answer4.setImageResource(R.drawable.e1);
                    mAnswer = "a1";
                    answer3.setTag(mAnswer);
                    a1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 33:
                    answer2.setImageResource(R.drawable.a66);
                    //wrong images
                    answer1.setImageResource(R.drawable.e44);
                    answer3.setImageResource(R.drawable.e6);
                    answer4.setImageResource(R.drawable.g0);
                    mAnswer = "a66";
                    answer2.setTag(mAnswer);
                    a6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 34:
                    answer3.setImageResource(R.drawable.d7);
                    //wrong images
                    answer2.setImageResource(R.drawable.d44);
                    answer1.setImageResource(R.drawable.a2);
                    answer4.setImageResource(R.drawable.e44);
                    mAnswer = "d7";
                    answer3.setTag(mAnswer);
                    d7.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 35:
                    answer2.setImageResource(R.drawable.a2);
                    //wrong images
                    answer1.setImageResource(R.drawable.a4);
                    answer3.setImageResource(R.drawable.e44);
                    answer4.setImageResource(R.drawable.d7);
                    mAnswer = "a2";
                    answer2.setTag(mAnswer);
                    a2.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 36:
                    answer3.setImageResource(R.drawable.g0);
                    //wrong images
                    answer2.setImageResource(R.drawable.a0);
                    answer1.setImageResource(R.drawable.g33);
                    answer4.setImageResource(R.drawable.g3);
                    mAnswer = "g0";
                    answer3.setTag(mAnswer);
                    g0.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 37:
                    answer3.setImageResource(R.drawable.e5);
                    //wrong images
                    answer2.setImageResource(R.drawable.e0);
                    answer1.setImageResource(R.drawable.e1);
                    answer4.setImageResource(R.drawable.a7);
                    mAnswer = "e5";
                    answer3.setTag(mAnswer);
                    e5.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 38:
                    answer4.setImageResource(R.drawable.d5);
                    //wrong images
                    answer2.setImageResource(R.drawable.g5);
                    answer3.setImageResource(R.drawable.g7);
                    answer1.setImageResource(R.drawable.a2);
                    mAnswer = "d5";
                    answer4.setTag(mAnswer);
                    d5.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 39:
                    answer4.setImageResource(R.drawable.g11);
                    //wrong images
                    answer2.setImageResource(R.drawable.g0);
                    answer3.setImageResource(R.drawable.e7);
                    answer1.setImageResource(R.drawable.d2);
                    mAnswer = "g11";
                    answer4.setTag(mAnswer);
                    g1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 40:
                    answer4.setImageResource(R.drawable.a11);
                    //wrong images
                    answer2.setImageResource(R.drawable.g4);
                    answer3.setImageResource(R.drawable.a2);
                    answer1.setImageResource(R.drawable.e5);
                    mAnswer = "a11";
                    answer4.setTag(mAnswer);
                    a1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 41:
                    answer4.setImageResource(R.drawable.a44);
                    //wrong images
                    answer2.setImageResource(R.drawable.d11);
                    answer3.setImageResource(R.drawable.d5);
                    answer1.setImageResource(R.drawable.e3);
                    mAnswer = "a44";
                    answer4.setTag(mAnswer);
                    a4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 42:
                    answer4.setImageResource(R.drawable.e44);
                    //wrong images
                    answer2.setImageResource(R.drawable.e6);
                    answer3.setImageResource(R.drawable.g66);
                    answer1.setImageResource(R.drawable.d1);
                    mAnswer = "e44";
                    answer4.setTag(mAnswer);
                    e4.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 43:
                    answer3.setImageResource(R.drawable.g66);
                    //wrong images
                    answer2.setImageResource(R.drawable.a3);
                    answer1.setImageResource(R.drawable.e4);
                    answer4.setImageResource(R.drawable.a7);
                    mAnswer = "g66";
                    answer3.setTag(mAnswer);
                    g6.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
                case 44:
                    answer3.setImageResource(R.drawable.e1);
                    //wrong images
                    answer2.setImageResource(R.drawable.d3);
                    answer1.setImageResource(R.drawable.g11);
                    answer4.setImageResource(R.drawable.g2);
                    mAnswer = "e1";
                    answer3.setTag(mAnswer);
                    e1.setBackgroundResource(R.drawable.non_dot);
                    setWhite();
                    break;
            }

        }

    }


    private void setWhite() {
        answer1.setBackgroundColor(getResources().getColor(R.color.white));
        answer2.setBackgroundColor(getResources().getColor(R.color.white));
        answer3.setBackgroundColor(getResources().getColor(R.color.white));
        answer4.setBackgroundColor(getResources().getColor(R.color.white));
    }


    private void showDialog() {

        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(ModeTwo.this);
        @SuppressLint("InflateParams") View mView = layoutInflaterAndroid.inflate(R.layout.dialog_popup_message, null);
        AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(this);
        alertDialogBuilderUserInput.setView(mView);
        alertDialogBuilderUserInput.setCancelable(false);

        final Button btnTryAgain = mView.findViewById(R.id.btn_try_again);
        final Button txtCancel = mView.findViewById(R.id.btn_quit);
        TextView txttotal = mView.findViewById(R.id.tx_total);
        TextView txtWrong = mView.findViewById(R.id.tx_wrong);
        TextView txtCorrect = mView.findViewById(R.id.tx_correct);
        txtWrong.setText("Wrong " + wrong_count);
        txtCorrect.setText("Correct " + corect_counter);
        txttotal.setText("Total Scores " + corect_counter + "/20");

        alertDialogBuilderUserInput
                .setCancelable(false);

        AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();

        alertDialogAndroid.setOnShowListener(new DialogInterface.OnShowListener() {

            @Override
            public void onShow(final DialogInterface dialog) {
                btnTryAgain.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        startActivity(new Intent(ModeTwo.this, ModeTwo.class));
                        finish();
                    }
                });
                txtCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        finish();
                    }
                });
            }
        });
        alertDialogAndroid.show();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_question1:
                if (answer1.getTag() == mAnswer) {
                    playTrueSound();
                    answer1.setBackgroundResource(R.color.green);
                    BackGroundSet();
                    myhandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            final int min = 34;
                            final int max = 44;
                            final int random = new Random().nextInt((max - min) + 1) + min;
                            Log.d("CHAL GYA","THIS===>"+random);
                            RandomQuestion(random);
                        }
                    }, 250);


                } else {
                    playFalseSound();
                    answer1.setBackgroundResource(R.color.lightRed);
                }
                break;
            case R.id.image_question2:
                if (answer2.getTag() == mAnswer) {
                    playTrueSound();
                    answer2.setBackgroundResource(R.color.green);
                    BackGroundSet();
                    myhandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            final int min = 1;
                            final int max = 12;
                            final int random = new Random().nextInt((max - min) + 1) + min;
                            Log.d("CHAL GYA","THIS===>"+random);
                            RandomQuestion(random);

                        }
                    }, 250);

                } else {
                    playFalseSound();
                    answer2.setBackgroundResource(R.color.lightRed);
                }
                break;
            case R.id.image_question3:
                if (answer3.getTag() == mAnswer) {
                    playTrueSound();
                    answer3.setBackgroundResource(R.color.green);
                    BackGroundSet();
                    myhandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            final int min = 13;
                            final int max = 23;
                            final int random = new Random().nextInt((max - min) + 1) + min;
                            Log.d("CHAL GYA","THIS===>"+random);
                            RandomQuestion(random);

                        }
                    }, 250);
                } else {
                    playFalseSound();
                    answer3.setBackgroundResource(R.color.lightRed);
                }
                break;
            case R.id.image_question4:
                if (answer4.getTag() == mAnswer) {
                    playTrueSound();
                    answer4.setBackgroundResource(R.color.green);
                    BackGroundSet();
                    myhandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            final int min = 23;
                            final int max = 34;
                            final int random = new Random().nextInt((max - min) + 1) + min;
                            Log.d("CHAL GYA","THIS===>"+random);
                            RandomQuestion(random);
                        }
                    }, 250);

                } else {
                    playFalseSound();
                    answer4.setBackgroundResource(R.color.lightRed);
                }
                break;

        }
    }

    public void playTrueSound() {
        corect_counter++;
        correct_counter.setText("Correct: " + corect_counter);
        common.SoundPlayer(this, "100.mp3");
    }

    public void playFalseSound() {
        wrong_count++;
        wrong_counter.setText("Wrong: " + wrong_count);
        common.SoundPlayer(this, "101.mp3");

    }

    private void BackGroundSet() {
        g0.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g1.setBackgroundResource(R.drawable.nonselected_red_dot);
        g2.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g3.setBackgroundResource(R.drawable.nonselected_red_dot);
        g4.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g6.setBackgroundResource(R.drawable.nonselected_red_dot);
        g7.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d0.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d1.setBackgroundResource(R.drawable.nonselected_red_dot);
        d2.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d3.setBackgroundResource(R.drawable.nonselected_red_dot);
        d4.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d6.setBackgroundResource(R.drawable.nonselected_red_dot);
        d7.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a0.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a1.setBackgroundResource(R.drawable.nonselected_red_dot);
        a2.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a3.setBackgroundResource(R.drawable.nonselected_red_dot);
        a4.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a6.setBackgroundResource(R.drawable.nonselected_red_dot);
        a7.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e0.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e1.setBackgroundResource(R.drawable.nonselected_red_dot);
        e2.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e3.setBackgroundResource(R.drawable.nonselected_red_dot);
        e4.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e6.setBackgroundResource(R.drawable.nonselected_red_dot);
        e7.setBackgroundResource(R.drawable.nonselecteditem_dot);
    }
}
