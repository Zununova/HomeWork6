package com.example.homework6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FirstFragment : Fragment(), OnShortClick {
    private var recyclerView: RecyclerView? = null
    private var repositoryCat = RepositoryCat()
    private var catAdapter = CatAdapter(repositoryCat.getCatList(), this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(requireContext())
        recyclerView?.adapter = catAdapter

    }

    override fun onItemShortClick(catItems: CatItems) {

        val bundle = Bundle()
        val secondFragment = SecondFragment()
        bundle.putString("q", catItems.detail)
        bundle.putString("w", catItems.catImage)

        secondFragment.arguments = bundle


        parentFragmentManager.beginTransaction()
            .replace(R.id.first_fragment, secondFragment)
            .addToBackStack("hello")
            .commit()
    }


}