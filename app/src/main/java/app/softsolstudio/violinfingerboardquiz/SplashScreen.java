package app.softsolstudio.violinfingerboardquiz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    TextView top_tv,bottom_tv;
    ImageView center_line;
    Animation frombottom,fromtop;
    private Intent myintent;
    private Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        initialization();
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);
    }
    private void initialization() {
        top_tv=findViewById(R.id.top_tv);
        bottom_tv=findViewById(R.id.bottom_tv);
        center_line=findViewById(R.id.splash_line);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.abc_slide_in_bottom);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.abc_slide_in_top);
        bottom_tv.setAnimation(frombottom);
        top_tv.setAnimation(fromtop);
    }

    @Override
    public void onBackPressed() {
        handler.removeCallbacks((Runnable) handler);
        super.onBackPressed();
    }
}
