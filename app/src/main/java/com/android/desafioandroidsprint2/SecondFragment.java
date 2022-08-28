package com.android.desafioandroidsprint2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.android.desafioandroidsprint2.data.CountryCovidData;
import com.android.desafioandroidsprint2.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        CountryCovidData data = (CountryCovidData) bundle.getSerializable("countryData");
        binding.fragmentSecondPais.setText(data.getCountryText());

        haveCountryCovidData(data);
        haveLastUpdateData(data);
        haveNewCasesData(data);
        haveNewDeathsData(data);
        haveTotalCasesData(data);
        haveTotalDeathsData(data);
        haveTotalRecoveredData(data);

    }

    private void haveTotalRecoveredData(CountryCovidData data) {
        if (!data.getTotalRecoveredText().equals("")) {
            binding.fragmentSecondTotalRecuperados.setText(data.getTotalRecoveredText());
        } else {
            binding.fragmentSecondTotalRecuperados.setVisibility(TextView.GONE);
            binding.fragmentSecondTotalRecuperadosTextView.setVisibility(TextView.GONE);
        }
    }

    private void haveTotalDeathsData(CountryCovidData data) {
        if (!data.getTotalDeathsText().equals("")) {
            binding.fragmentSecondMortesTotais.setText(data.getTotalDeathsText());
        } else {
            binding.fragmentSecondMortesTotais.setVisibility(TextView.GONE);
            binding.fragmentSecondMortesTotaisTextView.setVisibility(TextView.GONE);
        }
    }

    private void haveTotalCasesData(CountryCovidData data) {
        if (!data.getTotalCasesText().equals("")) {
            binding.fragmentSecondCasosTotais.setText(data.getTotalCasesText());
        } else {
            binding.fragmentSecondCasosTotais.setVisibility(TextView.GONE);
            binding.fragmentSecondCasosTotaisTextView.setVisibility(TextView.GONE);
        }
    }

    private void haveNewDeathsData(CountryCovidData data) {
        if (!data.getNewDeathsText().equals("")) {
            binding.fragmentSecondNovasMortes.setText(data.getNewDeathsText());
        } else {
            binding.fragmentSecondNovasMortes.setVisibility(TextView.GONE);
            binding.fragmentSecondNovasMortesTextView.setVisibility(TextView.GONE);
        }
    }

    private void haveNewCasesData(CountryCovidData data) {
        if (!data.getNewCasesText().equals("")) {
            binding.fragmentSecondNovosCasos.setText(data.getNewCasesText());
        } else {
            binding.fragmentSecondNovosCasos.setVisibility(TextView.GONE);
            binding.fragmentSecondNovosCasosTextView.setVisibility(TextView.GONE);
        }
    }

    private void haveLastUpdateData(CountryCovidData data) {
        if (!data.getLastUpdate().equals("")) {
            binding.fragmentSecondUltimaAtualizacao.setText(data.getLastUpdate());
        } else {
            binding.fragmentSecondUltimaAtualizacaoTextView.setVisibility(TextView.GONE);
            binding.fragmentSecondUltimaAtualizacao.setVisibility(TextView.GONE);
        }
    }

    private void haveCountryCovidData(CountryCovidData data) {
        if (!data.getActiveCasesText().equals("")) {
            binding.fragmentSecondCasosAtivos.setText(data.getActiveCasesText());
        } else {
            binding.fragmentSecondCasosAtivosTextView.setVisibility(TextView.GONE);
            binding.fragmentSecondCasosAtivos.setVisibility(TextView.GONE);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}