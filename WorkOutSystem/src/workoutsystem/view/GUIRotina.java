package workoutsystem.view;

import workoutsystem.view.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.view.View;
public class GUIRotina extends Activity implements View.OnClickListener{
	
	private TabHost hostrotina;
	private TabSpec speccalendario;
	private TabSpec spectreino;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rotina);
		criarTab();
	}
	
	public void criarTab(){

		hostrotina = (TabHost) findViewById(R.id.hostrotina);
		hostrotina.setup();

		spectreino = hostrotina.newTabSpec("tabrotina");
		spectreino.setContent(R.id.tabtreino);
		spectreino.setIndicator("Treinos");
		hostrotina.addTab(spectreino);

		speccalendario = hostrotina.newTabSpec("tabcalendario");
		speccalendario.setContent(R.id.tabcalendario);
		speccalendario.setIndicator("Calendário");
		hostrotina.addTab(speccalendario);
	}

	@Override
	public void onClick(View evento) {
		switch (evento.getId()) {
		case R.id.btn_realizar:
			startActivity(new Intent("workoutsystem.view.PRINCIPAL"));
			break;
		}
		
	}



}
