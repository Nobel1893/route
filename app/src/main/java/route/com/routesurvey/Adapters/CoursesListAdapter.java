package route.com.routesurvey.Adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import route.com.routesurvey.Abstract.CourseItem;
import route.com.routesurvey.R;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 3/31/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class CoursesListAdapter extends BaseAdapter {

    ArrayList<CourseItem> items;

    LayoutInflater inflater;


    public CoursesListAdapter(ArrayList<CourseItem>items,LayoutInflater inflater){
        this.items=items; //to make Adapter work it should has layout inflater to create views
        this.inflater=inflater; //and items(content) to bind content in views

    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemview;
        Viewholder holder;
        if (convertView==null) {
            Log.e("Courses list","view is null== creating new view");
            //1- create view
            itemview = inflater.inflate(R.layout.course_item_view, null);
            holder=new Viewholder();
            holder.courseInstructor=itemview.findViewById(R.id.instructor_name);
            holder.coursename=itemview.findViewById(R.id.course_name);
            itemview.setTag(holder);
        }else{
            Log.e("Courses list","i'm going to recycle the old view");
            itemview=convertView;
        holder=(Viewholder) convertView.getTag();
      }

        //2-bind data in view
        CourseItem dataitem=items.get(position);
        holder.coursename.setText(dataitem.getCourseName());
        holder.courseInstructor.setText(dataitem.getCourseInstructor());

        return itemview;
    }

    static class Viewholder{
     public  TextView  coursename;
     public  TextView courseInstructor;

    }

}
