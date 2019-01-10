package com.example.leomar.myapplicationandoirdzzleomar;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuLinterna extends Fragment {

    private final int[] BOTONESMENU={R.id.musica,R.id.linterna,R.id.nivel};

    public MenuLinterna() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View menu;
        menu = inflater.inflate(R.layout.fragment_menu_linterna, container, false);


        ImageButton botonMenu;

        for (int i=0; i<BOTONESMENU.length;i++){
            botonMenu=(ImageButton) menu.findViewById(BOTONESMENU[i]);

            final int QB=i;

            botonMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Activity actividad=getActivity();
                    ((BussMenu)actividad).menu(QB);
                }
            });
        }
        return  menu;
    }

}
