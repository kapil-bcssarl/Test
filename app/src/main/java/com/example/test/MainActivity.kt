package com.example.test

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity() : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val list = listOf("String", "Int", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val adapter = CustomAdapter(`)
//
//        val dialog = AlertDialog.Builder(this)
//        val view = layoutInflater.inflate(R.layout.df, null)
//        val rv = view.findViewById<RecyclerView>(R.id.rv)
//        dialog.setView(view)
//        val dialogBox = dialog.create()
//        rv.layoutManager = LinearLayoutManager(this)
//        rv.adapter = adapter
//        dialogBox.show()`


//        val constraintSet = ConstraintSet()

//        binding.btn1.setOnClickListener {
//            constraintSet.clone(binding.cl)
//
//            binding.included.cl1.visibility = View.VISIBLE
//            displayAdapter()
//
//            constraintSet.connect(R.id.cl1, ConstraintSet.TOP, R.id.btn2, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.cl1, ConstraintSet.START, R.id.btn2, ConstraintSet.START)
//            constraintSet.connect(R.id.cl1, ConstraintSet.END, R.id.btn2, ConstraintSet.END)
//
//            constraintSet.connect(R.id.iv, ConstraintSet.TOP, R.id.cl1, ConstraintSet.TOP)
//            constraintSet.connect(R.id.iv, ConstraintSet.START, R.id.cl1, ConstraintSet.START)
//            constraintSet.connect(R.id.iv, ConstraintSet.END, R.id.cl1, ConstraintSet.END)
//
//            constraintSet.connect(R.id.rv, ConstraintSet.TOP, R.id.iv, ConstraintSet.BOTTOM)
//            constraintSet.connect(R.id.rv, ConstraintSet.START, R.id.iv, ConstraintSet.START)
//            constraintSet.connect(R.id.rv, ConstraintSet.END, R.id.iv, ConstraintSet.END)
//
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
//
//            constraintSet.constrainDefaultWidth(R.id.rv, ConstraintSet.MATCH_CONSTRAINT_SPREAD)
//            constraintSet.constrainDefaultWidth(R.id.cl1, ConstraintSet.MATCH_CONSTRAINT_SPREAD)
//            constraintSet.applyTo(binding.cl)
//        }
//
//        binding.btn2.setOnClickListener {
//            constraintSet.clone(binding.cl)
////            displayAdapter()
//
//            binding.included.cl1.visibility = View.VISIBLE
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
    }

    fun displayAdapter() {
//        val adapter = CustomAdapter()
//        binding.included.rv.layoutManager = LinearLayoutManager(this)
//        binding.included.rv.adapter = adapter
    }
}
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










