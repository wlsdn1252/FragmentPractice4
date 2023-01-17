package com.example.fragmentpractice4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentpractice4.adapters.FragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = FragmentAdapter(supportFragmentManager)

        mainViewPager.adapter = mAdapter    // 여기까지가 뷰페이저랑 프래그먼트 연결

        // 뷰페이저랑 탭레이아웃 연결
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}