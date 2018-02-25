package com.example.user.drawerapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DrawerFragment.DrInterface {

    override fun show(x: Int) {
        if (x == 1) {
            var tr = fragmentManager.beginTransaction()
            var obj = HomeFragment()
            tr.replace(R.id.container, obj)
            tr.commit()
        }
        dr.closeDrawer(GravityCompat.START)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        var toggle = ActionBarDrawerToggle(this,
                dr, toolbar, R.string.open, R.string.close)
        dr.addDrawerListener(toggle)
        toggle.syncState()
    }
}
