package in.prec.logicalprograms.series.main;
import in.prec.logicalprograms.series.Series;
public class MainSeries {
	public static void main(String[] args) {
		Series series = new Series();
		
		series.setLimit(10);
//		series.printFibonnaciSeries();	
		series.printQubeSquareSeries();
	}
}
