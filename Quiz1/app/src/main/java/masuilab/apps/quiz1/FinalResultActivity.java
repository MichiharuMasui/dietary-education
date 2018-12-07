package masuilab.apps.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        TextView resultLabel = findViewById(R.id.resultLabel);
        resultLabel.setText(score + "問正解でした！");

    }

    public void onNext(View v){
        Intent intent = new Intent(FinalResultActivity.this,endActivity.class);
        startActivity(intent);
    }
}
