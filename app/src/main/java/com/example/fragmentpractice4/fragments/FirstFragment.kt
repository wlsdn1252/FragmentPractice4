package com.example.fragmentpractice4.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentpractice4.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mainBtn.setOnClickListener {
            Toast.makeText(requireContext(), "메세지가 변경되었습니다.", Toast.LENGTH_SHORT).show()
            reTxt.text = "텍스트가 변경 되었습니다."
        }
    }

}