package model;

import java.util.List;

import echec.Position;

interface Mouvement {

	List<Position> getMouvementPossible();

}
