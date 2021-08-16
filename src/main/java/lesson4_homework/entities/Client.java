package lesson4_homework.entities;

public class Client {
    private String id;
    private String surname;
    private String accountId;
    float sum;

    public Client() {
    }

    public Client(String id, String surname, String accountId, float sum) {
        this.id = id;
        this.surname = surname;
        this.accountId = accountId;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", accountId='" + accountId + '\'' +
                ", sum=" + sum +
                '}';
    }
}
