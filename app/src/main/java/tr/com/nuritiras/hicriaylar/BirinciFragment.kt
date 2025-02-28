package tr.com.nuritiras.hicriaylar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import tr.com.nuritiras.hicriaylar.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {

    private var _binding: FragmentBirinciBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBirinciBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.setText(
            buildString {
                append("Hicri Ay İsimleri\n\n")
                append("1- Muharrem,\n")
                append("2- Safer,\n")
                append("3- Rebî'ül-evvel,\n")
                append("4- Rebî'ül-âhir,\n")
                append("5- Cemâziyel evvel,\n")
                append("6- Cemâziyel âhir,\n")
                append("7- Receb,\n")
                append("8- Şâban,\n")
                append("9- Ramazan,\n")
                append("10- Şevval,\n")
                append("11- Zilka'de,\n")
                append("12- Zilhicce.")
            })
        binding.button.setOnClickListener {
            val isim = binding.editTextHicriAy.text.toString()
            val action = BirinciFragmentDirections.actionBirinciFragmentToIkinciFragment(isim)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}