package it.polito.tdp.libretto.model;

import java.util.HashSet;
import java.util.Iterator;

public class Model {
	
	private HashSet<Esame> esami = null;
	
	public Model() {
		esami = new HashSet<Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia gia'
	 * @param e
	 * @return true se l'ha inserito, false se esisteva gia'
	 * e quindi non l'ha potuto inserire
	 */
	public boolean addEsame(Esame e) {
		
		if(!esami.contains(e)) {
			esami.add(e);
			return true ;
		} else {
			return false ;
		}
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice) {
		Esame e = new Esame(codice);
		if (esami.contains(e)){
			Iterator<Esame> it = esami.iterator();
			while(it.hasNext()){
				Esame tempEsame = it.next();
				if(tempEsame.equals(e)){
					return tempEsame;
				}
			}
		}
		return null;
	}

}
