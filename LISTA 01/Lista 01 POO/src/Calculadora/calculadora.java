package Calculadora;

public class calculadora {

	public float parc1, parc2, resultado;

	public String operador;
	public float getResultado() {
	return resultado;
	}
	public void setResultado(float resultado) {
	this.resultado = resultado;
	}
	public float getParc1() {
	return parc1;
	}
	public void setParc1(float parc1) {
	this.parc1 = parc1;
	}
	public float getParc2() {
	return parc2;
	}
	public void setParc2(float parc2) {
	this.parc2 = parc2;
	}
	public String getOperador() {
	return operador;
	}
	public void setOperador(String operador) {
	this.operador = operador;
	}

	public void Leitura(float parc)
	{
	if (this.parc1 == 0.0f)
	{
	this.setParc1(parc);
	} else {
	this.setParc2(parc);
	}
	}

	public void Operacao(String oper)
	{
	this.setOperador(oper);
	}

	public float Igualar()
	{switch (this.getOperador())
		{
		case ("/"):
		if (this.parc2 == 0.0f)
		{
		this.setResultado(0);
		} else {
		this.setResultado
		 (this.getParc1()/this.getParc2());
		}
		break;
		case ("*"):
		this.setResultado
		 (this.getParc1()* this.getParc2());
		break;
		case ("+"):
		this.setResultado
		 (this.getParc1()+ this.getParc2());
		break;
		case ("-"):
		this.setResultado
		 (this.getParc1()- this.getParc2());
		break;
		}
		return this.resultado;
		}
		}

