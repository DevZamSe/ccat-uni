package com.uni.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFrame extends Fragment {

    public ContentFrame() {
        // Required empty public constructor
    }

    Button button2;
    ImageView imageView4;
    TextView text20;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_content_frame, container, false);

        button2 = view.findViewById(R.id.button2);
        imageView4 = view.findViewById(R.id.imageView4);
        text20 = view.findViewById(R.id.text20);

        Clickeaste(button2);
        Clickeas(imageView4, text20);

        return view;
    }

    private void Clickeas(ImageView imageView4, final TextView text20) {
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text20.setText("Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño.");
            }
        });

        text20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("consola", "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño.");
            }
        });
    }

    private void Clickeaste(Button button2) {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("consola", "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño.");
            }
        });
    }

}
