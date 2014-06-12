package pizzashop;



import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LoginData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String account;
     
    @Persistent
    private String pass;
     

    @Persistent
    private Date datetime;
 
    public LoginData(String account, String pass, Date datetime) {
        super();
        this.account = account;
        this.pass = pass;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getAccount() {
        return account;
    }
 
    public void setAccount(String account) {
        this.account = account;
    }
 
    public String getPass() {
        return pass;
    }
 
    public void setPass(String pass){
        this.pass = pass;  
        		}
 
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
