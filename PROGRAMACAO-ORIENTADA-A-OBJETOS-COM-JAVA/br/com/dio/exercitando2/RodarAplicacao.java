package br.com.dio.exercitando2;

class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); //Possibilidade de subir classe, pois os dados que combinam são transferidos e o que não combina permanece na classe filha
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //Erro na descida de classe devido diversas informações da classe mãe não estarem presentes na classe filha


    
    }
    
}
