package com.luoteng.richtextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.luoteng.richtextview.utils.ImageTextUtil;

public class MainActivity extends Activity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        String html ="<p dir=\"ltr\"><img src=\"http://p1.duyao001.com/image/article/a838e283f2b5d7cc45487c5fd79f84cb.gif\"><img src=\"http://statics.zhid58.com/Fqr9YXHd20fDOqil4nLAbBhNBw0A\"><br><br><img src=\"http://statics.zhid58.com/FufBg05KGCLypIvrYgjaXnTWySUS\"><br><br>OK咯木木木立刻哦lol额JOJO图谋女女look女女诺克各地测了测理论啃了了乐克乐克人咯咯JOJO图谋木木木木木木女女哦咯口头摸头LED可口女女LED咳咳JOJO咯JOJO咳咳咯科技JOJO扣女哦lol欧诺扣女<a href=\"http://www.taobao.com\">http://www.taobao.com</a> jvjvjvjv jgjvvjjvjce<br><br><img src=\"http://statics.zhid58.com/FkBcKMiLfzGfUpSb0bge4x-gIqWw\"><br></p><br>";
        ImageTextUtil.setImageText(tv,html);
    }
}
