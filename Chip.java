public class Chip{
	private int i;
	private int j;
	private char id;

	public Chip(int row, int column, char type){
		this.i = row;
		this.j = column;
		this.id = type; 
	}

	public Chip getChip(){
		return this;
	}

	public void setChip(int row, int column, char type){
		this.i = row;
		this.j = column;
		this.id = type; 
	}

}