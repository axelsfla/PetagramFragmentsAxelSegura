package com.coursera.sacbe.petagramaxelsegura.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.coursera.sacbe.petagramaxelsegura.R;
import com.coursera.sacbe.petagramaxelsegura.adapter.FotoMascotaAdaptador;
import com.coursera.sacbe.petagramaxelsegura.adapter.MascotaAdaptador;
import com.coursera.sacbe.petagramaxelsegura.pojo.FotoMascota;
import com.coursera.sacbe.petagramaxelsegura.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private ImageView imgvFotoFrg;
    private TextView tvNombreFrg;

    private ArrayList<FotoMascota> fotosMascota;
    private RecyclerView rvMascotaFrg;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        imgvFotoFrg = (ImageView) v.findViewById(R.id.imgvFotoFrg);
        tvNombreFrg = (TextView) v.findViewById(R.id.tvNombreFrg);

        imgvFotoFrg.setImageResource(R.drawable.husky);
        tvNombreFrg.setText("Miky");

        rvMascotaFrg = (RecyclerView) v.findViewById(R.id.rvMascotaFrg);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        //glm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotaFrg.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        FotoMascotaAdaptador adaptador = new FotoMascotaAdaptador(fotosMascota, getActivity());
        rvMascotaFrg.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        fotosMascota = new ArrayList<FotoMascota>();
        fotosMascota.add(new FotoMascota(R.drawable.husky1,10));
        fotosMascota.add(new FotoMascota(R.drawable.husky2,3));
        fotosMascota.add(new FotoMascota(R.drawable.husky3,7));
        fotosMascota.add(new FotoMascota(R.drawable.husky4,1));
        fotosMascota.add(new FotoMascota(R.drawable.husky5,6));
        fotosMascota.add(new FotoMascota(R.drawable.husky6,2));
        fotosMascota.add(new FotoMascota(R.drawable.husky7,9));
        fotosMascota.add(new FotoMascota(R.drawable.husky8,1));
        fotosMascota.add(new FotoMascota(R.drawable.husky9,8));

    }

}
