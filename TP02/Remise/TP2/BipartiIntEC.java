package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class BipartiIntEC {
	
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test c4
	 * V11V21E4 -> c4 = 		<{ v1 = -4 , v2 = -4 , e = 20 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V1E4() {
		int v1 = -4;
		int v2 = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c17
	 * V12V22E1 -> c17 = 		<{ v1 = 0 , v2 = 0 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E1() {
		int v1 = 0;
		int v2 = 0;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c31
	 * V13V22E3 -> c31 = 		<{ v1 = 4 , v2 = 0 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E3() {
		int v1 = 4;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c34
	 * V13V23E2 -> c34 = 		<{ v1 = 4 , v2 = 4 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E2() {
		int v1 = 4;
		int v2 = 4;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2 + v1, "Expected " + v2 + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
}
