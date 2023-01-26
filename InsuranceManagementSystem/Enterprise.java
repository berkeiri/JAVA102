package InsuranceManagementSystem;

class Enterprise extends Account {
    public Enterprise(User user) {
        super(user);
    }

    @Override
    void addInsurancePolicy() {
        // Kurumsal müşteri için uygulanacak kar marjı uygulanır
        // ve sigorta poliçesi eklenir
    }
}
