package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Bisiesto;
import main.validar;

class TestValidar {

	@Test
	void testDni1() {
		validar v1=new validar();
		assertEquals(true,v1.validar("71525409"));

	}
}
