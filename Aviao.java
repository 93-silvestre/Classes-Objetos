package br.com.generation.classes.objetos;

public class Aviao {
	
	
	String nome;
	String voo;
	int destino;
    int numpassaporte = 0;
    int horas;
    		
    		void viagem() {
	
     if(numpassaporte == 1 && destino == 2 ) {
	   System.out.println("Passageiro(a): " + nome + "\nSeu voo com destino: S�o Paulo  \nSa�ra as 18:00");
   
   
	}
     else if(numpassaporte == 2 && destino == 1) {
  	   System.out.println("Sr(a) Passageiro(a): " + nome + " \nSeu voo com destino: Rio de Janeiro  \nSa�ra as 8:00");

    }
     else {
    	 System.out.println(" Sr(a) Passageiro:" + nome + ". Voc� perdeu o voo !!" );
     }
}
}

