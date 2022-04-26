package test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Aluno;

class AlunoTest {

	private Aluno aluno;
	@BeforeEach
	public void setUp() {
		 aluno = new Aluno("9865", "marvin", 5.0, 5.0, 5.0);
	}
	@Test
	public void mediaTest_allValid_sucess() {
		
		double expected = 5.0;
		assertEquals(expected,aluno.media());
	}

}
