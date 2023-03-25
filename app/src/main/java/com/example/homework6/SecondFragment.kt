package com.example.homework6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import java.io.Serializable

class SecondFragment : Fragment() {

    var image : ImageView? = null
    var text: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        image = view.findViewById(R.id.iv_cat_image)
        text = view.findViewById(R.id.detail_text)

        val bundle = arguments
        val textW : String? = bundle?.getString("q")
        val imageW : String? = bundle?.getString("w")
        image?.let { Glide.with(it).load(imageW).into(image!!)}
        text?.text  = textW



    }
}