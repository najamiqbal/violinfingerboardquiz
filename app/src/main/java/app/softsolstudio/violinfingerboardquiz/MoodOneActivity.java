package app.softsolstudio.violinfingerboardquiz;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Random;

public class MoodOneActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    String answer_1 = "", anwser_2 = "";
    int wrong_counter = 0, corect_counter = 0;
    Common common=new Common();
    Animation frombottom, fromtop;
    TextView tv_d1, tv_d2, tv_d3, tv_d4, tv_d5, tv_d6, tv_d7, tv_d8, tv_g1, tv_g2, tv_g3, tv_g4, tv_g5, tv_g6, tv_g7, tv_g8, tv_e1,
            tv_e2, tv_e3, tv_e4, tv_e5, tv_e6, tv_e7, tv_e8, tv_a1, tv_a2, tv_a3, tv_a4, tv_a5, tv_a6, tv_a7, tv_a8, tv_correct_counter, tv_wrong_counter;
    ImageView question_image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood_one);
        toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle("Quiz mood 1");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        intialization();
    }

    private void intialization() {
        tv_a1 = findViewById(R.id.a1);
        tv_a2 = findViewById(R.id.a2);
        tv_a3 = findViewById(R.id.a3);
        tv_a4 = findViewById(R.id.a4);
        tv_a5 = findViewById(R.id.a5);
        tv_a6 = findViewById(R.id.a6);
        tv_a7 = findViewById(R.id.a7);
        tv_a8 = findViewById(R.id.a8);
        tv_g1 = findViewById(R.id.g1);
        tv_g2 = findViewById(R.id.g2);
        tv_g3 = findViewById(R.id.g3);
        tv_g4 = findViewById(R.id.g4);
        tv_g5 = findViewById(R.id.g5);
        tv_g6 = findViewById(R.id.g6);
        tv_g7 = findViewById(R.id.g7);
        tv_g8 = findViewById(R.id.g8);
        tv_d1 = findViewById(R.id.d1);
        tv_d2 = findViewById(R.id.d2);
        tv_d3 = findViewById(R.id.d3);
        tv_d4 = findViewById(R.id.d4);
        tv_d5 = findViewById(R.id.d5);
        tv_d6 = findViewById(R.id.d6);
        tv_d7 = findViewById(R.id.d7);
        tv_d8 = findViewById(R.id.d8);
        tv_e1 = findViewById(R.id.e1);
        tv_e2 = findViewById(R.id.e2);
        tv_e3 = findViewById(R.id.e3);
        tv_e4 = findViewById(R.id.e4);
        tv_e5 = findViewById(R.id.e5);
        tv_e6 = findViewById(R.id.e6);
        tv_e7 = findViewById(R.id.e7);
        tv_e8 = findViewById(R.id.e8);
        tv_g1.setOnClickListener(this);
        tv_g2.setOnClickListener(this);
        tv_g3.setOnClickListener(this);
        tv_g4.setOnClickListener(this);
        tv_g5.setOnClickListener(this);
        tv_g6.setOnClickListener(this);
        tv_g7.setOnClickListener(this);
        tv_g8.setOnClickListener(this);
        tv_d1.setOnClickListener(this);
        tv_d2.setOnClickListener(this);
        tv_d3.setOnClickListener(this);
        tv_d4.setOnClickListener(this);
        tv_d5.setOnClickListener(this);
        tv_d6.setOnClickListener(this);
        tv_d7.setOnClickListener(this);
        tv_d8.setOnClickListener(this);
        tv_a1.setOnClickListener(this);
        tv_a2.setOnClickListener(this);
        tv_a3.setOnClickListener(this);
        tv_a4.setOnClickListener(this);
        tv_a5.setOnClickListener(this);
        tv_a6.setOnClickListener(this);
        tv_a7.setOnClickListener(this);
        tv_a8.setOnClickListener(this);
        tv_e1.setOnClickListener(this);
        tv_e2.setOnClickListener(this);
        tv_e3.setOnClickListener(this);
        tv_e4.setOnClickListener(this);
        tv_e5.setOnClickListener(this);
        tv_e6.setOnClickListener(this);
        tv_e7.setOnClickListener(this);
        tv_e8.setOnClickListener(this);
        tv_wrong_counter = findViewById(R.id.tv_wrong_counter);
        tv_correct_counter = findViewById(R.id.tv_correct_counter);
        question_image = findViewById(R.id.image_question);
        RandomQuestion();
    }

    private void RandomQuestion() {
        final int min = 1;
        final int max = 44;
        final int random = new Random().nextInt((max - min) + 1) + min;
        Log.d("Mode One", "random value" + random);
        switch (random) {
            case 1:
                question_image.setBackgroundResource(R.drawable.d0);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d0";
                anwser_2="";
                break;
            case 2:
                question_image.setBackgroundResource(R.drawable.d1);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d1";
                anwser_2 = "d11";
                break;
            case 3:
                question_image.setBackgroundResource(R.drawable.d11);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d1";
                anwser_2 = "d11";
                break;
            case 4:
                question_image.setBackgroundResource(R.drawable.d2);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d2";
                anwser_2="";
                break;
            case 5:
                question_image.setBackgroundResource(R.drawable.d3);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d3";
                anwser_2="";
                break;
            case 6:
                question_image.setBackgroundResource(R.drawable.d4);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d4";
                anwser_2 = "d44";
                break;
            case 7:
                question_image.setBackgroundResource(R.drawable.d44);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d4";
                anwser_2 = "d44";
                break;
            case 8:
                question_image.setBackgroundResource(R.drawable.d5);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d5";
                anwser_2="";
                break;
            case 9:
                question_image.setBackgroundResource(R.drawable.d6);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d6";
                anwser_2 = "d66";
                break;
            case 10:
                question_image.setBackgroundResource(R.drawable.d66);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "d6";
                anwser_2 = "d66";
                break;
            case 11:
                question_image.setBackgroundResource(R.drawable.d7);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                anwser_2="";
                answer_1 = "d7";
                break;
            case 12:
                question_image.setBackgroundResource(R.drawable.g0);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g0";
                anwser_2="";
                break;
            case 13:
                question_image.setBackgroundResource(R.drawable.g1);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g1";
                anwser_2 = "g11";
                break;
            case 14:
                question_image.setBackgroundResource(R.drawable.g11);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g1";
                anwser_2 = "g11";
                break;
            case 15:
                question_image.setBackgroundResource(R.drawable.g2);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g2";
                anwser_2="";
                break;
            case 16:
                question_image.setBackgroundResource(R.drawable.g3);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g3";
                anwser_2 = "g33";
                break;
            case 17:
                question_image.setBackgroundResource(R.drawable.g33);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g3";
                anwser_2 = "g33";
                break;
            case 18:
                question_image.setBackgroundResource(R.drawable.g4);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g4";
                anwser_2="";
                break;
            case 19:
                question_image.setBackgroundResource(R.drawable.g5);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g5";
                anwser_2="";
                break;
            case 20:
                question_image.setBackgroundResource(R.drawable.g6);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g6";
                anwser_2 = "g66";
                break;
            case 21:
                question_image.setBackgroundResource(R.drawable.g66);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g6";
                anwser_2 = "g66";
                break;
            case 22:
                question_image.setBackgroundResource(R.drawable.g7);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "g7";
                anwser_2="";
                break;
            case 23:
                question_image.setBackgroundResource(R.drawable.a0);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a1";
                anwser_2="";
                break;
            case 24:
                question_image.setBackgroundResource(R.drawable.a1);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a1";
                anwser_2 = "a11";
                break;
            case 25:
                question_image.setBackgroundResource(R.drawable.a11);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a1";
                anwser_2 = "a11";
                break;
            case 26:
                question_image.setBackgroundResource(R.drawable.a2);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a2";
                anwser_2="";
                break;
            case 27:
                question_image.setBackgroundResource(R.drawable.a3);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a3";
                anwser_2="";
                break;
            case 28:
                question_image.setBackgroundResource(R.drawable.a4);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a4";
                anwser_2 = "a44";
                break;
            case 29:
                question_image.setBackgroundResource(R.drawable.a44);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a4";
                anwser_2 = "a44";
                break;
            case 30:
                question_image.setBackgroundResource(R.drawable.a5);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a5";
                anwser_2="";
                break;
            case 31:
                question_image.setBackgroundResource(R.drawable.a6);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a6";
                anwser_2 = "a66";
                break;
            case 32:
                question_image.setBackgroundResource(R.drawable.a66);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a6";
                anwser_2 = "a66";
                break;
            case 33:
                question_image.setBackgroundResource(R.drawable.a7);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "a7";
                anwser_2="";
                break;
            case 34:
                question_image.setBackgroundResource(R.drawable.e0);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e0";
                anwser_2="";
                break;
            case 35:
                question_image.setBackgroundResource(R.drawable.e1);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e1";
                anwser_2="";
                break;
            case 36:
                question_image.setBackgroundResource(R.drawable.e2);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e2";
                anwser_2 = "e22";
                break;
            case 37:
                question_image.setBackgroundResource(R.drawable.e22);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e2";
                anwser_2 = "e22";
                break;
            case 38:
                question_image.setBackgroundResource(R.drawable.e3);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e3";
                anwser_2="";
                break;
            case 39:
                question_image.setBackgroundResource(R.drawable.e4);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e4";
                anwser_2 = "e44";
                break;
            case 40:
                question_image.setBackgroundResource(R.drawable.e44);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e4";
                anwser_2 = "e44";
                break;
            case 41:
                question_image.setBackgroundResource(R.drawable.e5);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e5";
                anwser_2="";
                break;
            case 42:
                question_image.setBackgroundResource(R.drawable.e6);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e6";
                anwser_2 = "e66";
                break;
            case 43:
                question_image.setBackgroundResource(R.drawable.e66);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e6";
                anwser_2 = "e66";
                break;
            case 44:
                question_image.setBackgroundResource(R.drawable.e7);
                frombottom = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
                question_image.setAnimation(frombottom);
                answer_1 = "e7";
                anwser_2="";
                break;

        }

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

    @Override
    public void onClick(View v) {
        Log.d("answer","Value"+answer_1+anwser_2);
        switch (v.getId()) {
            case R.id.g1:
                if (TextUtils.equals(answer_1, "g0") && TextUtils.equals(anwser_2, "")) {
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                } else {
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.g2:
                if (TextUtils.equals(answer_1, "g1") && TextUtils.equals(anwser_2, "g11")) {
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                } else {
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.g3:
                if (TextUtils.equals(answer_1, "g2") && TextUtils.equals(anwser_2, "")) {
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                } else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");
                }
                break;
            case R.id.g4:
                if (TextUtils.equals(answer_1,"g3") && TextUtils.equals(anwser_2,"g33")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.g5:
                if (TextUtils.equals(answer_1,"g4") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");
                }
                break;
            case R.id.g6:
                if (TextUtils.equals(answer_1,"g5") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.g7:
                if (TextUtils.equals(answer_1,"g6") && TextUtils.equals(anwser_2,"g66")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.g8:
                if (TextUtils.equals(answer_1,"g7") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d1:
                if (TextUtils.equals(answer_1,"d0") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d2:
                if (TextUtils.equals(answer_1,"d1") && TextUtils.equals(anwser_2,"d11")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d3:
                if (TextUtils.equals(answer_1,"d2") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d4:
                if (TextUtils.equals(answer_1,"d3") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d5:
                if (TextUtils.equals(answer_1,"d4") && TextUtils.equals(anwser_2,"d44")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                   // Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d6:
                if (TextUtils.equals(answer_1,"d5") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d7:
                if (TextUtils.equals(answer_1,"d6") && TextUtils.equals(anwser_2,"d66")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.d8:
                if (TextUtils.equals(answer_1,"d7") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                   // Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a1:
                if (TextUtils.equals(answer_1,"a0") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a2:
                if (TextUtils.equals(answer_1,"a1") && TextUtils.equals(anwser_2,"a11")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a3:
                if (TextUtils.equals(answer_1,"a2") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a4:
                if (TextUtils.equals(answer_1,"a3") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a5:
                if (TextUtils.equals(answer_1,"a4") && TextUtils.equals(anwser_2,"a44")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a6:
                if (TextUtils.equals(answer_1,"a5") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a7:
                if (TextUtils.equals(answer_1,"a6") && TextUtils.equals(anwser_2,"a66")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.a8:
                if (TextUtils.equals(answer_1,"a7") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e1:
                if (TextUtils.equals(answer_1,"e0") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e2:
                if (TextUtils.equals(answer_1,"e1") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e3:
                if (TextUtils.equals(answer_1,"e2") && TextUtils.equals(anwser_2,"e22")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e4:
                if (TextUtils.equals(answer_1,"e3") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e5:
                if (TextUtils.equals(answer_1,"e4") && TextUtils.equals(anwser_2,"e44")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e6:
                if (TextUtils.equals(answer_1,"e5") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e7:
                if (TextUtils.equals(answer_1,"e6") && TextUtils.equals(anwser_2,"e66")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;
            case R.id.e8:
                if (TextUtils.equals(answer_1,"e7") && TextUtils.equals(anwser_2,"")){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"100.mp3");
                    corect_counter++;
                    tv_correct_counter.setText("Correct: "+corect_counter);
                    RandomQuestion();
                }else {
                    wrong_counter++;
                    tv_wrong_counter.setText("Wrong: "+wrong_counter);
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    common.SoundPlayer(MoodOneActivity.this,"101.mp3");

                }
                break;

        }
    }
}
