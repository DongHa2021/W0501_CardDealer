package kr.ac.kumoh.s20180134.w0501_carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180134.w0501_carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate((layoutInflater))
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.card1.setImageResource(R.drawable.c_10_of_spades)
    }
}