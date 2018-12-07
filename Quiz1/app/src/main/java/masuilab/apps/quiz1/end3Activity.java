package masuilab.apps.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class end3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end3);
    }

    public void onReStart(View v){
        Intent intent = new Intent(end3Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
