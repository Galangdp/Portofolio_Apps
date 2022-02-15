package com.example.portofolioapps.ui

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.portofolioapps.Portofolio
import com.example.portofolioapps.PortofolioData
import com.example.portofolioapps.R
import com.example.portofolioapps.adapter.RVAndroidAdapter
import com.example.portofolioapps.databinding.FragmentAndroidBinding

private const val GITHUB_LINK = "https://github.com/Galangdp"


class AndroidFragment : Fragment() {

    private var _binding: FragmentAndroidBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAndroidBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val androidadapter = RVAndroidAdapter()
        androidadapter.setData(PortofolioData.listAppAndroid)

        androidadapter.onItemClicked = { selectedData ->
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(selectedData.link))
        }

        with(binding.rvAndroid){
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = androidadapter
        }
        binding.btnAndroid.text = getString(
            R.string.app_android_btn,
            PortofolioData.listAppAndroid.size.toString()
        )

        binding.txtDokumentasi.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(GITHUB_LINK))
        }
    }
}