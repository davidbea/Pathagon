

public class Matriz{

	private int colum = 8;
	private int fil = 8;
	private char[][] matrix = new char[fil][colum];



	public Matriz(){
	}

	public Matriz(char[][] other){
		matrix = other;
	}

	/*vaciarMatriz : Inicializa la matriz por defecto
	*
	*
	*/
	private void vaciarMatriz(){
	
		for (int f = 1; f<fil; f++){
			for (int c = 1; c<colum; c++){
				matrix[f][c] = '_';
			}
		}
	}	


	/*
	*
	*
	*
	*/



	/*private void cargarMatriz(int[] arrayPC, int[] arrayUser){
		
		int f =1;
		int c =1;
		int indexArr = 1;
		int filCorriente = 1;
		int colCorriente = 1;
		int marcaFinal = 7;
		while (indexArr < 50){
				if (arrayPC[indexArr] != '') {
					matrix[filCorriente][colCorriente] = "_arrayPC[indexArr]_";
				}
				else{
					if (arrayUser[indexArr] != '') {
						matrix[filCorriente][colCorriente] = "_arrayUser[indexArr]_";
					}
				}	
			if (indexArr > marcaFinal){ 
				filCorriente = 2;
				colCorriente = 1;
				marcaFinal= marcaFinal*2;
			}else{
				colCorriente=+1;
			}
			indexArr++;
		} //end while

	}*/


d
	private void imprimirMatriz(){
		
		for(int f=1;f<8;f++){
			for(int c=1;c<8;c++){
		 		System.out.print( matrix[f][c] ); 
		 	}
		}
	}



}	//End class

	