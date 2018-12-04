package TP2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.GraphGenerator;

class BipartiDoubleAC {
	
	Graph graphe;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		graphe = null;
	}

	/**
	 * Test d1
	 * V11V21P1 -> d1 = 	<{ v1 = -4 , v2 = -4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V1P1() {
		int v1 = -4;
		int v2 = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d5
	 * V11V21P5 -> d5 = 	<{ v1 = -4 , v2 = -4 , p = 1.5 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V1P5() {
		int v1 = -4;
		int v2 = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d6
	 * V11V22P1 -> d6 = 	<{ v1 = -4 , v2 = 0 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V2P1() {
		int v1 = -4;
		int v2 = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
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
	 * Test d11
	 * V11V23P1 -> d11 = 	<{ v1 = -4 , v2 = 4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V3P1() {
		int v1 = -4;
		int v2 = 4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d15
	 * V11V23P5 -> d15 = 	<{ v1 = -4 , v2 = 4 , p = 1.5 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV1V3P5() {
		int v1 = -4;
		int v2 = 4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d16
	 * V12V21P1 -> d16 = 	<{ v1 = 0 , v2 = -4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V1P1() {
		int v1 = 0;
		int v2 = -4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d20
	 * V12V21P5 -> d20 = 	<{ v1 = 0 , v2 = -4 , p = 1.5 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V1P5() {
		int v1 = 0;
		int v2 = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d21
	 * V12V22P1 -> d21 = 	<{ v1 = 0 , v2 = 0 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P1() {
		int v1 = 0;
		int v2 = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d22
	 * V12V22P2 -> d22 = 	<{ v1 = 0 , v2 = 0 , p = 0.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P2() {
		// Arrange
		int v1 = 0;
		int v2 = 0;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d23
	 * V12V22P3 -> d23 = 	<{ v1 = 0 , v2 = 0 , p = 0.5 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P3() {
		// Arrange
		int v1 = 0;
		int v2 = 0;
		double p = 0.5;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
				
		// Assert
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d24
	 * V12V22P4 -> d24 = 	<{ v1 = 0 , v2 = 0 , p = 1.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P4() {
		// Arrange
		int v1 = 0;
		int v2 = 0;
		double p = 1.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
				
		// Assert
		assertEquals(graphe.V(), 0, "Expected " + 0 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d25
	 * V12V22P5 -> d25 = 	<{ v1 = 0 , v2 = 0 , p = 1.5 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V2P5() {
		int v1 = 0;
		int v2 = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d26
	 * V12V23P1 -> d26 = 	<{ v1 = 0 , v2 = 4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P1() {
		int v1 = 0;
		int v2 = 4;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d27
	 * V12V23P2 -> d27 = 	<{ v1 = 0 , v2 = 4 , p = 0.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P2() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d28
	 * V12V23P3 -> d28 = 	<{ v1 = 0 , v2 = 4 , p = 0.5 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P3() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 0.5;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v2, "Expected " + v2 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
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
	 * Test d30
	 * V12V23P5 -> d30 = 	<{ v1 = 0 , v2 = 4 , p = 1.5 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV2V3P5() {
		// Arrange
		int v1 = 0;
		int v2 = 4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
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
	 * Test d35
	 * V13V21P5 -> d35 = 	<{ v1 = 4 , v2 = -4 , p = 1.5 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V1P5() {
		int v1 = 4;
		int v2 = -4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d36
	 * V13V22P1 -> d36 = 	<{ v1 = 4 , v2 = 0 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P1() {
		int v1 = 4;
		int v2 = 0;
		double p = -1.0;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d37
	 * V13V22P2 -> d37 = 	<{ v1 = 4 , v2 = 0 , p = 0.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P2() {
		// Arrange
		int v1 = 4;
		int v2 = 0;
		double p = 0.0;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), 0, "Expected " + 0 + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d38
	 * V13V22P3 -> d38 = 	<{ v1 = 4 , v2 = 0 , p = 0.5 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P3() {
		// Arrange
		int v1 = 4;
		int v2 = 0;
		double p = 0.5;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertTrue(graphe.E() <= maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d39
	 * V13V22P4 -> d39 = 	<{ v1 = 4 , v2 = 0 , p = 1.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P4() {
		// Arrange
		int v1 = 4;
		int v2 = 0;
		double p = 1.0;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1, "Expected " + v1 + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d40
	 * V13V22P5 -> d40 = 	<{ v1 = 4 , v2 = 0 , p = 1.5 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V2P5() {
		int v1 = 4;
		int v2 = 0;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
	
	/**
	 * Test d41
	 * V13V23P1 -> d41 = 	<{ v1 = 4 , v2 = 4 , p = -1.0 } 	, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P1() {
		int v1 = 4;
		int v2 = 4;
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
	
	/**
	 * Test d44
	 * V13V23P4 -> d44 = 	<{ v1 = 4 , v2 = 4 , p = 1.0 } 		, { grapheOK }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P4() {
		// Arrange
		int v1 = 4;
		int v2 = 4;
		double p = 1.0;
		int maxEdges = v1 * v2;
		
		// Act
		graphe = GraphGenerator.bipartite(v1, v2, p);
		
		// Assert
		assertEquals(graphe.V(), v1 + v2, "Expected " + (v1 + v2) + " vertices, got " + graphe.V() + " vertices.");
		assertEquals(graphe.E(), maxEdges, "Expected " + maxEdges + " edges, got " + graphe.E() + " edges.");
	}
	
	/**
	 * Test d45
	 * V13V23P4 -> d45 = 	<{ v1 = 4 , v2 = 4 , p = 1.5 } 		, { erreur }>
	 */
	@Test
	protected void grapheBipartiIntIntDoubleV3V3P5() {
		int v1 = 4;
		int v2 = 4;
		double p = 1.5;
		assertThrows(IllegalArgumentException.class, () -> {
			graphe = GraphGenerator.bipartite(v1, v2, p);
		});
	}
}
