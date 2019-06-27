package hello.dtos;

public class Trapezi_dto {
    private String trapezi_id;
    private Boolean status;

    public Trapezi_dto(String trapezi_id, Boolean status) {
        this.trapezi_id = trapezi_id;
        this.status = status;
    }

    public Trapezi_dto() {
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
