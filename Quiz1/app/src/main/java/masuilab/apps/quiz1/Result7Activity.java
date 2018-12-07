package masuilab.apps.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Result7Activity extends AppCompatActivity {

    private int rightAnswerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result7);
        Intent intent = getIntent();
        boolean result = intent.getBooleanExtra("result" ,false);

        // 結果に合わせて表示切り替え ////////
        if(! result)
            ((ImageView)findViewById(R.id.ivResult)).setImageResource(R.drawable.batsu);
    }

    public void onNext(View v){
        Intent intent = new Intent(Result7Activity.this,FinalResultActivity.class);
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        startActivity(intent);
    }
}
