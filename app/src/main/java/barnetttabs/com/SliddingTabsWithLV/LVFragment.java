package barnetttabs.com.SliddingTabsWithLV;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Dave on 05/05/2015.
 */
public class LVFragment extends Fragment {




    public interface Callback{
        public void onItemSeleted(int item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View  rootView = inflater.inflate(R.layout.fragment_lv, container,false);

        ListView listView = (ListView)rootView.findViewById(R.id.listview);

        String[] lvData = getResources().getStringArray(R.array.items);

        ArrayAdapter itemsAdapter =
                new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, lvData);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){

                ((Callback)getActivity()).onItemSeleted(position);

            }
        });



        return rootView;
    }



}
