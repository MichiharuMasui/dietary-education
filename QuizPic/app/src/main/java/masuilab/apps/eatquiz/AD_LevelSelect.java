package masuilab.apps.eatquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AD_LevelSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__level_select);
    }

    public void onEasy(View v) {
        Intent intent = new Intent(this,AD_Easy1Activity.class);
        startActivity(intent);
    }

    public void onNormal(View v) {
        Intent intent = new Intent(this,AD_Normal1Activity.class);
        startActivity(intent);
    }

    public void onHard(View v) {
        Intent intent = new Intent(this,AD_Hard1Activity.class);
        startActivity(intent);
    }

}
