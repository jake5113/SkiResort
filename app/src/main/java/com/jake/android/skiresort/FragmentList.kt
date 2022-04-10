package com.jake.android.skiresort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.jake.android.skiresort.databinding.FragmentListBinding

class FragmentList : Fragment() {
    lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(inflater, container, false)

        val item = arrayOf("1", "2", "3")
        binding.skiList.adapter = activity?.let { ArrayAdapter<String>(it,
            android.R.layout.simple_list_item_1, item) }

        return binding.root
    }
}

