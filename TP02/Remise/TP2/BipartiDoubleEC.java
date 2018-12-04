package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class BipartiDoubleEC {

	Graph graphe;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test d10
	 * V11V22P5 -> d10 = 	<{ v1 = -4 , v2 = 0 , p = 1.5 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V2P5() {
		int v1 = -4;
		int v2 = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d29
	 * V12V23P4 -> d29 = 	<{ v1 = 0 , v2 = 4 , p = 1.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P4() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 1.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d31
	 * V13V21P1 -> d31 = 	<{ v1 = 4 , v2 = -4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V1P1() {
		// Arrange
		int v1 = 4;
		int v2 = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d42
	 * V13V23P2 -> d42 = 	<{ v1 = 4 , v2 = 4 , p = 0.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P2() {
		// Arrange
		int v1 = 4;
		int v2 = 4;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1 + v2, "Expected " + (v1 + v2) + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d43
	 * V13V23P3 -> d43 = 	<{ v1 = 4 , v2 = 4 , p = 0.5 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P3() {
		// Arrange
		int v1 = 4;
		int v2 = 4;
		double p = 0.5;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1 + v2, "Expected " + (v1 + v2) + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected less then" + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
}
