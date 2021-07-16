package com.example.multiplicationtable

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(val pagesList:ArrayList<Pages>, val fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int =  pagesList.size


    override fun getItem(position: Int): Fragment {
       return PageFragment.newInstance(pagesList[position].image)
    }

}