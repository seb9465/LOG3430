package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class BipartiIntAC {
	
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test c1
	 * V11V21E1 -> c1 = 		<{ v1 = -4 , v2 = -4 , e = -4 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V1E1() {
		int v1 = -4;
		int v2 = -4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
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
	 * Test c5
	 * V11V22E1 -> c5 = 		<{ v1 = -4 , v2 = 0 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V2E1() {
		int v1 = -4;
		int v2 = 0;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c8
	 * V11V22E4 -> c8 = 		<{ v1 = -4 , v2 = 0 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V2E4() {
		int v1 = -4;
		int v2 = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c9
	 * V11V23E1 -> c9 = 		<{ v1 = -4 , v2 = 4 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V3E1() {
		int v1 = -4;
		int v2 = 4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c12
	 * V11V23E4 -> c12 = 		<{ v1 = -4 , v2 = 4 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV1V3E4() {
		int v1 = -4;
		int v2 = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c13
	 * V12V21E1 -> c13 = 		<{ v1 = 0 , v2 = -4 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V1E1() {
		int v1 = 0;
		int v2 = -4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c16
	 * V12V21E4 -> c16 = 		<{ v1 = 0 , v2 = -4 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V1E4() {
		int v1 = 0;
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
	 * Test c18
	 * V12V22E2 -> c18 = 		<{ v1 = 0 , v2 = 0 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E2() {
		int v1 = 0;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c19
	 * V12V22E3 -> c19 = 		<{ v1 = 0 , v2 = 0 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E3() {
		int v1 = 0;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c20
	 * V12V22E4 -> c20 = 		<{ v1 = 0 , v2 = 0 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V2E4() {
		int v1 = 0;
		int v2 = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c21
	 * V12V23E1 -> c21 = 		<{ v1 = 0 , v2 = 4 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E1() {
		int v1 = 0;
		int v2 = 4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c22
	 * V12V23E2 -> c22 = 		<{ v1 = 0 , v2 = 4 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E2() {
		int v1 = 0;
		int v2 = 4;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c23
	 * V12V23E3 -> c23 = 		<{ v1 = 0 , v2 = 4 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E3() {
		int v1 = 0;
		int v2 = 4;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test c24
	 * V12V23E4 -> c24 = 		<{ v1 = 0 , v2 = 4 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV2V3E4() {
		int v1 = 0;
		int v2 = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c25
	 * V13V21E1 -> c25 = 		<{ v1 = 4 , v2 = -4 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V1E1() {
		int v1 = 4;
		int v2 = -4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c28
	 * V13V21E4 -> c28 = 		<{ v1 = 4 , v2 = -4 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V1E4() {
		int v1 = 4;
		int v2 = -4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c29
	 * V13V22E1 -> c29 = 		<{ v1 = 4 , v2 = 0 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E1() {
		int v1 = 4;
		int v2 = 0;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c30
	 * V13V22E2 -> c30 = 		<{ v1 = 4 , v2 = 0 , e = 0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E2() {
		int v1 = 4;
		int v2 = 0;
		int e = 0;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), e, "Expected " + e + " edges, got " + graphe.E() + " edges.");
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
	 * Test c32
	 * V13V22E4 -> c32 = 		<{ v1 = 4 , v2 = 0 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V2E4() {
		int v1 = 4;
		int v2 = 0;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}
	
	/**
	 * Test c33
	 * V13V23E1 -> c33 = 		<{ v1 = 4 , v2 = 4 , e = -4 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E1() {
		int v1 = 4;
		int v2 = 4;
		int e = -4;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
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
	
	/**
	 * Test c35
	 * V13V23E3 -> c35 = 		<{ v1 = 4 , v2 = 4 , e = 12 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E3() {
		int v1 = 4;
		int v2 = 4;
		int e = 12;
		graphe = GraphGenerator.bipartite(v1, v2, e);
		assertEquals(graphe.V(), v2 + v1, "Expected " + v2 + v1 + " vertices, got " + graphe.V() + " vertices.");
	}
	
	/**
	 * Test c36
	 * V13V23E4 -> c36 = 		<{ v1 = 4 , v2 = 4 , e = 20 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntIntV3V3E4() {
		int v1 = 4;
		int v2 = 4;
		int e = 20;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, e);
		});
	}

}
