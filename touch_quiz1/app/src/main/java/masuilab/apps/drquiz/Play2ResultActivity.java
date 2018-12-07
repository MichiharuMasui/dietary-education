package masuilab.apps.drquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Play2ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2_result);
    }

    public void onNext(View v) {
        Intent intent = new Intent(Play2ResultActivity.this, Play3Activity.class);
        // TextView resultLabel = findViewById(R.id.resultLabel);
        // int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        // rightAnswerCount = score;
        // intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        // resultLabel.setText("３問中" + score + "問正解だよ！");
        startActivity(intent);
    }
}
