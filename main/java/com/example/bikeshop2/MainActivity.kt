package com.example.bikeshop2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.bikeshop2.adapters.ViewPagerAdapter
import com.example.bikeshop2.fragments.MyShopFragment
import com.example.bikeshop2.fragments.SupplierFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private var viewPager : ViewPager? = null
    private var tabs : TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabs = findViewById(R.id.tabs)
        setUpTabs()

    }



    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MyShopFragment(), "My shop")
        adapter.addFragment(SupplierFragment(), "Supplier")
        viewPager?.adapter = adapter
        tabs?.setupWithViewPager(viewPager)

        tabs?.getTabAt(0)!!.setIcon(R.drawable.my_shop_tab_selector)
        tabs?.getTabAt(1)!!.setIcon(R.drawable.supplier_tab_selector)
    }
}