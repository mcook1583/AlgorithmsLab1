public class TimeTest {

	public static void main(String[] args) {
		for(int n=12;n<18;n++){
			long time_prev = System.nanoTime();
			Graph graph = new Graph(n, 0.5);
		    Colouring colouring = graph.bestColouring(3);
			double time = (System.nanoTime()-time_prev)/1000000000.0;
			System.out.println(time);
		}
	}

}
