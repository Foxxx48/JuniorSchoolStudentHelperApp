package com.fox.juniorschoolstudenthelperapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fox.juniorschoolstudenthelperapp.databinding.FragmentGameBinding
import com.fox.juniorschoolstudenthelperapp.domain.entity.Level


class GameFragment : Fragment() {
    private var _binding: FragmentGameBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("GameFragmentBinding == null")

    private lateinit var level: Level

//    private lateinit var gameRepository: GameRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parseArgs()
//        val newGameSettings = gameRepository.getGameSettings(level)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameBinding.inflate(layoutInflater, container, false)
        return binding.root

    }





   private fun parseArgs() {
        level = requireArguments().getSerializable(KEY_LEVEL) as Level
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val KEY_LEVEL = "level"

        fun newInstance(level: Level): GameFragment {
            return GameFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(KEY_LEVEL, level)
                }
            }
        }
    }
}
