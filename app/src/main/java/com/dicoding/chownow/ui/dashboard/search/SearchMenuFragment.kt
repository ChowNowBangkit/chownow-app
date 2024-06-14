package com.dicoding.chownow.ui.dashboard.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.chownow.R
import com.dicoding.chownow.data.model.ListMenu
import com.dicoding.chownow.databinding.FragmentSearchMenuBinding

class SearchMenuFragment : Fragment() {

    private var _binding: FragmentSearchMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.rvMenuSearch
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        // Siapkan data Menu
        val menus = listOf(
            ListMenu(R.drawable.breakfast, "Nama Menu 1", 4.0f),
            ListMenu(R.drawable.breakfast, "Nama Menu 2", 4.5f),
            ListMenu(R.drawable.breakfast, "Nama Menu 3", 4.9f)
        )

        // Atur adapter untuk Menu
        val adapter = SearchMenuAdapter(menus)
        recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}