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
            User(R.drawable.ski, "베어스타운","경기","2022-2023"),
            User(R.drawable.ski, "알펜시아리조트","강원","2022-2023"),
            User(R.drawable.ski, "하이원리조트","강원","2022-2023"),
            User(R.drawable.ski, "용평 리조트","경기","2022-2023"),
            User(R.drawable.ski, "엘리시안 강촌","경기","2022-2023")
        )

        val Adapter = UserAdapter(this, UserList)
        with(binding) {
            skiList.adapter = Adapter

            //skiList.onItemClickListener = AdapterView.OnItemClickListener {view,}
        }


        return binding.root
    }
}

