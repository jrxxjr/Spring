package br.com.tidicas.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Teste unitário da aplicacao Spring.
 */
public class MainTest extends TestCase {
	
	public MainTest(String testDescricao) {
		super(testDescricao);
	}
	
	public static Test suite() {
		return new TestSuite(MainTest.class);
	}

	public void testMain() {
		assertTrue(true);
	}
	
}