package com.krillinator.lektion_9_navigation_graph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.navigation.Navigation

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Components / Widgets
        val flHomeFragment: FrameLayout = view.findViewById(R.id.fl_homepage_fragment)

        // Listeners
        flHomeFragment.setOnClickListener {
            Navigation
                .findNavController(view)
                .navigate(R.id.action_homeFragment_to_firstFragment)
        }

        // TODO - 11:25 - Fortsätter vi! :)

        return view
    }

}