package simplefactory;

public class SimpleFactory {
	
	public static ShapedGraph createShapedGraph(ShapedGraph.Shape shape) throws IllegalAccessException {
		if (shape == ShapedGraph.Shape.CIRCLE) {
			return new CircleShapedGraph();
		} else if (shape == ShapedGraph.Shape.SQUARE) {
			return new SquareShapedGraph();
		} else if (shape == ShapedGraph.Shape.TRI) {
			return new TriangleShapedGraph();
		} else {
			throw new IllegalAccessException("Unknow type of shape");
		}
	}
}
