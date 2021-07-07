package br.com.generation.classes.objetos;

public class Exercicio1TestaCliente {

	public static void main(String[] args) {
	
		Cliente c1 = new Cliente();
			
			c1.codigo = 1;
			c1.nome = "Sandra";
			c1.cidade = " São Paulo";
			c1.endereco = " Rua Xavier";
			c1.email = "sandra.generation@gmail.com";
			c1.telefone = 1199829082;
			
			c1.cadastro();
			System.out.println("Codigo do novo cliente cadastrado :" + c1.codigo);
			System.out.println("Nome do cliente :" + c1.nome);
			System.out.println("Endereço:" + c1.endereco + " Cidade:" + c1.cidade);
			System.out.println("Contatos:" + c1.telefone + " | " + c1.email);
			
					
		}

	}


