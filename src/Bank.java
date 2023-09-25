public class Bank {
    private String userName;
    private int password;
    private int totalMoney;





    public int getTotalMoney() {
        return totalMoney;
    }



    public Bank(String userName, int password, int totalMoney) {
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;


    }
    public void payment(String name, int sum) {
        if (userName.equals(name)) {

            System.out.println((getTotalMoney() - sum));
        }

    }

    public void credit(String name, int sum){
        if(userName.equals(name)){
            System.out.println((getTotalMoney()+sum));
        }
    }



    @Override
    public String toString() {
        return "Bank{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", totalMoney=" + totalMoney +
                '}';
    }
}

