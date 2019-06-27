package hello.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trapezi {
    @Id
    private String trapezi_id;

    private Boolean status;

    public Trapezi(String trapezi_id, Boolean status) {
        this.trapezi_id = trapezi_id;
        this.status = status;
    }

    public Trapezi() {
    }

    public String getTrapezi_id() {
        return trapezi_id;
    }

    public void setTrapezi_id(String trapezi_id) {
        this.trapezi_id = trapezi_id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
