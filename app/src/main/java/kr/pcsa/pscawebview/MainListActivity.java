package kr.pcsa.pscawebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);


        Button mButtonList = (Button) findViewById(R.id.button2);

        mButtonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"리스트 창입니다요",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainListActivity.this,MainActivity.class);

                startActivity(intent);

            }
        });

    }


}
