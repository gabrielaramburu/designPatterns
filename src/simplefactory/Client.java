package simplefactory;

public class Client {
	private SimpleFactory factory;
	private ShapedGraph graph;
	
	public Client(SimpleFactory factory) {
		this.factory = factory;
	}
	
	public void showGraph(ShapedGraph.Shape shape) throws IllegalAccessException {
		graph = factory.createShapedGraph(shape);
		graph.drawGraph();
	}
}
