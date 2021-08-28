package org.acn.interfaceAbstract;

public class TestClass {

	public static void main(String[] args) {
		/*Demo of Interface*/
		Shape inst = new ShapeImpl();
		inst.display();
		inst.draw();
		
		/*Demo of Abstract*/
		//AbstractImpl ai= new AbstractImpl();
		AbstractDemo ai= new AbstractImpl();
		ai.display();
		ai.setValue();

	}

}
