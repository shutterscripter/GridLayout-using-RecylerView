
# Grid Layout with Recycler View in android using kotlin

Display elements in Grid fashion 




# Preview
![App Screenshot](resource/resource01.png)
![App Screenshot](resource/resource02.png)


# Dependencies

Recycler View Dependencies

    implementation 'androidx.recyclerview:recyclerview:1.2.1'


# XML uses

    <androidx.recyclerview.widget.RecyclerView
    android:id="@+id/rvMain"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />


# Activity uses

1. Initiate grid view Todo: can change number of rows(spanCount) accordingly

        layoutManager = GridLayoutManager(this, 2)

2. setting up RecyclerView to adapter

        recyclerAdapter = RecyclerViewAdapter(this, modelInfoList)
        rvMain.adapter = recyclerAdapter
        rvMain.layoutManager = layoutManager
# Reference

 - [Pasindu laksara](https://pasindulaksara.medium.com/recyclerview-with-grid-layout-in-kotlin-414d780c47ae)

# Author

- [@Jayesh Shinde](https://github.com/jayesh2272001)
