package com.esraa.navigation_fragments


import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.esraa.navigation_fragments.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFragment : Fragment() {

override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
        inflater, R.layout.fragment_title, container, false)
    setHasOptionsMenu(true)
    //The complete onClickListener with Navigation
    binding.playButton.setOnClickListener {
       // Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
       view?.findNavController()?.navigate(R.id.action_titleFragment_to_gameFragment)

    }
    return binding.root
}

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu) // why not R.id ??

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
