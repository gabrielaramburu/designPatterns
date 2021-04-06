package simplefactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSimpleFactory {
	private SimpleFactory simpleFactory;
	
	@BeforeAll
	void createFactory() {
		simpleFactory = new SimpleFactory();
	}
	
	@Test
	void testClient() throws IllegalAccessException {
		Client client = new Client(simpleFactory);
		client.showGraph(ShapedGraph.Shape.CIRCLE);
	}

}
