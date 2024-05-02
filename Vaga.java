package bergue;

public class Vaga extends Quarto {
	private int IdVaga;
	private String Status, Posição, Tipo;
	
	public int getIdVaga() {
		return IdVaga;
	}

	public void setIdVaga(int idVaga) {
		IdVaga = idVaga;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getPosição() {
		return Posição;
	}

	public void setPosição(String posição) {
		Posição = posição;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

}
