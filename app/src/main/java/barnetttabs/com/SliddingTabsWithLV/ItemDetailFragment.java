package barnetttabs.com.SliddingTabsWithLV;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Dave on 06/05/2015.
 */
public class ItemDetailFragment extends Fragment {

    static final String ITEM_POSITION="item";

    private int item_pos;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        Bundle arguments = getArguments();
        if(arguments!=null){
            item_pos = arguments.getInt(ItemDetailFragment.ITEM_POSITION);
        }

        View rootView = inflater.inflate(R.layout.fragment_itemdetail, container,false);


        TextView itemText = (TextView) rootView.findViewById(R.id.item_text);

        String Items[] = getResources().getStringArray(R.array.items);

        itemText.setText(Items[item_pos]);


        return rootView;



    }




}
