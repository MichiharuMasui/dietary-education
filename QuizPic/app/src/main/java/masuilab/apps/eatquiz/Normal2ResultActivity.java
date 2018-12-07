package masuilab.apps.eatquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Normal2ResultActivity extends AppCompatActivity {
    private int rightAnswerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal2_result);
    }

    public void onNext(View v){
        Intent intent = new Intent(Normal2ResultActivity.this,Normal3Activity.class);
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        startActivity(intent);
    }
}
