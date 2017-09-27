package bawie.xiangmu2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String path="https://www.baidu八维考试.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //截取字符串
        StringBuffer sb=new StringBuffer(path);
        final StringBuffer buffer = sb.delete(17, 21);
        //找控件并设置内容和点击事件
        TextView title= (TextView) findViewById(R.id.title);
        title.setText(buffer.toString());
        //设置点击baidu的点击事件，点击以后进入加载页面
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //找控件并加载网页
                WebView wb= (WebView) findViewById(R.id.wb);
                wb.getSettings().setJavaScriptEnabled(true);
                wb.loadUrl(buffer.toString());
            }
        });

    }
}
