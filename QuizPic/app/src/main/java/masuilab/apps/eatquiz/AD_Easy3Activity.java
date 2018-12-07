package masuilab.apps.eatquiz;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AD_Easy3Activity extends AppCompatActivity {

    private SoundPool soundPool;
    private int good_se; // 正解の効果音の識別ID
    private int bad_se; // 不正解の効果音の識別ID
    private int rightAnswerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__easy3);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            // Android 5.0(Lolipop)より古いとき
            soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        } else {
            // Android 5.0(Lolipop)以降
            AudioAttributes attr = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(attr)
                    .setMaxStreams(2)
                    .build();
        }
        good_se = soundPool.load(this, R.raw.correct, 1); // 正解の効果音の識別IDを保存
        bad_se = soundPool.load(this, R.raw.wrong, 1); // 不正解の効果音の識別IDを保存
    }

    public void onButton6(View v){
        Intent intent = new Intent(AD_Easy3Activity.this, AD_Easy3ResultActivity.class);
        // counter = 0;
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        intent.putExtra("result", false);
        soundPool.play(bad_se, 1F, 1F, 0, 0, 1F);
        startActivity(intent);
        finish();
    }

    public void onButton7(View v){
        Intent intent = new Intent(AD_Easy3Activity.this, AD_Easy3ResultActivity.class);
        // counter = 0;
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        intent.putExtra("result", false);
        soundPool.play(bad_se, 1F, 1F, 0, 0, 1F);
        startActivity(intent);
        finish();
    }

    public void onButton8(View v){
        Intent intent = new Intent(AD_Easy3Activity.this, AD_Easy3ResultActivity.class);
        // counter = 0;
        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);
        score++;
        rightAnswerCount = score;
        intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
        intent.putExtra("result", false);
        soundPool.play(good_se, 1F, 1F, 0, 0, 1F);
        startActivity(intent);
        finish();
    }
}
