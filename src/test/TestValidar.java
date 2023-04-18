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
	@Test
	void testDni2() {
		validar v1=new validar();
		assertEquals(false,v1.validar("001525409"));

	}
	
	@Test
	void testDni3() {
		validar v1=new validar();
		assertEquals(false,v1.validar("0000"));

	}
	
	@Test
	void testDni4() {
		validar v1=new validar();
		assertEquals(false,v1.validar("wreger"));

	}
	
	
}

