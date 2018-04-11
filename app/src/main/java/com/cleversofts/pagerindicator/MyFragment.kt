package com.cleversofts.pagerindicator

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.slide.*
import org.w3c.dom.Text


class MyFragment: Fragment() {


    companion object {
        fun newInstance(data: String): MyFragment {
            val fragment = MyFragment()
            val args = Bundle()
            args.putString("data", data)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater!!.inflate(R.layout.slide, container, false)
        val data = arguments!!.getString("data")
        val txt = v.findViewById<TextView>(R.id.textView)
        txt.text = data
        return v
        //return inflater!!.inflate(R.layout.slide, container, false)
    }

}