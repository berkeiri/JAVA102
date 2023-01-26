package InsuranceManagementSystem;

public class AdressManager {
    public static void addAddress(Account.User user, Address address) {
        user.getAddresses().add(address);
    }

    public static void removeAddress(Account.User user, Address address) {
        user.getAddresses().remove(address);
    }
    public static class HomeAddress implements Address {
        private String address;

        public HomeAddress(String address) {
            this.address = address;
        }

        @Override
        public String getAddress() {
            return address;
        }

        @Override
        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String getAddressType() {
            return "Home";
        }


    }

    // BusinessAddress class
    public static class BusinessAddress implements Address {
        private String address;

        public BusinessAddress(String address) {
            this.address = address;

        }

        @Override
        public String getAddress() {
            return address;
        }

        @Override
        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String getAddressType() {
            return "Business";
        }


    }
}
