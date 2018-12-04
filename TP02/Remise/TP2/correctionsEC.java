package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class correctionsEC {
	
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	@Test
	protected void grapheSimpleInt() {
		int v = 10;
		int e = 6;
		int maxEdges = v*(v-1)/2;
		
		graphe = GraphGenerator.simple(v, e);
		assertEquals(graphe.V(), v);
		assertTrue(graphe.E() <= maxEdges);
	}
	
	@Test
	protected void graphBipartiteInt() {
		int v1 = 4;
		int v2 = 4;
		int e = 3;
		int maxEdges = v1 + v2;
		
		graphe = GraphGenerator.bipartite(v1, v2, e);
		
		assertEquals(graphe.V(), v1 + v2);
		assertTrue(graphe.E() < maxEdges);
	}
}
