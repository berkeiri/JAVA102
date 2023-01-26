package InsuranceManagementSystem;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {
    private int accountNumber;
    private User user;
    private AuthenticationStatus authStatus;

    private ArrayList<Insurance> insurances;
    abstract void addInsurancePolicy();
    public int compareTo(Account o) {
        return Integer.compare(this.accountNumber, o.accountNumber);
    }
    public Account(User user){
        this.user=user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        return accountNumber == other.accountNumber;
    }


    public AuthenticationStatus getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(AuthenticationStatus authStatus) {
        this.authStatus = authStatus;
    }

    enum AuthenticationStatus {
        SUCCESS, FAIL
    }
    public boolean login(String email, String password) throws InvalidAuthenticationException {
        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            authStatus = AuthenticationStatus.SUCCESS;
            return true;
        } else {
            authStatus = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid email or password");
        }
    }

    public void addInsurance(Insurance insurance) {
        this.insurances.add(insurance);
    }
    public double getTotalCost() {
        double total = 0;
        for (Insurance insurance : this.insurances) {
            total += insurance.calculate();
        }
        return total;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void showUserInfo() {
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Job: " + user.getJob());
        System.out.println("Age: " + user.getAge());
        System.out.println("Last Login: " + user.getLastLogin());
        System.out.println("Addresses: " + user.getAddresses());
    }
    public abstract static class Insurance {
        protected String name;
        protected double cost;
        protected Date startDate;
        protected Date endDate;

        public Insurance(String name, double cost, Date startDate, Date endDate) {
            this.name = name;
            this.cost = cost;
            this.startDate = startDate;
            this.endDate = endDate;
        }


        public abstract double calculate();
    }


    static class HealthInsurance extends Insurance {
        public HealthInsurance(String name, double cost, Date startDate, Date endDate) {
            super(name, cost, startDate, endDate);
        }

        @Override
        public double calculate() {
            return this.cost;
        }
    }

    static class ResidenceInsurance extends Insurance {
        public ResidenceInsurance(String name, double cost, Date startDate, Date endDate) {
            super(name, cost, startDate, endDate);
        }

        @Override
        public double calculate() {
            return this.cost;
        }
    }

    static class TravelInsurance extends Insurance {
        public TravelInsurance(String name, double cost, Date startDate, Date endDate) {
            super(name, cost, startDate, endDate);
        }

        @Override
        public double calculate() {
            return this.cost;
        }
    }

    static class CarInsurance extends Insurance {
        public CarInsurance(String name, double cost, Date startDate, Date endDate) {
            super(name, cost, startDate, endDate);
        }

        @Override
        public double calculate() {
            return this.cost;
        }

    }


    public static class User {
        private String name;
        private String surName;
        private String email;
        private String pass;
        private String job;
        private int age;
        private ArrayList<Address> addresses;
        private Date lastLogin;
        public User(String name,String surName, String email,String pass,String job, int age,ArrayList<Address> addresses,Date lastLogin){
            this.name=name;
            this.surName=surName;
            this.email=email;
            this.pass=pass;
            this.job=job;
            this.age=age;
            this.addresses=addresses;
            this.lastLogin=lastLogin;

        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public ArrayList<Address> getAddresses() {
            return addresses;
        }

        public void setAddresses(ArrayList<Address> addresses) {
            this.addresses = addresses;
        }

        public Date getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(Date lastLogin) {
            this.lastLogin = lastLogin;
        }

        public void showUserInfo() {
            System.out.println("Name: " + this.getName());
            System.out.println("Surname: " + this.getSurName());
            System.out.println("Email: " + this.getEmail());
            System.out.println("Job: " + this.getJob());
            System.out.println("Age: " + this.getAge());
            System.out.println("Last Login: " + this.getLastLogin());
            System.out.println("Addresses: " + this.getAddresses());
        }

        public String getPassword() {
            return getPassword();
        }
    }



}


