package pdm.recife.ifpe.edu.br.secrecheat.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pdm.recife.ifpe.edu.br.secrecheat.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConversationsFragment extends Fragment {


    public ConversationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conversations, container, false);
    }

}
