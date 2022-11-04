package model;

import java.util.ArrayList;
import java.util.List;

import echec.Couleur;
import echec.Position;

public class Tour extends Piece {

	private boolean _1erTour;

	public Tour(int x, int y, Couleur c) {
		super(x, y, c);
		_1erTour = true;
	}

	public Tour(int x, int y, Couleur c, boolean b) {
		super(x, y, c, b);
		_1erTour = b;
	}

	@Override
	public List<Position> getMouvementPossible() {

		List<Position> mouvementPossible = new ArrayList<Position>();

		int x = position.getX();
		int y = position.getY();
		Position temp = new Position(x, y);

		for (int c = 1; c < 8; c++) {
			temp.setX(x + c);
			temp.setY(y);
			if (temp.inBounds() && !this.bloqueAmi(temp)) {
				mouvementPossible.add(temp.clone());
				if (this.bloqueEnnemi(temp))
					break;
			} else
				break;
		}
		for (int c = 1; c < 8; c++) {
			temp.setX(x - c);
			temp.setY(y);
			if (temp.inBounds() && !this.bloqueAmi(temp)) {
				mouvementPossible.add(temp.clone());
				if (this.bloqueEnnemi(temp))
					break;
			} else
				break;
		}
		for (int c = 1; c < 8; c++) {
			temp.setX(x);
			temp.setY(y + c);
			if (temp.inBounds() && !this.bloqueAmi(temp)) {
				mouvementPossible.add(temp.clone());
				if (this.bloqueEnnemi(temp))
					break;
			} else
				break;
		}
		for (int c = 1; c < 8; c++) {
			temp.setX(x);
			temp.setY(y - c);
			if (temp.inBounds() && !this.bloqueAmi(temp)) {
				mouvementPossible.add(temp.clone());
				if (this.bloqueEnnemi(temp))
					break;
			} else
				break;
		}

		return mouvementPossible;
	}

	@Override
	public String toString() {

		return "[Tour " + super.position.getX() + "," + super.position.getY() + "]";
	}

}
