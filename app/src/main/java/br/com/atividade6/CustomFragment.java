package br.com.atividade6;



import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v4.app.Fragment;


public class CustomFragment extends Fragment {

    private String nome;
    private int idImagem;

    public static CustomFragment newInstance(String nome, int idImagem) {
        CustomFragment fragment = new CustomFragment();
        fragment.nome = nome;
        fragment.idImagem = idImagem;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_custom, container, false);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(idImagem);
        getActivity().setTitle(nome);

        return view;
    }

}
