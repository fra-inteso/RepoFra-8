package personal.exercise;

import java.util.Scanner;

public class Esercizio1Cl {

	public static void main(String[] args) {
		
		double orario;
		String giorno = "";
		String messAperto = "Troverai il nostro negozio aperto";
		String messChiuso = "All'orario scelto il nostro negozio sarà chiuso";
		
		Scanner Scanner = new Scanner (System.in);
		
		//per scrivere velocemente System.out.println ==>> scrivere syso e poi ctrl + spazio;
		
		System.out.println("Benvenuti da GreenGarden, indica il giorno di visita");
		giorno = Scanner.nextLine();
		
		
		
		if (!(giorno.equalsIgnoreCase("lunedi") || giorno.equalsIgnoreCase("martedi") || giorno.equalsIgnoreCase("mercoledi") || 
			giorno.equalsIgnoreCase("giovedi") || giorno.equalsIgnoreCase("venerdi") || giorno.equalsIgnoreCase("sabato") || giorno.equalsIgnoreCase("domenica")))
		{
		System.out.println("Il giorno inserito non è valido coglione");
		}
		else 
		{
			System.out.println("Inserisci l'orario di visita");
		    orario = Double.parseDouble(Scanner.nextLine());
		    
		    if(!(orario >= 0 && orario <= 23))
		    {
		    	System.out.println("Orario non valido deficiente");
		    }
		    else
		    {
		    	if ((giorno.equalsIgnoreCase("lunedi") || giorno.equalsIgnoreCase("martedi") ||
		    		giorno.equalsIgnoreCase("mercoledi") || giorno.equalsIgnoreCase("giovedi") ||
		    		giorno.equalsIgnoreCase("venerdi")) && (orario >= 9 && orario <=13 || orario >= 15 && orario <= 19))
		    	{
		    		System.out.println(messAperto);
		    	}
		    	else if ((giorno.equalsIgnoreCase("sabato") || giorno.equalsIgnoreCase("domenica")) && (orario >= 10 && orario <= 13))
		    	{
		    		System.out.println(messAperto);
		    	}
		    	else
		    	{
		    		System.out.println(messChiuso);
		    	}
		    	
		    }
		    
		}
		
		
		
		Scanner.close();
	}

}
