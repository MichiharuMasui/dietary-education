package masuilab.apps.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class endActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    public void onNext_photo(View v){
        Intent intent = new Intent(endActivity.this,end2Activity.class);
        startActivity(intent);
    }
}
