package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {
    private List<Modelclass> modelclassList;

    public Adapter(List<Modelclass> modelclassList) {
        this.modelclassList = modelclassList;
    }

    @NonNull
    @Override
    public Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
          return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Viewholder holder, int position) {
        String button =modelclassList.get(position).getButton();
        String title = modelclassList.get(position).getTilte();
        String body1=modelclassList.get(position).getBody1();
        String body2=modelclassList.get(position).getBody2();
        holder.setData(button,title,body1,body2);


    }

    @Override
    public int getItemCount() {
        return modelclassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private Button button1;
        private TextView title;
        private TextView body1;
        private TextView body2;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            button1=itemView.findViewById(R.id.roundbutton);
            title=itemView.findViewById(R.id.Title);
            body1=itemView.findViewById(R.id.Body1);
            body2=itemView.findViewById(R.id.Body2);
        }
        private void setData(String buttonText,String titleText,String body1Text,String body2Text)
        {
            button1.setText(buttonText);
            title.setText(titleText);
            body1.setText(body1Text);
            body2.setText(body2Text);

        }
    }
}
