public class ImplementsAdversarySearchState implements AdversarySearchState{

	private char[][] table;
	private int count_piece;
	private int turn;
	private int priorityState;

	public ImplementsAdversarySearchState(){
		table = [];
		count_piece = 28;
		turn = 2;
		priorityState = 0;
	}

	public ImplementsAdversarySearchState(char[][] table, int count_piece, int turn){
		this.table = table;
		this.count_piece = count_piece;
		this.turn = turn;
		priorityState = 0;
	}

	public ImplementsAdversarySearchState(char[][] table, int count_piece, int turn,int priorityState){
		this.table = table;
		this.count_piece = count_piece;
		this.turn = turn;
		this.priorityState = priorityState;
	}

	public boolean isMax (){
		if (this.turn == 1)
			return true;
		else
			return false;
	}

	public boolean equals (ImplementsAdversarySearchState other){
		boolean aux=true;
		int i=0;
		while ( i<7 && aux){
			j=0;
			while (j<7 && aux){
				if (this.table[i][j] =! other.table[i][j])
					aux = false;
				j++;
			}
			i++;
		}
		return aux;
	}

	public String toString(){
		for (int i=0; i <7;i++){
			for(int j =0;j<7;j++;){
				System.out.println("["this.table[i][j]"]");
			}
		}
	}

	public Object ruleApplied(){//regla x la cual llego al estado actual

	}
} 