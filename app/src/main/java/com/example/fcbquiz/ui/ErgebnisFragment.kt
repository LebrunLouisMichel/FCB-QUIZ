package com.example.fcbquiz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fcbquiz.databinding.FragmentErgebnisBinding

class ErgebnisFragment : Fragment() {

    private lateinit var binding: FragmentErgebnisBinding

    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            score = it.getInt("score")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentErgebnisBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.resultScoreText.text = "!!gut gemacht du hast $score von 30 Fragen richtig beantwortet!!"
    }
}