package com.example.jhanarly.examenlp3_unidad_i;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ListViewAdapter adapter;
    ListView lista;
    String[] Restaurante = new String[]{
            "Juane $10.00",
            "Pescado a la hoja $12.00",
            "Tilapia $10.00",
            "Chaufa $5.00",
            "Patarashka $15.00",
            "Tacacho con cecina $5.00"
    };
    int[] imagenes = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listView1);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Restaurante);

        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent ii = new Intent(getApplicationContext(), plato_1.class);
                        startActivity(ii);
                        break;
                    case 1 :
                        Intent iii = new Intent(getApplicationContext(), plato_2.class);
                        startActivity(iii);

                        break;
                    case 2:
                        Intent iiii = new Intent(getApplicationContext(), plato_3.class);
                        startActivity(iiii);

                        break;
                    case 3 :
                        Intent iiiii = new Intent(getApplicationContext(), plato_4.class);
                        startActivity(iiiii);

                        break;
                    case 4 :
                        Intent iiiiii = new Intent(getApplicationContext(), plato_5.class);
                        startActivity(iiiiii);

                        break;
                    case 5 :
                        Intent iiiiiii = new Intent(getApplicationContext(), plato_6.class);
                        startActivity(iiiiiii);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, Restaurante, imagenes);
        lista.setAdapter(adapter);



        Resources res = getResources();

        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("inicio");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("platos 1");
        tabs.addTab(spec);
        spec = tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("platos 2");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.herramientas:
                return true;
            //
            case R.id.reportes:
                return true;
            //
            case R.id.cliente:
                Toast cl = Toast.makeText(getApplicationContext(), "bienvenido a cliente", Toast.LENGTH_SHORT);
                cl.show();
                return true;

            case R.id.producto:
                Toast pr = Toast.makeText(getApplicationContext(), "bienvenido a producto", Toast.LENGTH_SHORT);
                pr.show();
                return true;
            case R.id.categoria:
                Toast cat = Toast.makeText(getApplicationContext(), "bienvenido a categoria", Toast.LENGTH_SHORT);
                cat.show();
                return true;

            case R.id.vendodor:
                Toast ven = Toast.makeText(getApplicationContext(), "bienvenido a vendedor", Toast.LENGTH_SHORT);
                ven.show();
                return true;
            case R.id.repProducto:
                Toast rpro = Toast.makeText(getApplicationContext(), "bienvenido a Reporte de productos", Toast.LENGTH_SHORT);
                rpro.show();
                return true;
            case R.id.repVenta:
                Toast rven = Toast.makeText(getApplicationContext(), "bienvenido a Reportes de ventas", Toast.LENGTH_SHORT);
                rven.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }


    public void plato_1(View view) {
        startActivity(new Intent(this, plato_1.class));
    }

    public void plato_2(View view) {
        startActivity(new Intent(this, plato_2.class));
    }

    public void plato_3(View view) {
        startActivity(new Intent(this, plato_3.class));
    }

    public void plato_4(View view) {
        startActivity(new Intent(this, plato_4.class));
    }

    public void plato_5(View view) {
        startActivity(new Intent(this, plato_5.class));
    }

    public void plato_6(View view) {
        startActivity(new Intent(this, plato_6.class));
    }
}