package masuilab.apps.drquiz;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Play2Activity extends AppCompatActivity implements View.OnTouchListener {

    private CustomImageView cImageView_kabo, cImageView_kya, cImageView_kyu,cImageView_koma,cImageView_ingen;
    //private View cImageView_hou, cImageView_nin, cImageView_haku;
    private int preDx, preDy;
    private TextView textView;
    private int[][] location = new int[5][2];
    private SoundPool soundPool;
    private int good_se; // 正解の効果音の識別ID
    private int bad_se; // 不正解の効果音の識別ID

    int currentX;   //Viewの左辺座標：X軸
    int currentY;   //Viewの上辺座標：Y軸
    int offsetX;    //画面タッチ位置の座標：X軸
    int offsetY;    //画面タッチ位置の座標：Y軸

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
        // Android 5.0(Lolipop)より古いかどうかでSoundPoolの使い方は変わってくる
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
        textView = findViewById(R.id.text_view);

        cImageView_kabo = findViewById(R.id.image_view_kabo);
        cImageView_kya = findViewById(R.id.image_view_kya);
        cImageView_kyu = findViewById(R.id.image_view_kyu);
        cImageView_koma = findViewById(R.id.image_view_koma);
        cImageView_ingen = findViewById(R.id.image_view_ingen);

        //リスナーの設定
        cImageView_kabo.setOnTouchListener(this); // 画像0
        cImageView_kya.setOnTouchListener(this); // 画像1
        cImageView_kyu.setOnTouchListener(this); // 画像2
        cImageView_koma.setOnTouchListener(this); // 画像3
        cImageView_ingen.setOnTouchListener(this); // 画像3
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        // x,y 位置取得
        int newDx = (int)event.getRawX();
        int newDy = (int)event.getRawY();


        switch (event.getAction()) {
            // タッチダウンでdragされた
            case MotionEvent.ACTION_MOVE:
                // ACTION_MOVEでの位置
                // performCheckを入れろと警告が出るので
                v.performClick();

                int dx = v.getLeft() + (newDx - preDx);
                int dy = v.getTop() + (newDy - preDy);
                int imgW = dx + v.getWidth();
                int imgH = dy + v.getHeight();

                // 画像の位置を設定する
                v.layout(dx, dy, imgW, imgH);
                /* String str = "dx="+dx+"\ndy="+dy;
                textView.setText(str);
                Log.d("onTouch","ACTION_MOVE: dx="+dx+", dy="+dy);
                */
                if(v == cImageView_kabo){
                    location[0][0] = dx;
                    location[0][1] = dy;
                    String str = "dx="+location[0][0]+"\ndy="+location[0][1];
                    //textView.setText(str);
                    //Log.d("onTouch","ACTION_MOVE: dx="+location[0][0]+", dy="+location[0][1]);
                }
                if(v == cImageView_kya){
                    location[1][0] = dx;
                    location[1][1] = dy;
                    String str = "dx="+location[1][0]+"\ndy="+location[1][1];
                    //textView.setText(str);
                    //Log.d("onTouch","ACTION_MOVE: dx="+location[1][0]+", dy="+location[1][1]);
                }
                if(v == cImageView_kyu){
                    location[2][0] = dx;
                    location[2][1] = dy;
                    String str = "dx="+location[2][0]+"\ndy="+location[2][1];
                    //textView.setText(str);
                    //Log.d("onTouch","ACTION_MOVE: dx="+location[2][0]+", dy="+location[2][1]);
                }
                if(v == cImageView_koma){
                    location[3][0] = dx;
                    location[3][1] = dy;
                    String str = "dx="+location[3][0]+"\ndy="+location[3][1];
                    //textView.setText(str);
                    //Log.d("onTouch","ACTION_MOVE: dx="+location[3][0]+", dy="+location[3][1]);
                }
                if(v == cImageView_ingen){
                    location[4][0] = dx;
                    location[4][1] = dy;
                    String str = "dx="+location[4][0]+"\ndy="+location[4][1];
                    //textView.setText(str);
                    //Log.d("onTouch","ACTION_MOVE: dx="+location[3][0]+", dy="+location[3][1]);
                }
                break;
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }

        // タッチした位置を古い位置とする
        preDx = newDx;
        preDy = newDy;

        return true;
    }

    // 正解判定メソッド
    public void onButton(View v) {
        Intent intent = new Intent(Play2Activity.this, Play2ResultActivity.class);
        // counter = 0;
        if ((680 < location[0][1] && location[0][1] < 970)&& (1200 < location[1][1] && location[1][1] < 1470)
                && (1200 < location[2][1] && location[2][1] < 1470) && (680 < location[3][1] && location[3][1] < 970)
                && (680 < location[4][1] && location[4][1] < 970)){
            intent.putExtra("result", true);
            soundPool.play(good_se, 1F, 1F, 0, 0, 1F);
            startActivity(intent);
            finish();
        } else {
            intent.putExtra("result", false);
            soundPool.play(bad_se, 1F, 1F, 0, 0, 1F);
            startActivity(intent);
            finish();
        }
    }

}
