package cn.edu.bistu.cs.se.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {
    private final static String SNAMWES="snames";
    private final static String  INFOS="infos";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] snames={"张小红","刘亮","李山","赵梅"};
        String[] infos={"20140001，女，18岁，软工1班","20140002，男，19岁，软工2班","20140003，男，19岁，软工3班","20140004，女，18岁，软工4班"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<snames.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(SNAMWES, snames[i]);
            item.put(INFOS, infos[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{SNAMWES,INFOS},new int[]{R.id.txtSnames,R.id.txtInfos});

        ListView list=(ListView)findViewById(R.id.list_item);

        list.setAdapter(adapter);
    }
}