package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), ButtonFragment.ButtonInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun buttonClicked() {
        (supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as DieFragment).throwDie()
    }
}