package com.example.test

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMain2Binding

private const val TAG = "MainActivity2"

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    var flag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val list1 =
            listOf("String", "Int", "Number", "Float", "Double", "Char", "Array", "CharSequence")
        val list2 =
            listOf("Array", "CharSequence")

        binding.apply {

            btn1.setOnClickListener {
                val adapter = CustomAdapter(list2)
                val layoutManager = LinearLayoutManager(this@MainActivity2)
                recyclerview.layoutManager = layoutManager

                recyclerview.layoutParams.height = RecyclerView.LayoutParams.WRAP_CONTENT

                recyclerview.adapter = adapter
            }

            btn2.setOnClickListener {
                Toast.makeText(this@MainActivity2, "", Toast.LENGTH_SHORT).show()
                val adapter = CustomAdapter(list1)
                val layoutManager = LinearLayoutManager(this@MainActivity2)
                recyclerview.layoutManager = layoutManager

                recyclerview.layoutParams.height = 400

//            btn.setOnClickListener {
//                if (recycler.visibility == View.GONE) {
//                    flag = true
//                    recycler.visibility = View.VISIBLE
//                } else {
//                    flag = false
//                    recycler.visibility = View.GONE
//                }
//

//
//                recycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
//                    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
//                        super.onScrollStateChanged(recyclerView, newState)
//
//                        if (!recyclerView.canScrollVertically(1) && newState == RecyclerView.SCROLL_STATE_IDLE) {
//                            recycler.layoutParams.height = 400
//                        } else {
//                            recycler.layoutParams.height = RecyclerView.LayoutParams.WRAP_CONTENT
//                        }
//                    }
//                })
//
//                if (layoutManager.findLastCompletelyVisibleItemPosition() == list.size - 1) {
//                } else {
//                    recycler.layoutParams.height = 400
//                }
//
                recyclerview.adapter = adapter
            }
        }
    }
}