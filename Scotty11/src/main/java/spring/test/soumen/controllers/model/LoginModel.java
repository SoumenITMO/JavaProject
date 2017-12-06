package spring.test.soumen.controllers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Table(name = "users")
public class LoginModel
{
   @Id
   @Column(name = "userid")
   private Integer uid;
   @Column(name = "email")
   private String mail_;
   @Column(name = "password")
   private String pwd_;
   @Column(name = "fname")
   private String FirstName;
   @Column(name = "lname")
   private String LastName;

   public Integer getUid() { return uid; }
   public void setUid(Integer uid) { this.uid = uid; }
   public String getMail_() { return mail_; }
   public void setMail_(String mail_) { this.mail_ = mail_; }
   public String getPwd_() { return pwd_; }
   public void setPwd_(String pwd_) { this.pwd_ = pwd_; }
   public String getFirstName() { return FirstName; }
   public void setFirstName(String firstName) { FirstName = firstName; }
   public String getLastName() { return LastName; }
   public void setLastName(String lastName) { LastName = lastName; }
}
