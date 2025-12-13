import java.util.Scanner;
public class Matriz3D{
	public static void main(String args[]){
		Scanner ingreso = new Scanner(System.in);
		int arreglo[][][] = new int[3][3][3];
		int max[]=new int[4];
		int min[]=new int[4];
		int promedio[]=new int[4];
		for(int z=0;z<arreglo.length;z++){
			for(int x=0;x<arreglo[z].length;x++){
				for(int y=0;y<arreglo[x].length;y++){
					System.out.println("ingrese la pos en X="+x+" Y="+y+" Z="+z);
					arreglo[x][y][z]=ingreso.nextInt();
				}			
			}
		}
		max[0]=arreglo[0][0][0];
		min[0]=arreglo[0][0][0];
		max[1]=arreglo[2][0][0];
		min[1]=arreglo[2][0][0];
		max[2]=arreglo[0][2][0];
		min[2]=arreglo[0][2][0];
		max[3]=arreglo[2][2][0];
		min[3]=arreglo[2][2][0];
		for(int z=0;z<arreglo.length;z++){
			for(int x=0;x<arreglo[z].length;x++){
				for(int y=0;y<arreglo[x].length;y++){
					if(x==y && x==z){
						System.out.println("DIAGONAL 0 -> X Y Z= "+x+" "+y+" "+z+" VALOR= "+arreglo[x][y][z]);
						if(max[0]<arreglo[x][y][z]){
							max[0]=arreglo[x][y][z];
						}
						if(min[0]>arreglo[x][y][z]){
							min[0]=arreglo[x][y][z];
						}
						promedio[0]=promedio[0]+arreglo[x][y][z];
					}
					if(y == z && x == 2 - y){
						System.out.println("DIAGONAL 1 -> X Y Z= "+x+" "+y+" "+z+" VALOR= "+arreglo[x][y][z]);
						if(max[1]<arreglo[x][y][z]){
							max[1]=arreglo[x][y][z];
						}
						if(min[1]>arreglo[x][y][z]){
							min[1]=arreglo[x][y][z];
						}
						promedio[1]=promedio[1]+arreglo[x][y][z];
					}
					if(x == z && y == 2 - x){
						System.out.println("DIAGONAL 2 -> X Y Z= "+x+" "+y+" "+z+" VALOR= "+arreglo[x][y][z]);
						if(max[2]<arreglo[x][y][z]){
							max[2]=arreglo[x][y][z];
						}
						if(min[2]>arreglo[x][y][z]){
							min[2]=arreglo[x][y][z];
						}
						promedio[2]=promedio[2]+arreglo[x][y][z];
					}
					if(x == y && z == 2 - x){
						System.out.println("DIAGONAL 3 -> X Y Z= "+x+" "+y+" "+z+" VALOR= "+arreglo[x][y][z]);
						if(max[3]<arreglo[x][y][z]){
							max[3]=arreglo[x][y][z];
						}
						if(min[3]>arreglo[x][y][z]){
							min[3]=arreglo[x][y][z];
						}
						promedio[3]=promedio[3]+arreglo[x][y][z];
					}		
				}
			}
		}
		promedio[0]=promedio[0]/3;
		promedio[1]=promedio[1]/3;
		promedio[2]=promedio[2]/3;
		promedio[3]=promedio[3]/3;
			
		for(int i=0;i<4;i++){
			System.out.println("Para la DIAGONAL="+i+" los valores son max:"+max[i]+" min:"+min[i]+" prom:" +promedio[i]);
		}


	}
}