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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

public class MoodTwoActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Question QQQ;
    String questionString, sname;
    Common common;
    int resID;
    Drawable drawable;
    int wrong_count = 0, corect_counter = 0,total_counter=0;
    private String mAnswer;
    Handler myhandler;
    ImageView answer1, answer2, answer3, answer4;
    TextView d1, d2, d3, d4, d5, d6, d7, d8, g1, g2, g3, g4, g5, g6, g7, g8, e1,
            e2, e3, e4, e5, e6, e7, e8, a1, a2, a3, a4, a5, a6, a7, a8, correct_counter, wrong_counter;

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
        updateQuestion(QQQ.randomqw());
    }

    private void initialization() {
        a1 = findViewById(R.id.a0);
        a2 = findViewById(R.id.a1);
        a3 = findViewById(R.id.a2);
        a4 = findViewById(R.id.a3);
        a5 = findViewById(R.id.a4);
        a6 = findViewById(R.id.a5);
        a7 = findViewById(R.id.a6);
        a8 = findViewById(R.id.a7);
        g1 = findViewById(R.id.g0);
        g2 = findViewById(R.id.g1);
        g3 = findViewById(R.id.g2);
        g4 = findViewById(R.id.g3);
        g5 = findViewById(R.id.g4);
        g6 = findViewById(R.id.g5);
        g7 = findViewById(R.id.g6);
        g8 = findViewById(R.id.g7);
        d1 = findViewById(R.id.d0);
        d2 = findViewById(R.id.d1);
        d3 = findViewById(R.id.d2);
        d4 = findViewById(R.id.d3);
        d5 = findViewById(R.id.d4);
        d6 = findViewById(R.id.d5);
        d7 = findViewById(R.id.d6);
        d8 = findViewById(R.id.d7);
        e1 = findViewById(R.id.e0);
        e2 = findViewById(R.id.e1);
        e3 = findViewById(R.id.e2);
        e4 = findViewById(R.id.e3);
        e5 = findViewById(R.id.e4);
        e6 = findViewById(R.id.e5);
        e7 = findViewById(R.id.e6);
        e8 = findViewById(R.id.e7);
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


    private void updateQuestion(List<String> num) {
        total_counter++;
        if (total_counter>15){
            showDialog();
        }else {
            Resources res = getResources();
            questionString = num.get(4);

            Log.d("TAG", "THIS IS TAG" + num + questionString);


            questionString = num.get(0);
            resID = res.getIdentifier(questionString, "drawable", getPackageName());
            drawable = res.getDrawable(resID);
            answer1.setBackgroundResource(R.color.white);
            answer1.setTag(questionString);
            answer1.setImageDrawable(drawable);


            questionString = num.get(1);
            resID = res.getIdentifier(questionString, "drawable", getPackageName());
            drawable = res.getDrawable(resID);
            answer2.setBackgroundResource(R.color.white);
            answer2.setTag(questionString);
            answer2.setImageDrawable(drawable);

            questionString = num.get(2);
            resID = res.getIdentifier(questionString, "drawable", getPackageName());
            drawable = res.getDrawable(resID);
            answer3.setBackgroundResource(R.color.white);
            answer3.setTag(questionString);
            answer3.setImageDrawable(drawable);

            questionString = num.get(3);
            resID = res.getIdentifier(questionString, "drawable", getPackageName());
            drawable = res.getDrawable(resID);
            answer4.setBackgroundResource(R.color.white);
            answer4.setTag(questionString);
            answer4.setImageDrawable(drawable);
            mAnswer = num.get(4);
            if (TextUtils.equals(mAnswer,"a11") || TextUtils.equals(mAnswer,"a44") || TextUtils.equals(mAnswer,"a66")
            || TextUtils.equals(mAnswer,"d11") || TextUtils.equals(mAnswer,"d44") || TextUtils.equals(mAnswer,"d66")
                    || TextUtils.equals(mAnswer,"e22") || TextUtils.equals(mAnswer,"e44") || TextUtils.equals(mAnswer,"e66")
                    || TextUtils.equals(mAnswer,"g11") || TextUtils.equals(mAnswer,"g33") || TextUtils.equals(mAnswer,"g66"))
            {

                String stringAnswer= mAnswer.substring(0, mAnswer.length() - 1);
                int id = getResources().getIdentifier(stringAnswer, "id", getPackageName());
                TextView textView = findViewById(id);
                textView.setBackgroundResource(R.drawable.non_dot);

            }else {
                int id = getResources().getIdentifier(mAnswer, "id", getPackageName());
                TextView textView = findViewById(id);
                textView.setBackgroundResource(R.drawable.non_dot);
            }

            //textView.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }



    private void showDialog() {

        LayoutInflater layoutInflaterAndroid = LayoutInflater.from(MoodTwoActivity.this);
        @SuppressLint("InflateParams") View mView = layoutInflaterAndroid.inflate(R.layout.dialog_popup_message, null);
        AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(this);
        alertDialogBuilderUserInput.setView(mView);
        alertDialogBuilderUserInput.setCancelable(false);

        final Button btnTryAgain = mView.findViewById(R.id.btn_try_again);
        final Button txtCancel = mView.findViewById(R.id.btn_quit);
        TextView txttotal = mView.findViewById(R.id.tx_total);
        TextView txtWrong = mView.findViewById(R.id.tx_wrong);
        TextView txtCorrect = mView.findViewById(R.id.tx_correct);
        txtWrong.setText("Wrong "+wrong_count);
        txtCorrect.setText("Correct "+corect_counter);
        txttotal.setText("Total Scores "+corect_counter+"/15");

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
                        startActivity(new Intent(MoodTwoActivity.this,MoodTwoActivity.class));
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
                                updateQuestion(QQQ.randomqw());
                        }
                    }, 230);


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
                                updateQuestion(QQQ.randomqw());

                        }
                    }, 230);

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

                                updateQuestion(QQQ.randomqw());

                        }
                    }, 230);
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
                                updateQuestion(QQQ.randomqw());
                        }
                    }, 230);

                } else {
                    playFalseSound();
                    answer4.setBackgroundResource(R.color.lightRed);
                }
                break;

        }
    }

    public void playTrueSound() {
        corect_counter++;
        correct_counter.setText("Correct: "+corect_counter);
        common.SoundPlayer(this, "100.mp3");
    }

    public void playFalseSound() {
        wrong_count++;
        wrong_counter.setText("Wrong: "+wrong_count);
        common.SoundPlayer(this, "101.mp3");

    }
    private void BackGroundSet(){
        g1.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g2.setBackgroundResource(R.drawable.nonselected_red_dot);
        g3.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g4.setBackgroundResource(R.drawable.nonselected_red_dot);
        g5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g6.setBackgroundResource(R.drawable.nonselecteditem_dot);
        g7.setBackgroundResource(R.drawable.nonselected_red_dot);
        g8.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d1.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d2.setBackgroundResource(R.drawable.nonselected_red_dot);
        d3.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d4.setBackgroundResource(R.drawable.nonselected_red_dot);
        d5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d6.setBackgroundResource(R.drawable.nonselecteditem_dot);
        d7.setBackgroundResource(R.drawable.nonselected_red_dot);
        d8.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a1.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a2.setBackgroundResource(R.drawable.nonselected_red_dot);
        a3.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a4.setBackgroundResource(R.drawable.nonselected_red_dot);
        a5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a6.setBackgroundResource(R.drawable.nonselecteditem_dot);
        a7.setBackgroundResource(R.drawable.nonselected_red_dot);
        a8.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e1.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e2.setBackgroundResource(R.drawable.nonselected_red_dot);
        e3.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e4.setBackgroundResource(R.drawable.nonselected_red_dot);
        e5.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e6.setBackgroundResource(R.drawable.nonselecteditem_dot);
        e7.setBackgroundResource(R.drawable.nonselected_red_dot);
        e8.setBackgroundResource(R.drawable.nonselecteditem_dot);
    }
}
