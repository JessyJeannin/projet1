package fr.Dawan.projet1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculTest extends TestCase{

	@Test
	public void testSomme() {
		assertEquals(3, Calcul.somme(2, 1));
		
	}

}
