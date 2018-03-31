package route.com.routesurvey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import route.com.routesurvey.Abstract.CourseItem;
import route.com.routesurvey.Adapters.CoursesListAdapter;

public class Courses extends AppCompatActivity {

    ListView coursesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        coursesList=findViewById(R.id.courses_list);

        final ArrayList<CourseItem>items=new ArrayList<>();
        for(int i=0;i<100;i++)
        items.add(new CourseItem("Android v "+i,"Mohamed Nabil "+i));

        CoursesListAdapter coursesListAdapter=new CoursesListAdapter(items,getLayoutInflater());
        coursesList.setAdapter(coursesListAdapter);


        coursesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Courses.this,items.get(position).getCourseName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

}
