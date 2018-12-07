package masuilab.apps.quiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class end2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end2);
    }

    public void onNext_photo(View v){
        Intent intent = new Intent(end2Activity.this,end3Activity.class);
        startActivity(intent);
    }
}
