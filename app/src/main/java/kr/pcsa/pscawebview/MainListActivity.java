package kr.pcsa.pscawebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kr.pcsa.pscawebview.study.Study1Activity;
import kr.pcsa.pscawebview.study.Study2Activity;
import kr.pcsa.pscawebview.study.Study3Activity;

public class MainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        Button mButtonList2 = (Button) findViewById(R.id.button2);
        Button mButtonStudy1 = (Button) findViewById(R.id.study1);
        Button mButtonStudy2 = (Button) findViewById(R.id.study2);
        Button mButtonStudy3 = (Button) findViewById(R.id.study3);



        mButtonList2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainListActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        mButtonStudy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainListActivity.this,Study1Activity.class);
                startActivity(intent);
            }
        });

        mButtonStudy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainListActivity.this,Study2Activity.class);
                startActivity(intent);
            }
        });

        mButtonStudy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainListActivity.this,Study3Activity.class);
                startActivity(intent);
            }
        });

//        Intent intent = new Intent();
//        ComponentName name = new ComponentName("org.androidtown.myIntent","org.androidtown.myIntent.MenuActivity");
//        intent.setComponent(name);
//        startActivityForResult(intent,1001);

    }

}
