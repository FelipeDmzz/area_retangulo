public class Retangulo {
    private double largura;
    private double altura;


    public Retangulo(){
        this.largura = largura;
        this.altura = altura;
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void calcularArea(){
       double area = (altura * largura);
       System.out.println("\nA área é: " + area);
    }
    public void calcularPerimetro(){
        double perimetro = 2*(altura + largura);
        System.out.println("O perimetro é: " + perimetro);
    }
    public void mostrarDados(){
        System.out.println("A largura é: " + largura);
        System.out.println("A altura é: " + altura);
    }
}
