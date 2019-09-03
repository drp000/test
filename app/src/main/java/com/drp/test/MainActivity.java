package com.drp.test;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Context mContext;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
//        tv = findViewById(R.id.tv);
//        tv.setText("测试文字");
        /*String htmlFor02 = "<p align='center'>项目图片测试： " + "<img src='" + R.mipmap.ic_launcher + "'> </p>";
        tv.setText(Html.fromHtml(htmlFor02, new Html.ImageGetter() {
            @Override
            public Drawable getDrawable(String source) {
                Log.d(TAG, "项目图片测试_source:" + source);
                int id = Integer.parseInt(source);
                Drawable drawable = getResources().getDrawable(id, null);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(),
                        drawable.getIntrinsicHeight());
                return drawable;
            }
        }, null));*/

//        String s = "2";
//        boolean empty = TextUtils.isEmpty(s);
//        System.out.println("---" + empty);
    }

    public static void main(String[] args) {
        String s = "2";
        boolean empty = TextUtils.isEmpty(s);
        System.out.println("---" + empty);
    }
}
