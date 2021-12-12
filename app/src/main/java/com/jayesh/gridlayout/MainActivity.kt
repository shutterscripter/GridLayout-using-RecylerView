package com.jayesh.gridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jayesh.gridlayout.adapter.RecyclerViewAdapter
import com.jayesh.gridlayout.models.RecyclerModel

class MainActivity : AppCompatActivity() {

    lateinit var rvMain: RecyclerView
    lateinit var layoutManager: GridLayoutManager
    lateinit var recyclerAdapter: RecyclerViewAdapter

    private var modelInfoList = arrayListOf<RecyclerModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //storing data in arraylist
        addData()

        rvMain = findViewById(R.id.rvMain)

        //initiate grid view Todo: can change number of rows(spanCount) accordingly
        layoutManager = GridLayoutManager(this, 2)

        recyclerAdapter = RecyclerViewAdapter(this, modelInfoList)
        rvMain.adapter = recyclerAdapter
        rvMain.layoutManager = layoutManager

    }

    fun addData() {
        modelInfoList.add(RecyclerModel(R.drawable.c, "C Programming", "₹8000"))
        modelInfoList.add(RecyclerModel(R.drawable.cpp, "CPP Programming", "₹10000"))
        modelInfoList.add(RecyclerModel(R.drawable.java, "Java Masterclass", "₹9000"))
        modelInfoList.add(RecyclerModel(R.drawable.python, "Python Programming", "₹11000"))
        modelInfoList.add(RecyclerModel(R.drawable.dart, "Dart", "₹6000"))
        modelInfoList.add(RecyclerModel(R.drawable.django, "django", "₹9500"))
        modelInfoList.add(RecyclerModel(R.drawable.php, "PHP Basics", "₹5000"))
        modelInfoList.add(RecyclerModel(R.drawable.ruby, "RUBY Masterclass", "₹15000"))

    }
}