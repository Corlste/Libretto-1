package it.polito.tdp.libretto.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Model {
	
	private HashMap<String, Esame> esami = null;
	
	public Model() {
		esami = new HashMap<String, Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia gi�
	 * @param e
	 * @return true se l'ha inserito, false se esisteva gi� e quindi non l'ha potuto inserire
	 */
	public boolean addEsame(Esame e) {
		
		if(!esami.containsKey(e.getCodice())) {
			esami.put(e.getCodice(), e);
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
		return esami.get(codice);
	}

}
