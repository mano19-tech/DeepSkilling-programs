public class CustomerRepositoryImpl implements CustomerRepository {

    public String findCustomerById(int customerId) {

        return "Customer #" + customerId + " - vishva";
    }
}
