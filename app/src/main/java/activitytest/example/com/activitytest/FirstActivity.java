package activitytest.example.com.activitytest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
//                    Toast.makeText(FirstActivity.this, "You have clicked Button 1",
//                           Toast.LENGTH_SHORT).show();

//                    finish();  //销毁Activity

                    //显示Intent
//                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                    //隐式Intent
//                    Intent intent = new Intent("activitytest.example.com.activitytest.ACTION_START");
//                    intent.addCategory("activitytest.example.com.activitytest.MY_CATEGORY");

//                    //隐式Intent的应用：调用其他Android应用----如展示一个网页，调用系统的浏览器来打开网页
//                    Intent intent = new Intent(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse("http://www.baidu.com"));

                      //隐式Intent的应用: 拨打电话
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:10086"));


                    startActivity(intent);
                }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;  //返回true表示创建的菜单显示出来，false表示创建的菜单将无法显示
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "You have clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You have clicked Removed", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
