package in.prec.logicalprograms.pyramids;

public class Pyramids {

	int level;
	
	public Pyramids() {}
	
	public Pyramids(int level) {
		this.level=level;
	}
	
	public void setLevel(int level) {
		this.level=level;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void printPyramidStructure1() {
		int i=1;
		for(int row=1;row<=level;row++) {
			for(int space=1;space<=level-row;space++)
				System.out.print("\t");
			for(int col=1;col<=row;col++)
				System.out.print(i++ + "\t\t");
			
			System.out.println("\n");
		}
	}
	
	public void printPyramidStructure2() {
		int number=1;
		char charVariable='A';
		for(int row=1;row<=level;row++) {
			for(int space=1;space<=level-row;space++)
				System.out.print("\t");
			for(int col=1;col<=(row*2)-1;col++) {
				if(row%2==0)
					System.out.print(charVariable++ + "\t");
				else
					System.out.print(number++ + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public void printPyramidStructure3() {
		int number=1;
		char charVariable='A';
		for(int row=1;row<=level;row++) {
			for(int space=1;space<=level-row;space++)
				System.out.print("\t");
			for(int col=1;col<=(row*2)-1;col++) {
				if(row%2==0)
					if(col%2==0)
						System.out.print(number++ + "\t");
					else
						System.out.print(charVariable++ + "\t");
				else
					if(col%2==0)
						System.out.print(charVariable++ + "\t");
					else
						System.out.print(number++ + "\t");
			}
			System.out.println("\n");
		}
	}
}
