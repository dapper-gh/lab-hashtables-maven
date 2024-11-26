package edu.grinnell.csc207;

<<<<<<< HEAD
=======
import edu.grinnell.csc207.util.ChainedHashTable;

>>>>>>> 4529bb57aa296bd3a2c418755f21f1e32385f71a
import org.junit.jupiter.api.BeforeEach;
import edu.grinnell.csc207.util.ChainedHashTable;

/**
 * Tests of chained hash tables.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class TestChainedHashTables extends TestSimpleMaps {
  /**
   * Set up the string map.
   */
  @BeforeEach
  public void setupChainedHashTableTests() {
    stringMap = new ChainedHashTable<String,String>();
    runIteratorTests = false;
  } // setupChainedHashTableTests()
} // class TestChainedHashTables
