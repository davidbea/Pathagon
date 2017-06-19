public class Main{
	


	public static void main(String[] args){

		char aux[][] = new char[(char) (Math.random()*9+1)][(char) (Math.random()*9+1)];
		Matriz nuevaMatriz = new Matriz(aux);
		//nuevaMatriz.vaciarMatriz();
		nuevaMatriz.imprimirMatriz();

	}


}