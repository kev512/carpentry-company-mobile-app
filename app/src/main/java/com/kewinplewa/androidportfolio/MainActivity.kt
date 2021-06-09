package com.kewinplewa.androidportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Toast.makeText(this, "Witaj!", Toast.LENGTH_SHORT).show()

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        nav_menu.setNavigationItemSelectedListener(this)

        setToolbarTitle("Mebel-Technik")

        changeFragment(Home())

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)

        when(item.itemId) {
            R.id.home -> {
                setToolbarTitle("Mebel-Technik")
                changeFragment(Home())
            }
        }

        when(item.itemId) {
            R.id.about -> {
                setToolbarTitle("Mebel-Technik")
                changeFragment(About())
            }
        }

        when(item.itemId) {
            R.id.offer -> {
                setToolbarTitle("Mebel-Technik")
                changeFragment(Oferta())
            }
        }

        when(item.itemId) {
            R.id.gallery -> {
                setToolbarTitle("Mebel-Technik")
                changeFragment(Galeria())
            }
        }

        when(item.itemId) {
            R.id.contact -> {
                setToolbarTitle("Mebel-Technik")
                changeFragment(Kontakt())
            }
        }

        return true
    }

    fun setToolbarTitle(title:String) {
        supportActionBar?.title = title
    }

    fun changeFragment(frag: Fragment) {
        val fragment = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container, frag).commit()
    }

}