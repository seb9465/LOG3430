package TP5;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.LinkedList;
import main.LinkedListInterface;
import main.MyList;
import main.MyList.Elem;
import main.MyListInterface;
import main.Operator;

public class TP5 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * ===================================== Linked List =====================================
	 * Petite note simplement pour dire que le coverage n'est pas de 100% pour cette classe
	 * puisqu'il faudrait definir un nouveau operateur dans l'enum Operator. Il en manquerait 
	 * un ne faisant pas partie du switch/case pour tester le cas par defaut.
	 * Permet, du meme coup, de tester la classe SetCalculator.
	 */
	
	/**
	 * Linked list, methode build avec l'operateur union.
	 */
	@Test
	public void test1() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr2.add(4);
		
		resultatListe = list.build(Operator.UNION, arr1, arr2);
		
		int tailleListe = resultatListe.getSize();
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("L'union devrait avoir creer un tableau de deux elements.", 2, resultatListe.getAt(tailleListe-1).size());
		assertEquals("L'union devrait avoir creer un tableau avec l'element 1.", 1, resultatListe.getAt(tailleListe-1).get(0));
		assertEquals("L'union devrait avoir creer un tableau avec l'element 4.", 4, resultatListe.getAt(tailleListe-1).get(1));
	}
	
	/**
	 * Linked list, methode build avec l'operateur union.
	 */
	@Test
	public void test18() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr1.add(1);
		arr2.add(4);
		arr2.add(1);
		
		resultatListe = list.build(Operator.UNION, arr1, arr2);
		
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("L'union devrait avoir creer un tableau de 2 elements en position 0.", 2, resultatListe.getAt(0).size());
		assertEquals("L'union devrait avoir creer un tableau de 2 elements en position 1.", 2, resultatListe.getAt(1).size());
		assertEquals("L'union devrait avoir creer un tableau de 3 elements en position 2.", 3, resultatListe.getAt(2).size());
	}
	
	/**
	 * Linked list, methode build avec operateur intersection
	 */
	@Test
	public void test2() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr1.add(1);
		arr2.add(4);
		arr2.add(1);
		
		resultatListe = list.build(Operator.INTERSECTION, arr1, arr2);
		
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("L'intersection devrait avoir creer un tableau de 2 elements en position 0.", 2, resultatListe.getAt(0).size());
		assertEquals("L'intersection devrait avoir creer un tableau de 2 elements en position 1.", 2, resultatListe.getAt(1).size());
		assertEquals("L'intersection devrait avoir creer un tableau de 2 elements en position 2.", 2, resultatListe.getAt(2).size());
	}

	/**
	 * Linked list, methode build avec operateur difference
	 */
	@Test
	public void test3() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr2.add(4);
		
		resultatListe = list.build(Operator.DIFFERENCE, arr1, arr2);
		int tailleListe = resultatListe.getSize();
		
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("La difference devrait avoir creer un tableau de 1 element.", 1, resultatListe.getAt(tailleListe - 1).size());
		assertEquals("La difference devrait avoir creer un tableau avec l'element 1.", 1, resultatListe.getAt(tailleListe-1).get(0));
	}
	
	/**
	 * Linked list, methode build avec operateur symetrique difference
	 */
	@Test
	public void test4() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr2.add(4);
		
		resultatListe = list.build(Operator.SYMMETRIC_DIFFERENCE, arr1, arr2);
		int tailleListe = resultatListe.getSize();
		
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("La difference symetrique devrait avoir creer un tableau de 2 elements.", 2, resultatListe.getAt(tailleListe - 1).size());
		assertEquals("La difference symetrique devrait avoir creer un tableau avec l'element 1.", 1, resultatListe.getAt(tailleListe-1).get(0));
		assertEquals("La difference symetrique devrait avoir creer un tableau avec l'element 4.", 4, resultatListe.getAt(tailleListe-1).get(1));
	}
	
	/**
	 * Linked list, methode build avec operateur is_subset
	 */
	@Test
	public void test5() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr2.add(4);
		
		resultatListe = list.build(Operator.IS_SUBSET, arr1, arr2);
		int tailleListe = resultatListe.getSize();
		
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("Le is_subset devrait avoir creer un tableau de 1 element.", 1, resultatListe.getAt(tailleListe - 1).size());
		assertEquals("Le is_subset devrait avoir creer un tableau avec l'element FALSE.", "false", resultatListe.getAt(tailleListe-1).get(0));
	}
	
	/**
	 * Linked list, methode build avec operateur is_superset
	 */
	@Test
	public void test6() throws IOException {
		LinkedListInterface list = new LinkedList();
		MyListInterface resultatListe;
		ArrayList<Object> arr1 = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr1.add(1);
		arr2.add(4);
		
		resultatListe = list.build(Operator.IS_SUPERSET, arr1, arr2);
		int tailleListe = resultatListe.getSize();
		
		assertEquals("La liste resultante devrait avoir une longueur de 3.", 3, resultatListe.getSize());
		assertEquals("Le is_superset devrait avoir creer un tableau de 1 element.", 1, resultatListe.getAt(tailleListe - 1).size());
		assertEquals("Le is_superset devrait avoir creer un tableau avec l'element FALSE.", "false", resultatListe.getAt(tailleListe-1).get(0));
	}
	
	/**
	 * ===================================== My List =====================================
	 */
	
	/**
	 * MyList, methodes add, getSize, getAt, setAt
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test7() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		ArrayList<Object> unArray2 = new ArrayList<Object>();
		unArray2.add(3);
		unArray2.add(4);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		
		assertEquals("La liste MyList devrait avoir une taille de 1.", 1, uneListe.getSize());
		assertEquals("La liste devrait contenir une liste de 3 elements.", 3, uneListe.getAt(0).size());
		
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.setAt(unArray2, 3);
		assertEquals("La liste MyList devrait avoir une taille de 4.", 4, uneListe.getSize());
		assertEquals("La liste devrait contenir une liste de 2 elements.", 2, uneListe.getAt(3).size());
		
		uneListe.getAt(uneListe.getSize() + 1); // Lance une erreur.
	}
	
	/**
	 * MyList, methode removeAt
	 */
	@Test()
	public void test8() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		
		assertEquals("La liste MyList devrait avoir une taille de 1.", 1, uneListe.getSize());
		assertEquals("La liste devrait contenir une liste de 3 elements.", 3, uneListe.getAt(0).size());
		
		uneListe.removeAt(0);
		assertEquals("La liste MyList devrait avoir une taille de 0.", 0, uneListe.getSize());
	}
	
	/**
	 * MyList, methode removeItem
	 */
	@Test()
	public void test9() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		ArrayList<Object> unArray2 = new ArrayList<Object>();
		unArray2.add(3);
		unArray2.add(4);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		uneListe.add(unArray2);
		
		assertEquals("La liste MyList devrait avoir une taille de 2.", 2, uneListe.getSize());
		assertEquals("La liste devrait contenir une liste de 3 elements a la position 0.", 3, uneListe.getAt(0).size());
		assertEquals("La liste devrait contenir une liste de 2 elements a la position 1.", 2, uneListe.getAt(1).size());
		
		uneListe.removeItem(unArray);
		
		assertEquals("La liste MyList devrait avoir une taille de 1.", 1, uneListe.getSize());
		assertEquals("La liste devrait contenir une liste de 2 elements a la position 0.", 2, uneListe.getAt(0).size());
		
		uneListe.removeItem(unArray2);
		
		assertEquals("La liste MyList devrait avoir une taille de 0.", 0, uneListe.getSize());
		
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.add(unArray2);
		uneListe.removeItem(unArray2);
		assertEquals("La liste MyList devrait avoir une taille de 2.", 2, uneListe.getSize());
	}
	
	/**
	 * MyList, methode setSize
	 */
	@Test()
	public void test10() throws IOException {
		MyList uneListe = new MyList();
		
		assertEquals("La taille devrait etre de 0.", 0, uneListe.getSize());
		
		uneListe.setSize(10);
		
		assertEquals("La taille devrait etre de 10.", 10, uneListe.getSize() - 1);
	}
	
	/**
	 * MyList, methode reset
	 */
	@Test()
	public void test11() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		ArrayList<Object> unArray2 = new ArrayList<Object>();
		unArray2.add(3);
		unArray2.add(4);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		uneListe.add(unArray2);
		
		assertEquals("La liste MyList devrait avoir une taille de 2.", 2, uneListe.getSize());
		assertEquals("La liste devrait contenir une liste de 3 elements a la position 0.", 3, uneListe.getAt(0).size());
		assertEquals("La liste devrait contenir une liste de 2 elements a la position 1.", 2, uneListe.getAt(1).size());
		
		uneListe.reset();
		
		assertEquals("La liste devrait avoir une taille de 0.", 0, uneListe.getSize());
		assertNull("L'attribut start devrait etre null.", uneListe.getStart());
		assertNull("L'attribut current devrait etre null.", uneListe.getCurrent());
	}
	
	/**
	 * MyList, methode removeAt, avec un index trop eleve passe en parametre.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test12() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		
		uneListe.removeAt(2); // Lance une erreur.
	}
	
	/**
	 * MyList, methode removeAt avec un index superieur a 2 passe en parametre.
	 */
	@Test()
	public void test13() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.add(unArray);
		
		uneListe.removeAt(3); // Lance une erreur.
	}
	
	/**
	 * MyList, methode setAt, avec une position incorrecte.
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test14() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		ArrayList<Object> unArray2 = new ArrayList<Object>();
		unArray2.add(3);
		unArray2.add(4);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		
		uneListe.setAt(unArray2, uneListe.getSize() + 1); // Lance une erreur.
	}
	
	/**
	 * MyList, methode setCurrent
	 */
	@Test()
	public void test15() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		MyList uneListe = new MyList();
		uneListe.setCurrent(uneListe.new Elem(unArray, null));

		assertEquals("Le current devrait contenir le tableau ci-dessus.", unArray, uneListe.getCurrent().getContent());
	}
	
	/**
	 * MyList, methode setStart
	 * On fixe l'attribut start et on verifie que c'est bel et bien la bonne valeur qui
	 * a ete attribue a l'attribut.
	 */
	@Test()
	public void test16() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		MyList uneListe = new MyList();
		uneListe.setStart(uneListe.new Elem(unArray, null));

		assertEquals("Le current devrait contenir le tableau ci-dessus.", unArray, uneListe.getStart().getContent());
	}
	
	/**
	 * MyList, methode removeItem. Devrait ici lancer une exception puisque si on n'entre pas
	 * dans la boucle du else de la fonction removeItem (ligne 102), on ex�cute immediatement
	 * la ligne 109 mais la variable toRemove ne contient rien. Alors une erreur est lancee.
	 */
	@Test(expected = NullPointerException.class)
	public void test17() throws IOException {
		ArrayList<Object> unArray = new ArrayList<Object>();
		unArray.add(0);
		unArray.add(1);
		unArray.add(2);
		
		ArrayList<Object> unArray2 = new ArrayList<Object>();
		unArray2.add(3);
		unArray2.add(4);
		
		MyList uneListe = new MyList();
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.add(unArray2);
		uneListe.add(unArray);
		uneListe.add(unArray);
		uneListe.setStart(null);

		uneListe.removeItem(unArray2);	// Lance une erreur.
	}
	
	/**
	 * ===================================== Linked List =====================================
	 */
}
