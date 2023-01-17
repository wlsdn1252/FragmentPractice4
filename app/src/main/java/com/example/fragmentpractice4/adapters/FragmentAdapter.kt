package com.example.fragmentpractice4.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentpractice4.fragments.FirstFragment
import com.example.fragmentpractice4.fragments.SecondFragment

class FragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "프래그먼트 1"
            else -> "프래그먼트 2"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }
}