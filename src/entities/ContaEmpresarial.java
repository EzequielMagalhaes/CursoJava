//	USADO NA CLASSE _44_Heranca //
package entities;
// classe 'ContaEmpresarial' vai ter todos os dados e comportamentos da 'Conta'.
public class ContaEmpresarial extends Conta{
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getlimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setlimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void Emprestimo(double quantia) {
		if(quantia <= limiteEmprestimo) {			
			saldo += quantia - 10.0;
		}
	}
}