package masuilab.apps.drquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Play3ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3_result);
    }

    public void onNext(View v) {
        Intent intent = new Intent(Play3ResultActivity.this, Play4Activity.class);
        // TextView resultLabel = findViewById(R.id.resultLabel);
        // int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        // rightAnswerCount = score;
        // intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        // resultLabel.setText("３問中" + score + "問正解だよ！");
        startActivity(intent);
    }
}
