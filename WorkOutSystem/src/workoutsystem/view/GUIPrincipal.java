package workoutsystem.view;

import workoutsystem.view.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;


public class GUIPrincipal extends Activity implements View.OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_tela_principal, menu);
		return true;
	}



	@Override
	public void onClick(View v) {
		switch (v.getId()){
		
		case R.id.btn_perfil:
			startActivity( new Intent("workoutsystem.view.PERFIL"));
		break;

		case R.id.btn_exercicio:
			startActivity(new Intent("workoutsystem.view.EXERCICIO"));
		break;

		case R.id.btn_rotina:
			startActivity(new Intent("workoutsystem.view.ROTINA"));
		break;

		case R.id.btn_planilhas:
			startActivity(new Intent("workoutsystem.view.FICHA"));
		break;

		
		case R.id.btn_evolucao:
			startActivity(new Intent("workoutsystem.view.EVOLUCAO"));
			break;
		
		case R.id.btn_ajuda:
			startActivity(new Intent("workoutsystem.view.AJUDA"));
			break;
		case R.id.btn_sobre:
			startActivity(new Intent("workoutsystem.view.SOBRE"));
			break;
		}


	}




}
