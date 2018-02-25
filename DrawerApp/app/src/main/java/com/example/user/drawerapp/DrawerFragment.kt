package com.example.user.drawerapp


import android.app.Activity
import android.os.Bundle
import android.app.Fragment
import android.content.Context
import android.support.design.widget.NavigationView
import android.support.v7.app.ActionBarDrawerToggle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_drawer.view.*


class DrawerFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.item1)
            i?.show(1)

        return false
    }


    var i: DrInterface? = null


    public override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                                     savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var v = inflater!!.inflate(R.layout.fragment_drawer, container, false)
        v.nv.setNavigationItemSelectedListener(this)
        return v
    }


    interface DrInterface {
        fun show(x: Int)
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        i = activity as DrInterface
    }

}// Required empty public constructor
