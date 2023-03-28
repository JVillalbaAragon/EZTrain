package com.example.eztrain.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eztrain.R;
import com.example.eztrain.models.MainExercises;

import java.util.ArrayList;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.MainViewHolder> {

    //Interfaz para un clickListener
    public interface OnExerciseClickListener {
        void onExerciseClick(int position);
    }
    private OnExerciseClickListener onExerciseClickListener;


    ArrayList<MainExercises> exerciseList;

    public AdapterHome(ArrayList<MainExercises> exerciseList, OnExerciseClickListener onExerciseClickListener){
        this.exerciseList=exerciseList;
    }

    @NonNull
    @Override
    public AdapterHome.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homelist,null, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHome.MainViewHolder holder, int position) {
    holder.txtNombre.setText(exerciseList.get(position).getNombre());
    holder.foto.setImageResource(exerciseList.get(position).getImg());
    holder.progreso.setProgress(exerciseList.get(position).getProgress());
        // Agrega el OnClickListener al elemento de la lista
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onExerciseClickListener != null) {
                    onExerciseClickListener.onExerciseClick(holder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre;
        ImageView foto;
        ProgressBar progreso;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = (TextView) itemView.findViewById(R.id.fieldName);
            foto = (ImageView) itemView.findViewById(R.id.imgExercise);
            progreso = (ProgressBar) itemView.findViewById(R.id.progressBar);
        }
    }
    //On click listener para realizar una pequeña animación.
    public void setOnExerciseClickListener(OnExerciseClickListener onExerciseClickListener) {
        this.onExerciseClickListener = onExerciseClickListener;
    }
}
