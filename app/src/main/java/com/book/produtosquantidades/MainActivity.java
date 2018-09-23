package com.book.produtosquantidades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Produto>         produto;
    private EditText              editNomeProduto;
    private EditText              editCategoria;
    private EditText              editQuantidade;
    private EditText              editValor;
    private ListView              listaProdutos;
    private ArrayAdapter<Produto> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produto         = new ArrayList<>();
        editNomeProduto = findViewById(R.id.editNomeProduto);
        editCategoria   = findViewById(R.id.editCategoria);
        editQuantidade  = findViewById(R.id.quantidade);
        editValor       = findViewById(R.id.unitario);
        listaProdutos   = findViewById(R.id.listaProdutos);
        atualizarProduto();

    }

    private void atualizarProduto() {
        if(adapter == null){
            adapter = new ProdutoAdapter(getApplicationContext(), R.layout.produto_item, produto);
            listaProdutos.setAdapter(adapter);
        }else{
            adapter.notifyDataSetChanged();
        }
    }



    public void salvarProduto(View v){
        String nomeProduto    = editNomeProduto.getText().toString();
        String nomeCategoria  = editCategoria.getText().toString();
        String nomeQuantidade = editQuantidade.getText().toString();
        String nomeValor      = editValor.getText().toString();

        Produto p = new Produto();
        p.setNomeProduto(nomeProduto);
        p.setCategoria(nomeCategoria);
        p.setQuantidade(Long.parseLong(nomeQuantidade));
        p.setValor(Long.parseLong(nomeValor));

        produto.add(p);
        atualizarProduto();
    }
}
