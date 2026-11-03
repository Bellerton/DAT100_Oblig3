package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledig;

	public Blogg() {
		
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {

		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int funnetid = -1;
		for (int i = 0; i < this.innleggtabell.length; i++){
			if (this.innleggtabell[i] != null && this.innleggtabell[i].erLik(innlegg)){
				funnetid = i;
				break;
			}
		}
		return funnetid;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean finnes = false;
		for (Innlegg a : this.innleggtabell){
			if (a != null && a.erLik(innlegg)){
				finnes = true;
				break;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {

		boolean ledig = false;
		if (this.innleggtabell[this.innleggtabell.length -1] == null){
			ledig = true;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean lagttil = false;
		if (!finnes(innlegg) && ledigPlass()){
			this.innleggtabell[this.nesteledig] = innlegg;
			this.nesteledig += 1;
			lagttil = true;
		}
		return lagttil;
	}
	
	public String toString() {
		
		String tekstreturn = "";
		tekstreturn += nesteledig + "\n";
		for(Innlegg a : this.innleggtabell){
			tekstreturn += a.toString();
		}
		return tekstreturn;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}