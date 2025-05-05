package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaBBinding
import com.example.odev4.databinding.FragmentSayfaDBinding

class SayfaDFragment : Fragment() {
   private lateinit var binding : FragmentSayfaDBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaDBinding.inflate(inflater, container, false)
        binding.buttonAna.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisAna)
        }
        return binding.root
    }


}