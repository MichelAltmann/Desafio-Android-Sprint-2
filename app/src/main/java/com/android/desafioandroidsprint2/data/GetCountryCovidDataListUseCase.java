package com.android.desafioandroidsprint2.data;

import android.content.Context;

import java.util.List;

public interface GetCountryCovidDataListUseCase {
    List<CountryCovidData> execute(Context appContext);
}
