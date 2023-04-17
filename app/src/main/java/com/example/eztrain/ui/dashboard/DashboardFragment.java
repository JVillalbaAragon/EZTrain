package com.example.eztrain.ui.dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eztrain.R;
import com.example.eztrain.adapters.AdapterExercises;
import com.example.eztrain.models.RegularExercises;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {

    RecyclerView recyclerExercise;
    ArrayList<RegularExercises> regularList;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();
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
        View vista = inflater.inflate(R.layout.fragment_dashboard, container, false);

        regularList = new ArrayList<>();

        recyclerExercise = vista.findViewById(R.id.exerciseList);

        recyclerExercise.setLayoutManager(new LinearLayoutManager(getContext()));

        // Do something when a card is clicked
        //Comentario prueba
        AdapterExercises.OnExercisesClickListener onExercisesClickListener = new AdapterExercises.OnExercisesClickListener() {
            @Override
            public void onExercisesClick(int position) {
                // Do something when a card is clicked
                //Comentario prueba
            }
        };

        AdapterExercises adapter = new AdapterExercises(regularList, onExercisesClickListener);
        recyclerExercise.setAdapter(adapter);
        recyclerExercise.setLayoutManager(new GridLayoutManager(requireContext(), 2));


        llenarLista();
        return vista;
    }

    private void llenarLista() {
        regularList.add(new RegularExercises("Push up", R.drawable.ic_launcher_foreground));
        regularList.add(new RegularExercises("Planche", R.drawable.ic_launcher_foreground));
        regularList.add(new RegularExercises("Rows", R.drawable.ic_launcher_foreground));

    }
}