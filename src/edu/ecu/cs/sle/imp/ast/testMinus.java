package edu.ecu.cs.sle.imp.ast;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class testMinus {

	private static Interpreter ast;
	
	@BeforeClass
	public static void setUpClass() {
		ast = new Interpreter();
	}
	//
	@Test
	public void testMinus() {
		IntegerValue iv = ast.interpret("2-1");
		assertEquals("2-1",1, iv.getIntValue().intValue());
	}	
}

