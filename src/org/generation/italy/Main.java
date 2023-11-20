package org.generation.italy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
	
        HashMap <String,Integer> punteggio = new HashMap<>();
		punteggio.put("Juve",0);
		punteggio.put("Inter",0);
		punteggio.put("Milan",0);
		punteggio.put("Catania",0);
		punteggio.put("Roma",0);

       ArrayList<String> partite= new ArrayList<>();
       ArrayList<Integer> punteggioCasa= new ArrayList<>();
       ArrayList<Integer> punteggioFuoricasa= new ArrayList<>();
       String squadra1, squadra2, risposta;
       int punteggio1, punteggio2, i;
       
       
       do {
       System.out.println("inserisci una partita");
         System.out.println("quali squadre giocano?");
         squadra1=sc.nextLine();  //sc.nextLine in caso di stringhe
         squadra2=sc.nextLine();
        if (!punteggio.containsKey(squadra2) || !punteggio.containsKey(squadra2) ) {
         
        	System.out.println("la squadra inserita non è valida");
        }	
        	partite.add(squadra1+"-"+squadra2);
         
         System.out.println("inserisci il punteggio");
         punteggio1=Integer.parseInt(sc.nextLine());    //per gli int meglio mettere parseInt
         punteggio2=Integer.parseInt(sc.nextLine());
         if(punteggio1>punteggio2) {
        	punteggio.put(squadra1,punteggio.get(squadra1)+3);
         }
         else if(punteggio1<punteggio2) {
        	punteggio.put(squadra2,punteggio.get(squadra2)+3);
         }
         else if(punteggio1==punteggio2) {
         	punteggio.put(squadra1,punteggio.get(squadra1)+1);
         	punteggio.put(squadra2,punteggio.get(squadra2)+1);
            
         }

        
        punteggioCasa.add(punteggio1);
        punteggioFuoricasa.add(punteggio2);
        
         
         System.out.println("vuoi inserire un'altra partita? (si/no)");
         risposta=sc.nextLine();
         
       }while(risposta.equals("si"));
       
       System.out.println("classifica:");
       ArrayList <String> prova = new ArrayList<>(punteggio.keySet()); //arraylist che contiene l'hash map e lo ordina per chiave 
       Collections.sort(prova);
       for (String s:prova) {
    	   System.out.println(s);
       }
       for(String t:punteggio.keySet()) {
        System.out.println(t + "   " + punteggio.get(t)+ " " + "punti");
       }  
        
       
	
	     } 
	} 
	 


