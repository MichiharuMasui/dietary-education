package masuilab.apps.eatquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultHard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_hard);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        if(score == 0){
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText("ざんねん！" + score + "問せいかいだよ！　つぎはがんばろうね！");
        } else if (score == 1) {
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText(score + "問せいかいだよ！");
        } else if (score == 2){
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText(score + "問せいかいだよ！　あと少しでぜんぶせいかいだね！");
        } else if (score == 3){
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText(score + "問せいかいだよ！　すごいすごい！！");
        }
    }

    public void onNext(View v) {
        Intent intent = new Intent(ResultHard.this, MainActivity.class);
        startActivity(intent);
    }
}
