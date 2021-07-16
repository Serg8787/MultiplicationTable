package com.example.multiplicationtable

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagesList = ArrayList<Pages>()

        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t1)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t2)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t3)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t4)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t5)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t6)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t7)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t8)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t9)))
        pagesList.add(Pages(BitmapFactory.decodeResource(resources, R.drawable.t10)))



       viewPager.adapter = PageAdapter(pagesList,supportFragmentManager)





    }
}