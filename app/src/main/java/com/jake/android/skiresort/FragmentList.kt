package com.jake.android.skiresort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jake.android.skiresort.databinding.FragmentListBinding

class FragmentList : Fragment() {
    lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(inflater, container, false)

//        val item = arrayOf("1", "2", "3")
//        binding.skiList.adapter = activity?.let { ArrayAdapter<String>(it,
//            android.R.layout.simple_list_item_1, item) }
        var UserList = arrayListOf<User>(
            User(R.drawable.ski, "홍드로이드","28","안녕하세요"),
            User(R.drawable.ski, "배우자","22","hi"),
            User(R.drawable.ski, "코틀린","21","hello"),
            User(R.drawable.ski, "자바","23","니하오"),
            User(R.drawable.ski, "스위프트","25","곤니찌와")
        )
        val Adapter = UserAdapter(this, UserList)
        binding.skiList.adapter = Adapter


        return binding.root
    }
}

