package cop4656.jrdbnntt.com.groupproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nav(View view)
    {
        Intent intent = new Intent(this, NavigateToCourseActivity.class);
        startActivity(intent);

    }

    public void addClass(View view)
    {
        Intent intent = new Intent(this, AddNewCourseActivity.class);
        startActivity(intent);

    }

    public void view1(View view)
    {
        Intent intent = new Intent(this, CoursesListActivity.class);
        startActivity(intent);

    }
}
