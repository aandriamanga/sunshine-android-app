package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// COMPLETE (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // COMPLETE (23) Create a private string array called mWeatherData
    private String[] mWeatherData;

    // COMPLETE (47) Create the default constructor (we will pass in parameters in a later lesson)
    public ForecastAdapter() {

    }

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

    // COMPLETE (24) Override onCreateViewHolder
    // COMPLETE (25) Within onCreateViewHolder, inflate the list item xml into a view
    // COMPLETE (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        int layoutIdForListItem = R.layout.forecast_list_item;
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    // COMPLETE (27) Override onBindViewHolder
    // COMPLETE (28) Set the text of the TextView to the weather for this list item's position
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int position) {
        String weatherForThisDay = mWeatherData[position];
        forecastAdapterViewHolder.mWeatherTextView.setText(weatherForThisDay);
    }

    // COMPLETE (29) Override getItemCount
    // COMPLETE (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
    @Override
    public int getItemCount() {
        if(mWeatherData != null) return mWeatherData.length;
        else return 0;
    }

    // COMPLETE (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // COMPLETE (32) After you save mWeatherData, call notifyDataSetChanged
    public void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}
