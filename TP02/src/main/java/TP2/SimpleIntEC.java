package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class SimpleIntEC {

	Graph graphe;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test a4
	 * V1E4 -> a4 = 	<{ v = -4 , e = 20 } 	, { erreur }>
	 */
	@Test
	protected void grapheSimpleIntIntV1E4() {
		int v = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}

	/**
	 * Tests a7
	 * V2E3 -> a7 = 	<{ v = 0 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheSimpleIntIntV2E2() {
		int v = 0;
		int e = 0;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test a9
	 * V3E1 -> a9 = 	<{ v = 4 , e = -1 } 	, { erreur }>
	 */
	@Test
	protected void grapheSimpleIntIntV3E1() {
		int v = 4;
		int e = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.simple(v, e);
		});
	}
	
	/**
	 * Test a10
	 * V3E2 -> a10 = 	<{ v = 4 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheSimpleIntIntV3E2() {
		int v = 4;
		int e = 0;
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v, "Expected " + v + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
}
