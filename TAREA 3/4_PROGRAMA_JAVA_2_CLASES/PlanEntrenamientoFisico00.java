public class PlanEntrenamientoFisico00{
	public static void main(String args[]){
		System.out.println("+ + + PROGRAMA ENTRENAMIENTO FÍSICO PERSONAL + + +");
		Persona liz = new Persona("Liz","mujer",35,162,56,"Aumento muscular","Moderado",0);
		Persona fran = new Persona("Fran","hombre",33,172,81,"Disminuir grasa","Ligero",0);
		
		Entrenamiento altoH = new Entrenamiento("Fuerte",6,30,2000,fran);
		Entrenamiento medioH = new Entrenamiento("Moderado",4,20,1800,fran);
		Entrenamiento bajoH = new Entrenamiento("Mínimo",2,20,1700,fran);
	
		Entrenamiento altoM = new Entrenamiento("Fuerte",6,30,1800,liz);
		Entrenamiento medioM = new Entrenamiento("Moderado",4,20,1500,liz);
		Entrenamiento bajoM = new Entrenamiento("Mínimo",2,20,1300,liz);
		
		System.out.println("- - -");

		liz.tasamb();
		fran.tasamb();

		System.out.println("- - -");

		liz.ingesta_diaria_cal();
		fran.ingesta_diaria_cal();

	}

}