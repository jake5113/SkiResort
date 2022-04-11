package com.jake.android.skiresort

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
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
            User(R.drawable.ski, "홍드로이드","강원","2022-2023"),
            User(R.drawable.ski, "배우자","강원","2022-2023"),
            User(R.drawable.ski, "코틀린","강원","2022-2023"),
            User(R.drawable.ski, "자바","경기","2022-2023"),
            User(R.drawable.ski, "스위프트","경기","2022-2023")
        )
        val Adapter = UserAdapter(this, UserList)
        with(binding) {
            skiList.adapter = Adapter
            //skiList.onItemClickListener = AdapterView.OnItemClickListener {view,}
        }


        return binding.root
    }
}

