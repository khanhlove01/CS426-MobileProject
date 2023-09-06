package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.onhomefragment.NFTHome;
import com.example.myapplication.onsearchfragment.AdapterNFTSearch;

import java.util.ArrayList;
import java.util.List;

public class FragmentSearch extends Fragment {

    private View view;
    private RecyclerView rcv_searchfragment;
    private AdapterNFTSearch adapterNFTSearch;
    private SearchView searchView;
    public FragmentSearch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search, container, false);

        //rcv
        rcv_searchfragment = view.findViewById(R.id.rcv_searchfragment);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        rcv_searchfragment.setLayoutManager(gridLayoutManager);

        //search
        searchView = view.findViewById(R.id.searchview_searchfragment);
        EditText searchEditText  = searchView.findViewById(androidx.appcompat.R.id.search_src_text);

        // Set the text color to white
        searchEditText.setTextColor(Color.WHITE);

        // Set the hint text color to white
        searchEditText.setHintTextColor(Color.WHITE);
        searchEditText.setHintTextColor(Color.argb(128, 255, 255, 255)); // 128 is the alpha value (0-255)


        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });
        //Adapter
        adapterNFTSearch = new AdapterNFTSearch(getContext(),AppController.nftHomeFullList);
        rcv_searchfragment.setAdapter(adapterNFTSearch);
        return view;
    }
    private void filterList(String text) {
        List<NFTHome> filteredList = new ArrayList<>();
        for (NFTHome nftHome : AppController.nftHomeFullList) {
            String itemName = nftHome.getNft_name().toLowerCase();
            if (itemName.contains(text.toLowerCase())) {
                filteredList.add(nftHome);
            }
        }
        if (filteredList.isEmpty()) {
            Toast.makeText(getContext(), "No data found", Toast.LENGTH_SHORT).show();
        } else {
            Log.d("FilteredList", "Filtered items: " + filteredList.size());
            adapterNFTSearch.setFilteredList(filteredList);
            //adapterNFTSearch.notifyDataSetChanged();

            /*rcv_searchfragment = view.findViewById(R.id.rcv_searchfragment);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
            rcv_searchfragment.setLayoutManager(gridLayoutManager);

            adapterNFTSearch = new AdapterNFTSearch(getContext(),filteredList);
            rcv_searchfragment.setAdapter(adapterNFTSearch);*/
        }
    }

}