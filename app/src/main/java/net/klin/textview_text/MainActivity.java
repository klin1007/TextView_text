package net.klin.textview_text;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tv2;
    private TextView tv3;
    private Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        bt1 = (Button)  findViewById(R.id.button);
        bt2 = (Button)  findViewById(R.id.button4);

        tv2.setText("顯示內容");
        tv2.setTextColor(0xFFFF0000);
        tv2.setTextSize(20.0f);
//        tv2.setPadding(10,10,10,10);   //設定位置

        //設定超連結
        tv3.setText("https://www.google.com.tw");
        tv3.setAutoLinkMask(Linkify.WEB_URLS);
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
//        tv3.setPadding(10,120,120,120);    //設定位置

//        bt1.setPadding(110,210,210,210);     //設定位置

        bt1.setText("請按我");
        bt2.setText("跳至第二頁");


        //按下按鈕後動作
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tv2.setText("按下按鈕");
            }
        });

//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startNextPage();
//            }
//        });
    }

//    private void startNextPage() {
//        //初始化Intent物件
//        Intent intent = new Intent();
//        //傳送資料至第二頁
///*        intent.putExtra("Name","Tom");
//        intent.putExtra("Year",12);*/
//        Bundle bundle = new Bundle();
//        bundle.putString("Name", "Tom");
//        bundle.putInt("Year", 12);
//        intent.putExtra("Bundle", bundle);
//        //從MainActivity 到Main2Activity
//        intent.setClass(MainActivity.this, );
//        //開啟Activity
//        startActivity(intent);
    }

}
