public class Persona{
	String nombre;
	String genero;
	int edad_an;
	int altura_cm;
	int peso_kg;
	String objetivo;
	String actividad_sem;
	int tmb;

	Persona (String nombre, String genero, int edad_an, int altura_cm, int peso_kg, String objetivo, String actividad_sem, int tmb){
		this.nombre=nombre;
		this.genero=genero;
		this.edad_an=edad_an;
		this.altura_cm=altura_cm;
		this.peso_kg=peso_kg;
		this.objetivo=objetivo;
		this.actividad_sem=actividad_sem;
		this.tmb=tmb;
	}

	public void tasamb (){
		if (genero == "hombre"){
			tmb = 10 * peso_kg + 6 * altura_cm + 5 * edad_an + 5;
			System.out.println("La Tasa Metabólica Basal (TBM) de "+nombre+" es de "+ tmb+ " kcal");
		}else{
			tmb = 10 * peso_kg + 6 * altura_cm + 5 * edad_an - 161;
			System.out.println("La Tasa Metabólica Basal (TBM) de "+nombre+" es de "+ tmb+ " kcal");
		}	
	}

}