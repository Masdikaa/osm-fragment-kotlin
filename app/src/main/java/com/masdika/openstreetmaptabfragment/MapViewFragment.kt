package com.masdika.openstreetmaptabfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masdika.openstreetmaptabfragment.databinding.FragmentMapViewBinding

private var _binding: FragmentMapViewBinding? = null
private val binding get() = _binding!!

class MapViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapViewBinding.inflate(inflater, container, false)
        return binding.root
    }

}