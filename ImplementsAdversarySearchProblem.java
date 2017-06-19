
public class ImplementsAdversarySearchProblem<S extends  ImplementsAdversarySearchState> implements AdversarySearchProblem{


    public S initialState(){
    	ImplementsAdversarySearchState result = new ImplementsAdversarySearchState();
    	return result;
    }
    

    public List<S> getSuccessors(S state){
    	List<S> listSuccessors = new List();
    	for (int i=0;i<state.board.length;i++){
    		for (int j =0;j<state.board.length;j++){
    			if((state.board[i][j]==null)&&(state.turn == 1)){
    				state.board [i][j]= "O";
    				//state.turn = 2;//deberiamos cambiar el turno una vez que se selecciono la jugada
    				state.count_piece = state.count_piece - 1;
    				ImplementsAdversarySearchState auxBoard = new ImplementsAdversarySearchState(state.board,state.count_piece,state.turn,);
    			}
    			if((state.board[i][j]==null)&&(state.turn == 2)){
    				state.board [i][j]= "X";
    				//state.turn = 1; o no?
    				state.count_piece = state.count_piece - 1;
    				ImplementsAdversarySearchState auxBoard = new ImplementsAdversarySearchState(state.board,state.count_piece,state.turn,);
    			}
                listSuccessors.add(auxBoard);
    		}
    	}
    }
        
	
    public boolean end(S state){//como vemos si ganos el juego
    	if((state.count_piece == 0) ||(getSuccessors(state).length() == 0 ))
    		return true;
    	else
    		return false;
    }


    public int value(S state){

    }
 
    public int minValue();
    
    
    public int maxValue();
}