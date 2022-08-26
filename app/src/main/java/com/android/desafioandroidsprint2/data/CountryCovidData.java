package com.android.desafioandroidsprint2.data;

import java.io.Serializable;

public class CountryCovidData implements Serializable {
    String ActiveCasesText;
    String LastUpdateText;
    String CountryText;
    String NewCasesText;
    String NewDeathsText;
    String TotalCasesText;
    String TotalDeathsText;
    String TotalRecoveredText;

    public CountryCovidData(String ActiveCasesText,
                            String LastUpdateText,
                            String CountryText,
                            String NewCasesText,
                            String NewDeathsText,
                            String TotalCasesText,
                            String TotalDeathsText,
                            String TotalRecoveredText) {
        this.ActiveCasesText = ActiveCasesText;
        this.LastUpdateText = LastUpdateText;
        this.CountryText = CountryText;
        this.NewCasesText = NewCasesText;
        this.NewDeathsText = NewDeathsText;
        this.TotalCasesText = TotalCasesText;
        this.TotalDeathsText = TotalDeathsText;
        this.TotalRecoveredText = TotalRecoveredText;
    }

    public String getActiveCasesText() {
        return ActiveCasesText;
    }

    public String getLastUpdateText() {
        return LastUpdateText;
    }

    public String getCountryText() {
        return CountryText;
    }

    public String getNewCasesText() {
        return NewCasesText;
    }

    public String getNewDeathsText() {
        return NewDeathsText;
    }

    public String getTotalCasesText() {
        return TotalCasesText;
    }

    public String getTotalDeathsText() {
        return TotalDeathsText;
    }

    public String getTotalRecoveredText() {
        return TotalRecoveredText;
    }

}
