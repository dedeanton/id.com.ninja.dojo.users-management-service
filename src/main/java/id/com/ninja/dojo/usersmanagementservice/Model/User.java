package id.com.ninja.dojo.usersmanagementservice.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TBLM_USER",schema="PUBLIC")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "UserName")
    private String UserName;

    @Column(name = "RoleId")
    private int RoleId;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Password")
    private String Password;

    @Column(name = "CreateBy")
    private String CreateBy;

    @Column(name = "CreateDate")
    private Date CreateDate;

    @Column(name = "UpdateBy")
    private String UpdateBy;

    @Column(name = "UpdateDate")
    private Date UpdateDate;

    @Column(name = "status")
    private int Status;


    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String updateBy) {
        UpdateBy = updateBy;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }
    
    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public void setUpdateDate(Date updateDate) {
    }
}
