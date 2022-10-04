package kr.ac.kumoh.s20180134.w0501_carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20180134.w0501_carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate((layoutInflater))
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        getCardName(36)

        binding.card1.setImageResource(R.drawable.c_10_of_spades)
    }

    private fun getCardName(c: Int) : String {
        Log.i("getCardName : ",(c/13).toString())
        val shape = when (c/13){
            0 -> "spades"
            1 -> "diamonds"
            2 -> "hearts"
            3 -> "clubs"
            else ->"error"
        }
        Log.i("getCardName : ",shape)
        val number = when(c%13){
            in 1..9 ->(c%13+1).toString()
            10 -> "Jack"
            11 -> "Queen"
            12 -> "King"
            else ->"error"
        }
        Log.i("getCardName : ",number)
        return "c_ace_of_spades"
    }

}