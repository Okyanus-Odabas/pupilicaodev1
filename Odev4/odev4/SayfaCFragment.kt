package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaCBinding

class SayfaCFragment : Fragment() {
    private lateinit var binding: FragmentSayfaCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaCBinding.inflate(inflater, container, false)
        binding.buttonD1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisD1)
        }
        return binding.root
    }


}