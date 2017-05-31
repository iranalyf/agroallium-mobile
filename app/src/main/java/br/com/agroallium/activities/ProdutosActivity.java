package br.com.agroallium.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.agroallium.R;
import br.com.agroallium.adapter.AdapterProdutos;
import br.com.agroallium.models.Produto;

public class ProdutosActivity extends AppCompatActivity {

    private ListView listaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerProdutos);

        List<Produto> produtos = new ArrayList<Produto>();

        Produto produto = new Produto();
        produto.setNome("alho bom");
        produto.setPreco(new BigDecimal(2));

        Produto produto2 = new Produto();
        produto2.setNome("alho Dente");
        produto2.setPreco(new BigDecimal(6));

        Produto produto3 = new Produto();
        produto3.setNome("alho de Bahia");
        produto3.setPreco(new BigDecimal(6));

        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);

        recyclerView.setAdapter(new AdapterProdutos(produtos, this));

        RecyclerView.LayoutManager layout = new
                LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layout);
    }
}
