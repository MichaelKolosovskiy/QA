
public class FloydsTriangle {
public static void main(String[] args) {
	char SPACE = ' ';
	int i =1;
	for (int j = 1; j<=6; j++) {
		for( int c = 0; c < j; c++) { 
			System.out.print(i + SPACE); 
			i++;
		}System.out.println();
	}
}
}	
