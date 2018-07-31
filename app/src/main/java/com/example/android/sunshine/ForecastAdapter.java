package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ForecastAdapter {
    // TODO (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // TODO (23) Create a private string array called mWeatherData

    // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)

    // COMPLETE (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // COMPLETE (17) Extend RecyclerView.ViewHolder
    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        // COMPLETE (18) Create a public final TextView variable called mWeatherTextView
        public final TextView mWeatherTextView;


        // COMPLETE (19) Create a constructor for this class that accepts a View as a parameter
        public ForecastAdapterViewHolder(View itemView) {
            // COMPLETE (20) Call super(view) within the constructor for ForecastAdapterViewHolder
            super(itemView);

            // COMPLETE (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);

        }
    }
}
