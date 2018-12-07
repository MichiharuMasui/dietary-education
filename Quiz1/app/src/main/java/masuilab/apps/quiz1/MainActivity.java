package masuilab.apps.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //////////////////////////////////////////////
    // プレイ画面表示
    public void onStart(View v) {
        Intent intent = new Intent(this,PlayActivity.class);
        startActivity(intent);
    }
}
