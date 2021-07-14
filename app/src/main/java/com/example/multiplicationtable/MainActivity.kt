package com.example.multiplicationtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentOne.newInstance("1","1"))
                .commit()
        }
        button2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentTwo.newInstance("2","2"))
                .commit()
        }
        button3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentThree.newInstance("3","3"))
                .commit()
        }
        button4.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentFour.newInstance("4","4"))
                .commit()
        }
        button5.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentFive.newInstance("5","5"))
                .commit()
        }
        button6.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentSix.newInstance("6","6"))
                .commit()
        }
        button7.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentSeven.newInstance("7","7"))
                .commit()
        }
        button8.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentEight.newInstance("8","8"))
                .commit()
        }
        button9.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentNine.newInstance("9","9"))
                .commit()
        }
        button10.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container,FragmentTen.newInstance("10","10"))
                .commit()
        }

    }
}