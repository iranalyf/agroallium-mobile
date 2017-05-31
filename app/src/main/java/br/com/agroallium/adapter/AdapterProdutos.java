package br.com.agroallium.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.agroallium.R;
import br.com.agroallium.models.Produto;


public class AdapterProdutos extends RecyclerView.Adapter {

    private List<Produto> produtos;
    Context context;

    public AdapterProdutos(List<Produto> produtos, Context context) {
        this.produtos = produtos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.produto_list_item, parent,false);

        ProdutosViewHolder holder= new ProdutosViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewholder, int position) {

        ProdutosViewHolder holder = (ProdutosViewHolder) viewholder;

        Produto produto = produtos.get(position);

        holder.nome.setText(produto.getNome());
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }
}
