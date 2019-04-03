package cadastro.cinema;

public class Sala {
	/*essa classe e' composta por uma matriz de caracteres*/
	public int linhas;
	public int colunas;
	public int linhasVip;
	public char[][] poltronas;
	
	public Sala(int linhas, int colunas, int linhasVip) {
		
		this.linhas = linhas;
		this.colunas = colunas;
		this.linhasVip = linhasVip;
		this.poltronas = new char[linhas][colunas];
		
		int i; int j;
		for(i = 0; i<linhas; i++) {
			for(j = 0; j<colunas; j++) {
				if(i <= linhasVip -1) {
					poltronas[i][j] = 'V';
				} else {
					poltronas[i][j] = 'L';
				}
			}
		}	
	}
	
	public void reservar(int i, int j) {
		if (this.poltronas[i][j] != 'R') {
			this.poltronas[i][j] = 'R';
		}
	}
	
	public void reservar() {
		
		int i = this.linhas;
		int j = this.colunas;
		
		for(i = 0; i<linhas; i++) {
			for(j = 0; j<colunas; j++) {
				if (this.poltronas[i][j] != 'R') {
					this.poltronas[i][j] = 'R';
					return;
				}
			}
		}
	}
	
	public void imprimirSala() {
		
		int i = this.linhas;
		int j = this.colunas;
		
		for(i = 0; i<linhas; i++) {
			for(j = 0; j<colunas; j++) {
				System.out.printf("%c", this.poltronas[i][j]);
			}
			System.out.printf("\n");
		}
	}
	

}
