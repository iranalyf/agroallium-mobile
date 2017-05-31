package br.com.agroallium.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.com.agroallium.R;

/**
 * Created by alyfiran on 25/05/17.
 */

public class ProdutosViewHolder extends RecyclerView.ViewHolder {

    final TextView nome;
    final TextView preco;

    public ProdutosViewHolder(View view) {
        super(view);
        nome = (TextView) view.findViewById(R.id.nomeDoProduto);
        preco = (TextView) view.findViewById(R.id.precoDoProduto);
    }

}
