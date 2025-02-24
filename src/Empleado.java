public class Empleado {
    private String identificationn;
    private String fullname;
    private String position;
    private String email;
    private String phonenumber;
    private String datehired;
    //Constructor
    public Empleado(String identificationn, String fullname, String position, String email, String phonenumber, String datehired ) {
        this.identificationn = identificationn;
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.datehired = datehired;
    }

    public void setIdentificationn(String identificationn) {
        this.identificationn = identificationn;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setDatehired(String datehired) {
        this.datehired = datehired;
    }

    public String getIdentificationn() {
        return identificationn;
    }
    public String getFullname() {
        return fullname;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getPhonenumber() {
        return phonenumber;
    }

    public String getDatehired() {
        return datehired;
    }

    @Override
    public String toString() {
        return "Identificacion:" + identificationn + "\n" +
                "Nombre completo:" + fullname + "\n" +
                "Posicion:" + position + "\n" +
                "Email:" + email + "\n" +
                "Numero de telefono:" + phonenumber + "\n" +
                "Fecha de contratacion:" + datehired;
    }


}
