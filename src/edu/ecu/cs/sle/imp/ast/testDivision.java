package edu.ecu.cs.sle.imp.ast;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class testDivision {

	private static Interpreter ast;
	
	@BeforeClass
	public static void setUpClass() {
		ast = new Interpreter();
	}
	//
	@Test
	public void testDivision() {
		IntegerValue iv = ast.interpret("2/1");
		assertEquals("2/1",2, iv.getIntValue().intValue());
	}	
}

