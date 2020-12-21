package com.cooking.tablayoutkotlin.food_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooking.tablayoutkotlin.R
import com.cooking.tablayoutkotlin.adapters.FooditemsAdapter
import com.cooking.tablayoutkotlin.model.Fooditems

class Breakfastf : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var arrayList:ArrayList<Fooditems> ? = null
    private var foodiesAdapters: FooditemsAdapter? = null

    // initialize adapter in onCreate, it's unaffected by views state
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // initialize recyclerView and layout manager
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.my_recycler_view)

        // design the gridlayout count/row
        gridLayoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        arrayList = ArrayList()
        arrayList = setDataInList()

        foodiesAdapters = FooditemsAdapter(requireContext(), arrayList!!)
        recyclerView?.adapter = foodiesAdapters

    }

    //顯示breakfast_layout的介面
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.breakfast_layout, container, false)
    }


    private fun setDataInList(): ArrayList<Fooditems>? {
        var items : ArrayList<Fooditems> = ArrayList()
        items.add(Fooditems(R.drawable.breakfast1 , alphaChar = "燕麥優格杯"))
        items.add(Fooditems(R.drawable.breakfast2 , alphaChar = "草莓蛋吐司"))
        items.add(Fooditems(R.drawable.breakfast3 , alphaChar = "煎蛋吐司"))
        items.add(Fooditems(R.drawable.breakfast4 , alphaChar = "起司煎蛋"))
        items.add(Fooditems(R.drawable.breakfast5 , alphaChar = "起士菇菇炒蛋盒子"))

        return items
    }

}
