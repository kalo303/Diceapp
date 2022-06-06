package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBotton: Button = findViewById(R.id.button_id)
        val diceOne: ImageView = findViewById(R.id.first_dice)
        val secondDice:ImageView=findViewById(R.id.second_dice)

        rollBotton.setOnClickListener(){
            val randomNumber = Random.nextInt(6) + 1

        val resourceDrawable1 = when(randomNumber){
             1->R.drawable.dice_one
              2->R.drawable.dice_two
              3->R.drawable.dice_three
              4->R.drawable.dice_four
              5->R.drawable.dice_five
              6->R.drawable.dice_six
              else->R.drawable.dice_six
            }
            diceOne.setImageResource(resourceDrawable1)

            val randomNumber2 = Random.nextInt(6) + 1
            val resourceDrawable2 = when(randomNumber2){
                1->R.drawable.dice_one
                2->R.drawable.dice_two
                3->R.drawable.dice_three
                4->R.drawable.dice_four
                5->R.drawable.dice_five
                6->R.drawable.dice_six
                else->R.drawable.dice_six
            }
            secondDice.setImageResource(resourceDrawable2)

        }
    }
}