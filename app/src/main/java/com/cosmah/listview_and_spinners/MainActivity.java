package com.cosmah.listview_and_spinners;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //declare listview
    private ListView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fb(create list)
        citiesList = findViewById(R.id.cities);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kampala");
        cities.add("Nairobi");
        cities.add("Abuja");
        cities.add("New York");
        cities.add("Cairo");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Kigali");
        cities.add("London");
        cities.add("Accra");
        cities.add("Juba");
        cities.add("Denver");
        cities.add("Tokyo");
        cities.add("Beijing");
        cities.add("Taipei");
        cities.add("Tennesse");

        //create adaptor to fetch data
        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                //context
                this,
                //layout
                android.R.layout.simple_list_item_1,
                //values
                cities
        );

        //set adaptor
        citiesList.setAdapter(citiesAdapter);

        //set click listener for a behaviour when clicked
        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, cities.get(position) + " is Selected.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}