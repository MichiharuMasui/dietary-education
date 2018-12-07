package masuilab.apps.eatquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Easy1ResultActivity extends AppCompatActivity {

    private int rightAnswerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy1_result);

        /*Intent intent = getIntent();
        boolean result = intent.getBooleanExtra("result" ,false);

        // 結果に合わせて表示切り替え ////////
        if(! result)
            ((ImageView)findViewById(R.id.ivResult)).setImageResource(R.drawable.batsu);*/
    }

    public void onNext(View v){
        Intent intent = new Intent(Easy1ResultActivity.this,Easy2Activity.class);
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        startActivity(intent);
    }
}
