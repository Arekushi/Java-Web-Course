package company;

public abstract class Person {
    private String address;
    private String name;
    private String cpf;
    private String email;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected void setEmail(String email) {
        this.email = email;
    }
}
