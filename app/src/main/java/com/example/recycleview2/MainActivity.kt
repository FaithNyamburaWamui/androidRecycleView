package com.example.recycleview2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number=findFinabonacci(100)
        binding.rvRecycleView.layoutManager=LinearLayoutManager(this)

        val numberAdapter=NumbersRecycleViewAdapter(number)
        binding.rvRecycleView.adapter=numberAdapter

//        val numbers= listOf(0,1,1,2,3,5,8,13,21,34,55,89,144,233)


    }

    fun findFinabonacci(n:Int):List<Int>{
        val number= mutableListOf(0,1)
        while (number.size<n){
           number.add(number[number.lastIndex] + number[number.lastIndex-1])
        }
        return number
    }
}