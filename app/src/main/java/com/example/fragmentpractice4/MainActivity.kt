package com.example.fragmentpractice4

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentpractice4.adapters.FragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*

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