package it.oztaking.com.a62_multimedia_callthirdcamer;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button bt_takePic = (Button) findViewById(R.id.bt_takePic);
//        Button bt_takeVideo = (Button) findViewById(R.id.bt_takeVideo);




    }

    public void TakePic(View v){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file = new File(Environment.getExternalStorageDirectory().getPath(), "lili.png");
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(intent,1);

    }

    public void TakeVideo(View v){
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        File file = new File(Environment.getExternalStorageDirectory().getPath(), "lili.3gp");
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(intent,2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        System.out.println("摄像机被调用了");
        super.onActivityResult(requestCode, resultCode, data);
    }
}
