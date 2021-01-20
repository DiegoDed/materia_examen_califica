import org.junit.Assert;
import org.junit.Test;

import ExamenInvalidoException.ExamenInvalidoException;

public class TestDeMateria {

	@Test
	public void asignarUnaNotaCorrecta(){
		Examen e = new Examen();
		
		try {
			e.evaluar(7);
		} catch (notaInvalidaException e1) {
			
			e1.printStackTrace();
		}
	    Assert.assertEquals(7, e.getNota().intValue(), 0.0);
	}
	
	@Test (expected= notaInvalidaException.class)
	public void asignarUnaNotaIncorrecta()throws notaInvalidaException {
		
		Examen e= new Examen();
		
		e.evaluar(11);
		
	}
	
	@Test 
	public void calificarUnExamenCorrecto(){
		Materia e = new Materia();
		
		try {
			e.calificar(1, 7);
		} catch (ExamenInvalidoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (notaInvalidaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Assert.assertEquals(7 , e.getExamen1().getNota().intValue(),0.0);
	}
	
	
	@Test (expected = ExamenInvalidoException.class)
	public void calificaUnExamenIncorrecto()throws ExamenInvalidoException, notaInvalidaException{
		Materia e = new Materia();
		e.calificar(4, 7);
		
	}

}
