package data;

import echec.Position;
import model.Piece;

public class Case {
	private Position position;
	private Piece piece;
	private String affichage;

	public Case(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public Piece getPiece() {
		return piece;
	}

	public String getAffichage() {
		return affichage;
	}

	public void setAffichage(String affichage) {
		this.affichage = affichage;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public void positionne(Piece p) {
		this.piece = p;
	}

	public void vider() {
		piece = null;
	}

	@Override
	public String toString() {
		return ("Case" + position + piece);
	}

}
