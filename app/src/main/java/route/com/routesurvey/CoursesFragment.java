package route.com.routesurvey;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import route.com.routesurvey.Abstract.CourseItem;
import route.com.routesurvey.Adapters.CoursesListAdapter;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 4/7/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class CoursesFragment extends Fragment {
    ListView coursesList;


   public CoursesFragment(){

    }

    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_courses,null,false);
        coursesList=rootView.findViewById(R.id.courses_list);
        final ArrayList<CourseItem> items=new ArrayList<>();
        for(int i=0;i<100;i++)
            items.add(new CourseItem("Android v "+i,"Mohamed Nabil "+i));

        CoursesListAdapter coursesListAdapter=new CoursesListAdapter(items,getLayoutInflater());
        coursesList.setAdapter(coursesListAdapter);


        coursesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(Courses.this,items.get(position).getCourseName(),Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;

    }
}
