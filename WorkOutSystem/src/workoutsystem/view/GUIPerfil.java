package workoutsystem.view;

import workoutsystem.view.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class GUIPerfil extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil);
	}

	@Override
	public void onClick(View evento) {
		switch (evento.getId()) {
		case R.id.btn_manipularperfil:
			startActivity(new Intent("workoutsystem.view.MANIPULARPERFIL"));
			break;
		case R.id.btn_medidas:
			startActivity(new Intent("workoutsystem.view.MEDIDAS"));
			break;
		case R.id.btn_status:
			startActivity(new Intent("workoutsystem.view.STATUS"));
			break;
		}
	}


}
