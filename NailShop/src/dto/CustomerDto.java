package dto;

import entity.Customer;

import java.time.LocalDate;

public record CustomerDto(
        long customerId,
        String name,
        String phoneNumber,
        LocalDate birthDate,
        LocalDate firstVisitDate,
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
                customer.getFirstVisitDate(),
                customer.getStaffId(),
                customer.getNotes(),
                customer.getStatus()
        );
    }

    public static Customer fromDto(CustomerDto customerDto) {
        return new Customer(
                customerDto.customerId(),
                customerDto.name(),
                customerDto.phoneNumber(),
                customerDto.birthDate(),
                customerDto.firstVisitDate(),
                customerDto.staffId(),
                customerDto.text(),
                customerDto.status()
        );
    }
}
