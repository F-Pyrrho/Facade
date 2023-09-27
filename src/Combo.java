public class Combo {
    Burguer burguer = new Burguer();
    Sobremesa sobremesa = new Sobremesa();
    Bebida bebida = new Bebida();

    public void CriarCombo(int tipo) {
        switch(tipo){
            case 1:
                burguer.setDescricao("X-Bacon");
                burguer.setPreco(15.00);
                burguer.setGramas(200);
                bebida.setDescricao("Soda");
                bebida.setPreco(10.00);
                bebida.setMl(500);
                sobremesa.setDescricao("Sorvete");
                sobremesa.setPreco(5.00);
                sobremesa.setTamanho("Grande");
                break;
            case 2:
                burguer.setDescricao("X-Picanha");
                burguer.setPreco(40.00);
                burguer.setGramas(250);
                bebida.setDescricao("Coca");
                bebida.setPreco(15.00);
                bebida.setMl(2000);
                sobremesa.setDescricao("Sorvete");
                sobremesa.setPreco(5.00);
                sobremesa.setTamanho("Grande");
                break;
            default:
                System.out.println("Digite 1 ou 2");
                break;
        }

    }

    @Override
    public String toString(){
        return "\n" +burguer.getDescricao() + "\t"
                + burguer.getGramas() + "\t"
                + burguer.getPreco() + "\t\n"
                + bebida.getDescricao() + "\t"
                + bebida.getMl() + "\t"
                + bebida.getPreco() + "\t\n"
                + sobremesa.getDescricao() + "\t"
                + sobremesa.getTamanho() + "\t"
                + sobremesa.getPreco() + "\t\n";
    }
}
