package com.example.eztrain.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eztrain.R;
import com.example.eztrain.adapters.AdapterHome;
import com.example.eztrain.models.MainExercises;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private AdapterHome.OnExerciseClickListener onExerciseClickListener;

    RecyclerView recyclerHome;
    ArrayList<MainExercises> exerciseList;
    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_home, container, false);

        exerciseList=new ArrayList<>();

        recyclerHome=vista.findViewById(R.id.homeList);

        recyclerHome.setLayoutManager(new LinearLayoutManager(getContext()));

        onExerciseClickListener = new AdapterHome.OnExerciseClickListener() {
            @Override
            public void onExerciseClick(int position) {
                // Do something when a card is clicked
            }
        };

        AdapterHome adapter = new AdapterHome(exerciseList, onExerciseClickListener);
        recyclerHome.setAdapter(adapter);

        llenarLista();
        return vista;
    }


    private void llenarLista(){
        exerciseList.add(new MainExercises("Pistol Squat", R.drawable.ic_launcher_foreground,100));

        exerciseList.add(new MainExercises("Muscle Up", R.drawable.ic_launcher_foreground,25));

        exerciseList.add(new MainExercises("Full Planche", R.drawable.ic_launcher_foreground,0));

        exerciseList.add(new MainExercises("Handstand Push Up", R.drawable.ic_launcher_foreground,66));

        exerciseList.add(new MainExercises("One-arm HandStand Push Up", R.drawable.ic_launcher_foreground,56));

        exerciseList.add(new MainExercises("Straddle Press", R.drawable.ic_launcher_foreground,24));

        exerciseList.add(new MainExercises("Human Flag", R.drawable.ic_launcher_foreground,96));
    }
}