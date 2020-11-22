package com.cooking.tablayoutkotlin.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.cooking.tablayoutkotlin.R
import com.cooking.tablayoutkotlin.data.Datasource
import com.cooking.tablayoutkotlin.adapter.ItemAdapter

class HomeFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)


    // Initialize data.
    val myDataset = Datasource().loadAffirmations()
    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.adapter = ItemAdapter(this, myDataset)

    // Use this setting to improve performance if you know that changes
    // in content do not change the layout size of the RecyclerView
    recyclerView.setHasFixedSize(true)
}