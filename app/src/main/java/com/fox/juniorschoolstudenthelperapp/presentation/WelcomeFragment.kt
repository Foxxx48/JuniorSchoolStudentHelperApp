package com.fox.juniorschoolstudenthelperapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fox.juniorschoolstudenthelperapp.R
import com.fox.juniorschoolstudenthelperapp.databinding.FragmentWelcomeBinding
import java.lang.RuntimeException


class WelcomeFragment : Fragment() {
    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("WelcomeFragmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonUnderstand.setOnClickListener {
            launchChooseLevelFragment()
        }
    }



    private fun launchChooseLevelFragment() {
        findNavController().navigate(R.id.action_welcomeFragment_to_chooseLevelFragment)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
