package kr.pcsa.pscawebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import kr.pcsa.pscawebview.study.MyService;

public class Study3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study3);

        Button mBtn3Show1 = (Button) findViewById(R.id.btn3Show1);
        Button mBtnStudy3Service = (Button) findViewById(R.id.btnStudy3Service);

        mBtn3Show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Study33Activity.class);
                intent.putExtra("title","소녀시대");
                startActivityForResult(intent,1001);
            }
        });

        mBtnStudy3Service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyService.class);
                startService(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(data != null) {
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(),"전달받은값은: "+name,Toast.LENGTH_LONG).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
