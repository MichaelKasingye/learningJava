
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "validationBean")
public class ValidationBean implements Serializable{

private String name;
private String email;
private String  phone;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public String getEmail() {
        return email;
    } 
    public void setEmail(String email) {
        this.email = email;
    }  
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getResult(){
    if( name != null && email =!null && phone !=null){
        return "<p> stlye=\"backgroung-color:yellow;width:200px;"+
                "padding:5px\">name"+ getName()+"<br> email:"+getEmail()+
                        "<br/> phone:"+getPhone() +"</p>";
    } else{
        return " ";}
    }

    
    
}
