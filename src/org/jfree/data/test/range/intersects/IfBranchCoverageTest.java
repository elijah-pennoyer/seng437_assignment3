package org.jfree.data.test.range.intersects;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class IfBranchCoverageTest {
	
	private Range r;
	
	/**
	 *	Creates an Range from -5.0 to 5.0.
	 */
	
	@Before
	public void setup() { r = new Range(-5.0, 5.0); }

	/**
	 * Test Plan Coverage: intersect test which covers the "if" branch
	 * Test Strategy Coverage: Given range has lower<=this.lower
	 * Description: Tests the intersect function when presented with a range such that the "lower<=this.lower" condition is true.
	 * This causes the "if" branch to be taken.
	 * Expected Output: True
	 * Assumptions: N/A
	 */
	@Test
	public void intersects_IfBranch_Test() {
		assertTrue("Testing \"if\" branch of intersects. Expect true.", r.intersects(-6.0, 4) );
	}

}
