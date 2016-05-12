package com.example.zousheng.fleetingtime;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Zou Sheng on 2016/3/19.
 */
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private List<Student> mDatas;
    private Context context;

    public StudentAdapter(List<Student> mDatas, Context context) {
        this.context=context;
        this.mDatas = mDatas;
    }

    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Student student=mDatas.get(position);
        holder.name.setText(student.getName());
        holder.number.setText(student.getNumber());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,InformationActivity.class);
                intent.putExtra("name",student.getName());
                intent.putExtra("number",student.getNumber());
                intent.putExtra("qq",student.getQq());
                intent.putExtra("telephone",student.getTelephone());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout item;
        TextView name,number;
        ImageView edit;
        public ViewHolder(View itemView) {
            super(itemView);
            item= (RelativeLayout) itemView.findViewById(R.id.item);
            name= (TextView) itemView.findViewById(R.id.student_name);
            number= (TextView) itemView.findViewById(R.id.student_number);
        }
    }
}
