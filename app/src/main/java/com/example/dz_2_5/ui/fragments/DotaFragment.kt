package com.example.dz_2_5.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.dz_2_5.R
import com.example.dz_2_5.data.models.DotaModel
import com.example.dz_2_5.data.repositories.DotaRepository
import com.example.dz_2_5.databinding.FragmentDotaBinding
import com.example.dz_2_5.ui.adapter.DotaAdapter

class DotaFragment : Fragment() {

    private lateinit var binding: FragmentDotaBinding
    private var dotaAdapter = DotaAdapter()
    private val viewModel by activityViewModels<DotaViewModel>()
    private val repository = DotaRepository()
    private var dotaList = mutableListOf<DotaModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDotaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        setupObserve()
    }

    private fun initialize() {
        dotaAdapter.submitList(repository.getPersonDota())
        binding.rvDota.adapter = dotaAdapter
    }

    private fun setupListener() {
        binding.btmAdd.setOnClickListener {
            findNavController().navigate(R.id.action_dotaFragment_to_deteilDotaFragment)
        }
    }

    private fun setupObserve() {
        viewModel.dotaLiveData.observe(viewLifecycleOwner) {
            dotaList  = repository.getPersonDota()
            dotaList.addAll(it)
            dotaAdapter.submitList(dotaList)
        }
    }
}