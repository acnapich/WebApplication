package Network;
// Generated 02-Apr-2020 15:04:31 by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.Id;




/**
 * Nodes generated by hbm2java
 */
@Entity
public class Nodes  implements java.io.Serializable {

@Id
     private int id;
     private String ipaddress;
     private String nodename;
     private Integer lat;
     private Integer lon;

    public Nodes() {
    }

    public Nodes getNodes() {
        return this;
    }	
   
    public Nodes(int id, String ipaddress, String nodename) {
        this.id = id;
        this.ipaddress = ipaddress;
        this.nodename = nodename;
    }
    public Nodes(int id, String ipaddress, String nodename, Integer lat, Integer lon) {
       this.id = id;
       this.ipaddress = ipaddress;
       this.nodename = nodename;
       this.lat = lat;
       this.lon = lon;
       
      
       
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getIpaddress() {
        return this.ipaddress;
    }
    
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }
    public String getNodename() {
        return this.nodename;
    }
    
    public void setNodename(String nodename) {
        this.nodename = nodename;
    }
    public Integer getLat() {
        return this.lat;
    }
    
    public void setLat(Integer lat) {
        this.lat = lat;
    }
    public Integer getLon() {
        return this.lon;
    }
    
    public void setLon(Integer lon) {
        this.lon = lon;
    }




}


