/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import java.io.FileNotFoundException;
import static java.lang.Math.log;
import static java.lang.StrictMath.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import net.sf.gilead.core.hibernate.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.ReturningWork;
import org.hibernate.jpa.internal.EntityManagerImpl;




/**
 *
 * @author acnapich
 */
@Stateless
@Named("ni")

public class NodeInfo {

   public static String getNodeById_old(Integer id) throws FileNotFoundException, SQLException{
       try {
            String url = "jdbc:derby://localhost:1527/Network";
            Connection conn = DriverManager.getConnection(url,"root","root");
            Statement stmt = (Statement) conn.createStatement();
            
            ResultSet rs;
 
            rs = stmt.executeQuery("SELECT ipaddress from nodes where ID="+id);
            while ( rs.next() ) {
                String address = rs.getString("ipaddress");
                return address;
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
       return "NA";
    }
   
        @PersistenceContext(unitName = "WebApplicationPU")    
        public static String getNodeById(Integer id) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplicationPU");
            EntityManager em = emf.createEntityManager();   
            
            Nodes mynode = em.find(Nodes.class, id);
            
            return mynode.getIpaddress();
        }           
}   

