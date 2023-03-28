package com.example.eztrain.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eztrain.R;

import com.example.eztrain.models.MainExercises;
import com.example.eztrain.models.RegularExercises;

import java.util.ArrayList;

public class AdapterExercises extends RecyclerView.Adapter<AdapterExercises.ExercisesViewHolder> {


    //Interfaz para clickListener
    public interface OnExercisesClickListener {
        void onExercisesClick(int position);
    }

    private OnExercisesClickListener onExercisesClickListener;

    ArrayList<RegularExercises> regularList;
    public AdapterExercises(ArrayList<RegularExercises> regularList, AdapterExercises.OnExercisesClickListener onExercisesClickListener){
        this.regularList=regularList;
    }

    @NonNull
    @Override
    public AdapterExercises.ExercisesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exerciselist,null, false);
        return new ExercisesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterExercises.ExercisesViewHolder holder, int position) {
        holder.txtNombre.setText(regularList.get(position).getNombre());
        holder.foto.setImageResource(regularList.get(position).getImg());

        // Agrega el OnClickListener al elemento de la lista
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onExercisesClickListener != null) {
                    onExercisesClickListener.onExercisesClick(holder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return regularList.size();
    }

    public class ExercisesViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre;
        ImageView foto;
        public ExercisesViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = (TextView) itemView.findViewById(R.id.exName);
            foto = (ImageView) itemView.findViewById(R.id.exImg);
        }
    }
    //On click listener para realizar una pequeña animación.
    public void setOnExercisesClickListener(OnExercisesClickListener onExerciseClickListener) {
        this.onExercisesClickListener = onExerciseClickListener;
    }
}
