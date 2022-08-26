package com.android.desafioandroidsprint2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.desafioandroidsprint2.R;
import com.android.desafioandroidsprint2.adapter.listener.OnItemClickListener;
import com.android.desafioandroidsprint2.data.CountryCovidData;

import java.util.List;

public class CovidListAdapter extends RecyclerView.Adapter<CovidListAdapter.DataViewHolder> {
    private final Context context;
    private List<CountryCovidData> allData;
    private OnItemClickListener onItemClickListener;

    public CovidListAdapter(Context context, List<CountryCovidData> data){
        this.context = context;
        this.allData = data;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.lista_item_pais, parent, false);
        return new DataViewHolder(viewCriada);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        CountryCovidData data = allData.get(position);
        holder.vincula(data);
    }

    @Override
    public int getItemCount() {
        return allData.size();
    }

    class DataViewHolder extends RecyclerView.ViewHolder{

        private final TextView pais;
        private final TextView mortes;
        private CountryCovidData data;

        public DataViewHolder(@NonNull View itemView) {
        super(itemView);
            pais = itemView.findViewById(R.id.item_pais_nome);
            mortes = itemView.findViewById(R.id.item_pais_mortos);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(data, getAdapterPosition());
                }
            });
        }
        public void vincula (CountryCovidData data){
            this.data = data;
            preencheCampos(data);
        }

        private void preencheCampos(CountryCovidData data) {
            pais.setText(data.getCountryText());
            mortes.setText(data.getTotalDeathsText());
        }

    }
}
