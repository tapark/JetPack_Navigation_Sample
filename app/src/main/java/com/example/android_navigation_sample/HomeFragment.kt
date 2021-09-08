package com.example.android_navigation_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class HomeFragment: Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.firstButton).setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_firstFragment)
        }

        view.findViewById<Button>(R.id.secondButton).setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_secondFragment)
        }

        view.findViewById<Button>(R.id.thirdButton).setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_thirdFragment)
        }

    }
}