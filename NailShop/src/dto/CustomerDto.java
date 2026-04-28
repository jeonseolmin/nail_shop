package dto;

import entity.Customer;

import java.util.Date;

public record CustomerDto(
        long customerId,
        String name,
        String phoneNumber,
        Date birthDate,
        long staffId,
        String text,
        String status
) {
    public static CustomerDto fromEntity(Customer customer) {
        return new CustomerDto(
                customer.getCustomerId(),
                customer.getName(),
                customer.getPhoneNumber(),
                customer.getBirthDate(),
                customer.getStaffId(),
                customer.getText(),
                customer.getStatus()
        );
    }

    public static Customer fromDto(CustomerDto customerDto) {
        return new Customer(
                customerDto.customerId(),
                customerDto.name(),
                customerDto.phoneNumber(),
                customerDto.birthDate(),
                customerDto.staffId(),
                customerDto.text(),
                customerDto.status()
        );
    }
}
