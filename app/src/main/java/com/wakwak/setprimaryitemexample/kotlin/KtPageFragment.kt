package com.wakwak.setprimaryitemexample.kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wakwak.setprimaryitemexample.R


/**
 * Created by Ryo on 2018/01/17.
 */
class KtPageFragment : Fragment() {

    companion object {
        fun newInstance(page: Int) = KtPageFragment().apply {
            arguments = Bundle().apply {
                putString("page", page.toString())
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text: TextView = view.findViewById(R.id.page_position)
        text.text = arguments?.getString("page") ?: ""
    }
}
