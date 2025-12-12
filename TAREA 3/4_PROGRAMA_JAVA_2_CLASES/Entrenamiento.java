public class Entrenamiento{
	String tipo;
	int veces_semanal;
	int tiempo_daily;
	int alimentacion_cal;
	Persona miTBM;
	Entrenamiento (String tipo, int veces_semanal, int tiempo_daily, int alimentacion_cal, Persona miTBM){
		this.tipo=tipo;
		this.veces_semanal=veces_semanal;
		this.tiempo_daily=tiempo_daily;
		this.alimentacion_cal=alimentacion_cal;
		this.miTBM=miTBM;
	}

	public void ingesta_diaria_cal (){
		for (int i=tiempo_daily; i<=180;i=i+10){
			miTBM.tasamb();	
			int ingesta=miTBM.tmb+i;
			System.out.println("La ingesta recomendada por "+i+" minutos de ejercicio es: "+ingesta);
		}
	}

}