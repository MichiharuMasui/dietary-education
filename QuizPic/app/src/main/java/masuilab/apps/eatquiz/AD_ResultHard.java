package masuilab.apps.eatquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AD_ResultHard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__result_hard);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        if(score == 0){
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText("残念！" + score + "問正解だよ！　次は頑張ってね！");
        } else if (score == 1) {
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText("３問中" + score + "問正解だよ！");
        } else if (score == 2){
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText("３問中" + score + "問正解だよ！　あと一歩！");
        } else if (score == 3){
            TextView resultLabel = findViewById(R.id.resultLabel);
            resultLabel.setText("３問中" + score + "問正解だよ！　すごいすごい！！");
        }
    }

    public void onNext(View v) {
        Intent intent = new Intent(AD_ResultHard.this, MainActivity.class);
        startActivity(intent);
    }
}
