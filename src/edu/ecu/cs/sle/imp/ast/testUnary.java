package edu.ecu.cs.sle.imp.ast;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class testUnary {

	private static Interpreter ast;
	
	@BeforeClass
	public static void setUpClass() {
		ast = new Interpreter();
	}
	//
	@Test
	public void testUnary() {
		IntegerValue iv = ast.interpret("-2");
		assertEquals("2",-2, iv.getIntValue().intValue());
	}	
}

