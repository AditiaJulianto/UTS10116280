package com.julian.uts10116280.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.julian.uts10116280.R;
import com.julian.uts10116280.model.Teman;
import com.julian.uts10116280.presenter.kontakPresenter;

public class kontakFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_kontak, container, false);
        kontakPresenter pre = new kontakPresenter();
        String a = pre.testTambahTeman();
        TextView t = view.findViewById(R.id.tv_home);
//        Log.d("tag","STRING A = "+a);
        //t.setText(a);

        Teman[] teman = pre.TampilSemua();
        for (Teman b : teman) {
            Log.d("tag","Teman = "+b.getNim());
        }
        return view;
    }
}
