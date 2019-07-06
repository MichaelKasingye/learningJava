

package webtime;

import java.text.DateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "webTimeBean")
public class WebTimeBean {

    
    public String getTime() {
        return DateFormat.getTimeInstance(DateFormat.LONG).format(new Date());
    }
    
}
