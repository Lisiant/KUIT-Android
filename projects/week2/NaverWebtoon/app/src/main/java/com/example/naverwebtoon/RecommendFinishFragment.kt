package com.example.naverwebtoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naverwebtoon.databinding.FragmentRecommendFinishBinding

class RecommendFinishFragment : Fragment() {
    lateinit var binding: FragmentRecommendFinishBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecommendFinishBinding.inflate(inflater, container, false)
        return binding.root
    }
}