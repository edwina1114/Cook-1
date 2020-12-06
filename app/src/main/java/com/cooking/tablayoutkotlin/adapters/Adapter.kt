package com.cooking.tablayoutkotlin.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cooking.tablayoutkotlin.fragments.*


class Adapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager)  {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> Ricef()
            1 -> Noodlesf()
            2 -> Soupf()
            3 -> Meatf()
            4 -> Vegetablef()
            5 -> Fruitf()
            6 -> Dessertf()
            else -> Breakfastf()
        }
    }

    override fun getCount(): Int {
        return 8
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0 -> "Rice"
            1 -> "Noodles"
            2 -> "Soup"
            3 -> "Meat"
            4 -> "Vegetable"
            5 -> "Fruit"
            6 -> "Dessert"
            else -> "Breakfast"
        }
    }
}