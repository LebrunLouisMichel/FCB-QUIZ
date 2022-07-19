package com.example.fcbquiz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fcbquiz.data.DataSource
import com.example.fcbquiz.data.model.Vip
import com.example.fcbquiz.databinding.FragmentSpielBinding



class SpielFragment : Fragment() {

    private lateinit var binding: FragmentSpielBinding

    private var score = 0

    private lateinit var currentVip: Vip

    private val vipList = DataSource().loadVips()

    private var index = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSpielBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        currentVip = vipList[index]

        binding.scoreText.text = score.toString()
        binding.questionText.text = currentVip.name

        binding.musikerButton.setOnClickListener {
            checkAnswerandUpdate(true)
        }

        binding.spielerButton.setOnClickListener {
            checkAnswerandUpdate(false)
        }
    }

    private fun checkAnswerandUpdate(clickedAnswer: Boolean) {

        if (clickedAnswer == currentVip.noFcbPlayer) {
            score ++
        }

        if (index < vipList.size - 1) {
            index ++
        } else {
             findNavController().navigate(SpielFragmentDirections.actionSpielFragmentToErgebnisFragment(score))
        }
        currentVip = vipList[index]

        binding.questionText.text = currentVip.name
        binding.scoreText.text = score.toString()
    }
}
