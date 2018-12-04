package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class RegularEC {
	
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test e1
	 * V1K1 -> e1 =	<{ v = -1, k = -1 }	, { erreur }>
	 */
	@Test
	protected void grapheRegularV1K1() {
		// Arrange
		int v = -1;
		int k = -1;
		
		// Assert
		assertThrows(IllegalArgumentException.class, () -> {
			// Act
			graphe = GraphGenerator.regular(v, k);
		});
	}
	
	/**
	 * Test e6
	 * V2K3 -> e6 =	<{ v = 4, k = 5 }	, { grapheOK }>
	 */
	@Test
	protected void grapheRegularV2K3() {
		// Arrange
		int v = 4;
		int k = 5;
		int maxEdges = v * k;
		
		// Act
		graphe = GraphGenerator.regular(v, k);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test e8
	 * V3K2 -> e8 =	<{ v = 5, k = 2 }	, { grapheOK }>
	 */
	@Test
	protected void grapheRegularV3K2() {
		// Arrange
		int v = 5;
		int k = 2;
		int maxEdges = v * k;
		
		// Act
		graphe = GraphGenerator.regular(v, k);
		
		// Assert
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
}
