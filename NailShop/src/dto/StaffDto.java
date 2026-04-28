package dto;

import entity.Staff;

import java.util.Date;

public record StaffDto(
        long staffId,
        String name,
        String phoneNumber,
        String employmentStatus,
        Date hireDate,
        Date resignDate,
        int baseSalary
) {

    public static StaffDto fromEntity(Staff staff){
        return  new StaffDto(
                staff.getStaffId(),
                staff.getName(),
                staff.getPhoneNumber(),
                staff.getEmploymentStatus(),
                staff.getHireDate(),
                staff.getResignDate(),
                staff.getBaseSalary()
        );
    }

    public static Staff fromDto(StaffDto staffDto){
        return new Staff(
                staffDto.staffId(),
                staffDto.name(),
                staffDto.phoneNumber(),
                staffDto.employmentStatus(),
                staffDto.hireDate(),
                staffDto.resignDate(),
                staffDto.baseSalary()
        );
    }
}
