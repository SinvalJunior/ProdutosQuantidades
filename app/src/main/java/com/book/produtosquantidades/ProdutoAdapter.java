package com.book.produtosquantidades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ProdutoAdapter extends ArrayAdapter<Produto> {


    private int rId;


    public ProdutoAdapter(Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);
        this.rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent) {
        View mView = currentView;

        if (mView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId, null);
        }

        Produto produto = getItem(position);

        TextView textNomeProduto = mView.findViewById(R.id.textNomeProduto);
        TextView textCategoria   = mView.findViewById(R.id.editCategoria);
        TextView textQuantidade  = mView.findViewById(R.id.quantidade);
        TextView textValor       = mView.findViewById(R.id.unitario);

        textNomeProduto.setText(produto.getNomeProduto());
        textCategoria.setText(produto.getCategoria());
        textQuantidade.setText((int) produto.getQuantidade());
        textValor.setText((int) produto.getValor());

        return mView;

    }

}
