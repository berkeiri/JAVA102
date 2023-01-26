package InsuranceManagementSystem;

class Individual extends Account {
    public Individual(User user) {
        super(user);
    }

    @Override
    void addInsurancePolicy() {
        // Bireysel müşteri için uygulanacak kar marjı uygulanır
        // ve sigorta poliçesi eklenir
    }
}