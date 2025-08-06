package com.srm.currency.mapper;

import com.srm.currency.entity.Kingdom;
import com.srm.currency.model.generated.KingdomSimpleOpenApiDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KingdomMapper {
    KingdomSimpleOpenApiDto toKingdomSimple(Kingdom kingdom);

    List<KingdomSimpleOpenApiDto> toListKingdomSimple(List<Kingdom> kingdoms);
}
