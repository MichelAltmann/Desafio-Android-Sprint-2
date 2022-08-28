package com.android.desafioandroidsprint2.data;

import java.io.Serializable;

public class CountryCovidData implements Serializable {
    String ActiveCasesText;
    String LastUpdate;
    String CountryText;
    String NewCasesText;
    String NewDeathsText;
    String TotalCasesText;
    String TotalDeathsText;
    String TotalRecoveredText;

    public CountryCovidData(String ActiveCasesText,
                            String LastUpdate,
                            String CountryText,
                            String NewCasesText,
                            String NewDeathsText,
                            String TotalCasesText,
                            String TotalDeathsText,
                            String TotalRecoveredText) {
        this.ActiveCasesText = ActiveCasesText;
        this.LastUpdate = LastUpdate;
        this.CountryText = CountryText;
        this.NewCasesText = NewCasesText;
        this.NewDeathsText = NewDeathsText;
        this.TotalCasesText = TotalCasesText;
        this.TotalDeathsText = TotalDeathsText;
        this.TotalRecoveredText = TotalRecoveredText;
    }

    public String getActiveCasesText() {
        if (ActiveCasesText == null){
            ActiveCasesText = "";
        }
        return ActiveCasesText;
    }

    public String getLastUpdate() {
        if (LastUpdate == null){
            LastUpdate = "";
        }
        return LastUpdate;
    }

    public String getCountryText() {
        if (CountryText == null){
            CountryText = "";
        }
        return CountryText;
    }

    public String getNewCasesText() {
        if (NewCasesText == null){
            NewCasesText = "";
        }
        return NewCasesText;
    }

    public String getNewDeathsText() {
        if (NewDeathsText == null){
            NewDeathsText = "";
        }
        return NewDeathsText;
    }

    public String getTotalCasesText() {
        if (TotalCasesText == null){
            TotalCasesText = "";
        }
        return TotalCasesText;
    }

    public String getTotalDeathsText() {
        if (TotalDeathsText == null){
            TotalDeathsText = "";
        }
        return TotalDeathsText;
    }

    public String getTotalRecoveredText() {
        if (TotalRecoveredText == null){
            TotalRecoveredText = "";
        }
        return TotalRecoveredText;
    }

}
