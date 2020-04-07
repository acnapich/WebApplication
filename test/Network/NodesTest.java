/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acnapich
 */
public class NodesTest {
    
    public NodesTest() {
    }


    

    /**
     * Test of setNodename method, of class Nodes.
     */
    @Test
    public void testSetGetNodename() {
        System.out.println("set&getNodename");
        String nodename = "PROVA";
        Nodes instance = new Nodes();
        instance.setNodename(nodename);
        // TODO review the generated test code and remove the default call to fail.
        String verifica = instance.getNodename();
        assertEquals(nodename, verifica);
        if (!nodename.equals(verifica)) {
            fail("The test case is a prototype.");
        }
        
    }

    
}
