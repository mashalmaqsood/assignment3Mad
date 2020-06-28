package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    private static final String TAG ="ThirdActivity";
    private ArrayList<String> mNames= new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initImageBitmaps();
    }
    private void  initImageBitmaps() {
        mImageUrls.add("https://i.pinimg.com/236x/5e/df/9c/5edf9cf31c6efb704f34c1f44adb45c6.jpg");
        mNames.add("contact 1");
        mImageUrls.add("https://ih1.redbubble.net/image.792665296.4730/st,small,507x507-pad,600x600,f8f8f8.u2.jpg");
        mNames.add("contact 2");
        mImageUrls.add("https://www.clipartkey.com/mpngs/m/201-2017389_bitmoji-transparent-background-bitmojis-de-snapchat.png");
        mNames.add("contact 3");
        mImageUrls.add("https://i.pinimg.com/236x/58/d6/a5/58d6a5b33dff33ad63399183f514bfd9.jpg");
        mNames.add("contact 4");
        mImageUrls.add("https://i.pinimg.com/236x/e3/0b/ca/e30bcaff86a4258a1b799ca60c8c49a4.jpg");
        mNames.add("contact 5");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQYxAfUppMTZ4j5MERnpOjHEPuCKFkjGi3BUw&usqp=CAU");
        mNames.add("contact 6");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQXIBo5v-wziWs6vAJoyV59n_Ggi_jBTHRQiw&usqp=CAU");
        mNames.add("contact 7");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQTPQRPOgXUjvLMFmL60S_9y6xJwhZ6tvJGeQ&usqp=CAU");
        mNames.add("contact 8");
        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTI2OFEYLQWAt_7319HUUgVEYw6nnEmqBelmg&usqp=CAU");
        mNames.add("contact 9");
        initRecyclerView();
    }
    private void initRecyclerView()
    {
        RecyclerView recyclerView= findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
