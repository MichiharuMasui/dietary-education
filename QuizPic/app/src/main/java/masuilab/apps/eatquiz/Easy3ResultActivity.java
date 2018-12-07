package masuilab.apps.eatquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Easy3ResultActivity extends AppCompatActivity {
    private int rightAnswerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy3_result);
    }

    public void onNext(View v) {
        Intent intent = new Intent(Easy3ResultActivity.this, ResultEasy.class);
        // TextView resultLabel = findViewById(R.id.resultLabel);
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        // resultLabel.setText("３問中" + score + "問正解だよ！");
        startActivity(intent);
    }
}
