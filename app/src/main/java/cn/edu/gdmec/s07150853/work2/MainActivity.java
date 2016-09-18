package cn.edu.gdmec.s07150853.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work2","我启动了");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","我被阻塞了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","我停止了");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work2","我被销毁了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("work2","我又出现了");


    }
}
