package company;

public class LegalEmployee extends Employee {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
