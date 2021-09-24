package br.com.carolchiaradia.calculaflex.betterfuel

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.carolchiaradia.calculaflex.R
import br.com.carolchiaradia.calculaflex.base.auth.BaseAuthFragment
import br.com.carolchiaradia.calculaflex.databinding.FragmentBetterFuelBinding

class BetterFuelFragment : BaseAuthFragment() {
    override val layout: Int
        get() = R.layout.fragment_better_fuel
}