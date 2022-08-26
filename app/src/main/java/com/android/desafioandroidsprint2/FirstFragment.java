package com.android.desafioandroidsprint2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.android.desafioandroidsprint2.adapter.CovidListAdapter;
import com.android.desafioandroidsprint2.adapter.listener.OnItemClickListener;
import com.android.desafioandroidsprint2.data.CountryCovidData;
import com.android.desafioandroidsprint2.data.GetCovidDataListFromJson;
import com.android.desafioandroidsprint2.databinding.FragmentFirstBinding;

import java.util.List;

public class FirstFragment extends Fragment {

    public static final String TAG = "Get Covid Data List";
    private FragmentFirstBinding binding;
    private CovidListAdapter adapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<CountryCovidData> covidListData = new GetCovidDataListFromJson().execute(getContext());
        configuraRecyclerView(covidListData);

    }

    private void configuraRecyclerView(List<CountryCovidData> covidListData) {
        RecyclerView covidList = binding.listaCovidRecyclerview;
        configuraAdapter(covidListData, covidList);
    }

    private void configuraAdapter(List<CountryCovidData> covidListData, RecyclerView covidList) {
        adapter = new CovidListAdapter(getContext(), covidListData);
        covidList.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(CountryCovidData data, int posicao) {
                Fragment fragment = new SecondFragment();
                Bundle bundle = new Bundle();
                CountryCovidData countryCovidData = covidListData.get(posicao);
                Log.i(TAG, countryCovidData.toString());
                bundle.putSerializable("countryName", countryCovidData);
                fragment.setArguments(bundle);
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}