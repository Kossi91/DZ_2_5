package com.example.dz_2_5.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.dz_2_5.databinding.FragmentDeteilDotaBinding

class DeteilDotaFragment : Fragment() {

    private lateinit var binding: FragmentDeteilDotaBinding
    private val viewModel by activityViewModels<DotaViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDeteilDotaBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.btnSend.setOnClickListener{
            val icon = binding.etUrl.text.toString().trim()
            val name = binding.etName.text.toString().trim()

            viewModel.getDotaPersons(icon = icon, name = name)
            findNavController().navigateUp()
        }
    }
}