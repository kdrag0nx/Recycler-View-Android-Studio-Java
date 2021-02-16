# Recycler-View-Android-Studio-Java

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

Raw Sample:
![](https://github.com/amitkv1212/Recycler-View-Android-Studio-Java/blob/main/ezgif.com-gif-maker.gif "Sample Image")

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
