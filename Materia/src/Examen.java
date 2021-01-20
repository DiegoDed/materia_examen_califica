
public class Examen {

	private Integer nota;
	
	public Integer getNota() {
		
		return nota;
	}

	public void setNota(Integer nota) {
		
		this.nota = nota;
	}

	public void evaluar( Integer nota)throws notaInvalidaException{
	
		if(nota<=10 &&nota>=1){
		
			this.nota=nota;
		}
		else{
		
			throw new notaInvalidaException();
		
		}
	}
}
