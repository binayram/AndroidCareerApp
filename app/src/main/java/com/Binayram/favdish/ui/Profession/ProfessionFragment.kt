package com.Binayram.favdish.ui.Profession

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.Binayram.favdish.databinding.FragmentProfessionBinding

class ProfessionFragment : Fragment() {

    private lateinit var professionViewModel: ProfessionViewModel
    private var _binding: FragmentProfessionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        professionViewModel =
                ViewModelProvider(this).get(ProfessionViewModel::class.java)

        _binding = FragmentProfessionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        professionViewModel.text.observe(viewLifecycleOwner, {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}