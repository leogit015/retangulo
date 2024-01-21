package rectangle;


public class retangulo {
	
		public double altura;
		public double largura;
	

public double Area() {

	return altura * largura;
}

public double Perimetro() {
	return 2*(largura + altura);
}

public double Diagonal() {
	return Math. sqrt(altura*altura+largura*largura);
}
}


