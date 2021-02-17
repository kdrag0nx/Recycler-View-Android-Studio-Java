# Recycler-View-Android-Studio-Java


**What is RecyclerView?**
***The RecyclerView is a widget that is more flexible and advanced version of GridView and ListView. It is a container for displaying large datasets which can be scrolled efficiently by maintaining limited number of views. You can use RecyclerView widget when you have data collections whose elements change at runtime depend on network event or user action.***

[Watch Full Tutorials Here]( https://youtu.be/90WPyV9-vaY "Recycler View")

|Language Used | Java |
|---|---|

|Total Xml Files| 2 |
|---|---|

|Total Activity | 1 |
|---|---|

|Total Java Class | 1 |
|---|---|

---
Make sure to add ***Dependencies*** to your project in `Gradle Scripts` -> `build.gradle` -> `Module:App-name.app`

>implementation "androidx.recyclerview:recyclerview:1.1.0"

>implementation "androidx.recyclerview:recyclerview-selection:1.1.0"

***Main Activity Code***
```
package com.aips.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        customAdapter customAdapter = new customAdapter(this, getArrayList());

    }

    private ArrayList<String> getArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String s = "pdf....";
        arrayList.add(s);arrayList.add(s);arrayList.add(s);arrayList.add(s);
        return arrayList;
    }
}
```
