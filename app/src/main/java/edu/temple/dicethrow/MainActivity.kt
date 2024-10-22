package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), ButtonFragment.ButtonInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = DieFragment.newInstance(100)

        if (supportFragmentManager.findFragmentById(R.id.dieContainer) !is DieFragment)
            supportFragmentManager.beginTransaction().add(R.id.dieContainer).commit()


    }

    override fun buttonClicked() {

    }
}