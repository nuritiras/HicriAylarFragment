package tr.com.nuritiras.hicriaylar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tr.com.nuritiras.hicriaylar.databinding.FragmentBirinciBinding
import tr.com.nuritiras.hicriaylar.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {

    private var _binding: FragmentIkinciBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIkinciBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            var metin = ""
            val gelenVeri = IkinciFragmentArgs.fromBundle(it).ayIsmi
            when (gelenVeri) {
                "Muharrem" -> metin="Hicri yılbaşı"
                "Receb" -> metin="Regaib gecesi"
                "Şaban" -> metin="Berat gecesi"
                "Ramazan" -> metin="Kadir gecesi"
                "Şevval" -> metin="Ramazan bayramı"
                "Zilhicce" -> metin="Kurban bayramı"
                else -> metin="İkinci fragment"
            }

            binding.textView2.text = buildString {
                append(gelenVeri)
                append(" ayı\n\n")
                append(metin)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}