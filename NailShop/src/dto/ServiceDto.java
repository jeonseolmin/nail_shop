package dto;

import entity.Service;

public record ServiceDto(
        long serviceId,
        String serviceName,
        int nonMemberPrice,
        int memberPrice,
        int durationMinutes,
        boolean isActive
) {
    public static ServiceDto fromEntity(Service service){
        return new ServiceDto(
                service.getServiceId(),
                service.getServiceName(),
                service.getNonMemberPrice(),
                service.getMemberPrice(),
                service.getDurationMinutes(),
                service.isActive()
        );
    }
    public static Service fromDto(ServiceDto serviceDto){
        return new Service(
                serviceDto.serviceId(),
                serviceDto.serviceName(),
                serviceDto.nonMemberPrice(),
                serviceDto.memberPrice(),
                serviceDto.durationMinutes(),
                serviceDto.isActive()
        );
    }
}
