package com.android.desafioandroidsprint2.model;

import java.io.Serializable;

public class PaisCovidData implements Serializable {
    String CasosAtivos;
    String Pais;
    String UltimaAtualizacao;
    String NovosCasos;
    String NovasMortes;
    String TotalCasos;
    String TotalMortes;
    String TotalRecuperados;

    public PaisCovidData(String casosAtivos,
                         String pais,
                         String ultimaAtualizacao,
                         String novosCasos,
                         String novasMortes,
                         String totalCasos,
                         String totalMortes,
                         String totalRecuperados) {
        CasosAtivos = casosAtivos;
        Pais = pais;
        UltimaAtualizacao = ultimaAtualizacao;
        NovosCasos = novosCasos;
        NovasMortes = novasMortes;
        TotalCasos = totalCasos;
        TotalMortes = totalMortes;
        TotalRecuperados = totalRecuperados;
    }

    public String getCasosAtivos() {
        return CasosAtivos;
    }

    public String getPais() {
        return Pais;
    }

    public String getUltimaAtualizacao() {
        return UltimaAtualizacao;
    }

    public String getNovosCasos() {
        return NovosCasos;
    }

    public String getNovasMortes() {
        return NovasMortes;
    }

    public String getTotalCasos() {
        return TotalCasos;
    }

    public String getTotalMortes() {
        return TotalMortes;
    }

    public String getTotalRecuperados() {
        return TotalRecuperados;
    }
}
