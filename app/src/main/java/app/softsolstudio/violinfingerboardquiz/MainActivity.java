package app.softsolstudio.violinfingerboardquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    private void initialization() {
        btn1=findViewById(R.id.btn_mood1);
        btn2=findViewById(R.id.btn_mood2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle("Violin fingerboard quiz");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //menu item selected
        switch (item.getItemId()) {
            case R.id.share_app:
                ShareApp();
                break;
            case R.id.learn:
                startActivity(new Intent(MainActivity.this,LearnActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void ShareApp() {
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Violin Fingerboard Quiz");
            String shareMessage = "\nImprove your violin skills, I recommend you to install this application, Very Usefull for you.\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "choose one"));
        } catch (Exception e) {
            //e.toString();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_mood1:
                startActivity(new Intent(MainActivity.this,MoodOneActivity.class));
                break;
            case R.id.btn_mood2:
                startActivity(new Intent(MainActivity.this,ModeTwo.class));
                break;
        }
    }
}
