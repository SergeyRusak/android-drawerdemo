package com.sergeyrusak.task9.ui.aboutApp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sergeyrusak.task9.databinding.FragmentAboutAppBinding


class AboutAppFragment : Fragment() {

    private lateinit var aboutAppViewModel: AboutAppViewModel
    private var _binding: FragmentAboutAppBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aboutAppViewModel =
            ViewModelProvider(this).get(AboutAppViewModel::class.java)

        _binding = FragmentAboutAppBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAboutApp
        aboutAppViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}