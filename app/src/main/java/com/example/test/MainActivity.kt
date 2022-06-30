package com.example.test

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val list = listOf("String", "Int", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val constraintSet = ConstraintSet()

        val items = listOf("Option 1", "Option 2", "Option 3", "Option 4")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        (binding.menu?.editText as? AutoCompleteTextView)?.setAdapter(adapter)
    }

}
//        binding.btn1.setOnClickListener {
//            constraintSet.clone(binding.cl)
//
//            binding.cl1.visibility = View.VISIBLE
//            displayAdapter()
//
//            constraintSet.connect(R.id.cl1, ConstraintSet.TOP, R.id.btn2, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.cl1, ConstraintSet.START, R.id.btn2, ConstraintSet.START)
//            constraintSet.connect(R.id.cl1, ConstraintSet.END, R.id.btn2, ConstraintSet.END)

//            constraintSet.connect(R.id.iv, ConstraintSet.TOP, R.id.cl1, ConstraintSet.TOP)
//            constraintSet.connect(R.id.iv, ConstraintSet.START, R.id.cl1, ConstraintSet.START)
//            constraintSet.connect(R.id.iv, ConstraintSet.END, R.id.cl1, ConstraintSet.END)
//
//            constraintSet.connect(R.id.rv, ConstraintSet.TOP, R.id.iv, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.rv, ConstraintSet.START, R.id.iv, ConstraintSet.START)
//            constraintSet.connect(R.id.rv, ConstraintSet.END, R.id.iv, ConstraintSet.END)

//            constraintSet.connect(R.id.cl1, ConstraintSet.TOP, R.id.btn1, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.cl1, ConstraintSet.START, R.id.btn1, ConstraintSet.START)
//            constraintSet.connect(R.id.cl1, ConstraintSet.END, R.id.btn1, ConstraintSet.END)
//
//            constraintSet.connect(R.id.iv, ConstraintSet.TOP, R.id.cl1, ConstraintSet.TOP)
//            constraintSet.connect(R.id.iv, ConstraintSet.START, R.id.cl1, ConstraintSet.START)
//            constraintSet.connect(R.id.iv, ConstraintSet.END, R.id.cl1, ConstraintSet.END)
//            constraintSet.connect(R.id.iv, ConstraintSet.BOTTOM, R.id.rv, ConstraintSet.TOP)
//
//            constraintSet.connect(R.id.rv, ConstraintSet.TOP, R.id.iv, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.rv, ConstraintSet.START, R.id.iv, ConstraintSet.START)
//            constraintSet.connect(R.id.rv, ConstraintSet.END, R.id.iv, ConstraintSet.END)

//            constraintSet.constrainDefaultWidth(R.id.rv, ConstraintSet.MATCH_CONSTRAINT_SPREAD)
//            constraintSet.constrainDefaultWidth(R.id.cl1, ConstraintSet.MATCH_CONSTRAINT_SPREAD)
//            constraintSet.applyTo(binding.cl)
//        }

//        binding.btn2.setOnClickListener {
//            constraintSet.clone(binding.cl)
////            displayAdapter()
//
//            binding.cl1.visibility = View.VISIBLE
//            constraintSet.connect(R.id.cl1, ConstraintSet.TOP, R.id.cl, ConstraintSet.TOP)
//            constraintSet.connect(R.id.cl1, ConstraintSet.BOTTOM, R.id.cl, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.cl1, ConstraintSet.START, R.id.cl, ConstraintSet.START)
//            constraintSet.connect(R.id.cl1, ConstraintSet.END, R.id.cl, ConstraintSet.END)
//
////            constraintSet.constrainPercentWidth(R.id.cl1, 0.8f)
////            constraintSet.constrainPercentHeight(R.id.cl1, 0.8f)
//
//            constraintSet.setDimensionRatio(R.id.cl1, "1:2")
//            constraintSet.setMargin(R.id.cl1, ConstraintSet.TOP, 200)
//
//            constraintSet.applyTo(binding.cl)
//        }
//    }

//    fun displayAdapter() {
//        val adapter = CustomAdapter()
//        binding.rv.layoutManager = LinearLayoutManager(this)
//        binding.rv.adapter = adapter
//    }

//    fun isTabletDevice(activityContext: Context): Boolean {
//        val xlarge =
//            activityContext.resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK == Configuration.SCREENLAYOUT_SIZE_XLARGE
//        if (xlarge) {
//            val metrics = DisplayMetrics()
//            val activity = activityContext as Activity
//            activity.windowManager.defaultDisplay.getMetrics(metrics)
//
//            if (metrics.densityDpi == DisplayMetrics.DENSITY_DEFAULT || metrics.densityDpi == DisplayMetrics.DENSITY_HIGH || metrics.densityDpi == DisplayMetrics.DENSITY_MEDIUM || metrics.densityDpi == DisplayMetrics.DENSITY_TV || metrics.densityDpi == DisplayMetrics.DENSITY_XHIGH)
//                return true
//        }
//        return false
//    }
//}










